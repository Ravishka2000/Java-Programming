package question4;

public class AlienPack {
    Alien[] alien;

    public AlienPack(int size) {
        alien = new Alien[size];
    }

    public void addAlien(Alien alien,int index){
        this.alien[index] = alien;
    }

    public Alien[] getAliens() {
        return alien;
    }
}
