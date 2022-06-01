package question3;

public class SaveAction implements Command {

    Receiver receiver;

    public SaveAction(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.save();
    }
}
