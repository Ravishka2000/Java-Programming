package Question1;

public abstract class Student {

    protected String name;
    protected String address;
    protected char sex;
    protected int bornYear;
    protected String specialization;
    protected int[] marks = new int[5];

    public String generateID() throws IDInvalidException {

        String id = null;
        try {
            int num = ((int) (Math.random()*9000)+1000);
            String num1 = String.valueOf(num);
            id = "IT".concat(num1);
            if (id.charAt(0) != 'I' || id.charAt(1) != 'T' || id.length() < 4) {
                throw new IDInvalidException("Invalid ID");
            }
        } catch (IDInvalidException e) {
            e.printStackTrace();
        }

        return id;
    }

    public abstract void addMark(int m1,int m2,int m3,int m4,int m5);
    public abstract void showDetails();
}
