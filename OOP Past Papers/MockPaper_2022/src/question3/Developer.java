package question3;


public class Developer {
    public static void main(String[] args) {
        IDE ide = new IDE();
        Receiver intendedreceiver = new Receiver();

        System.out.println("Pressed save Button!");

        SaveAction saveAction = new SaveAction(intendedreceiver);
        ide.setAction(saveAction);
        ide.ExecuteAction();

        System.out.println("Pressed save All Button!");

        SaveAllAction saveAllAction = new SaveAllAction(intendedreceiver);
        ide.setAction(saveAllAction);
        ide.ExecuteAction();
    }
}
