package question3;

public class SaveAllAction implements Command{

    Receiver receiver;

    public SaveAllAction(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.saveAll();
    }
}
