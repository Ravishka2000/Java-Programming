package Question4;

public abstract class Students {

    IFestival iFestival;
    IPrograms iPrograms;

    public void setFestival(IFestival iFestival) {
        this.iFestival = iFestival;
    }

    public void setPrograms(IPrograms iPrograms) {
        this.iPrograms = iPrograms;
    }

    public void offerPrograms(){
        iPrograms.offerPrograms();
    }

    public void conductEvent(){
        iFestival.performEvent();
    }

    public abstract void displayStudents();
    public abstract void displayCost();

}
