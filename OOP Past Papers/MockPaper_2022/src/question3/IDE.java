package question3;

public class IDE {
    Command command;

    public void setAction(Command command) {
        this.command = command;
    }

    public void ExecuteAction() {
        command.execute();
    }
}
