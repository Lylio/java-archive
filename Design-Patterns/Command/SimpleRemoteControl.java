public class SimpleRemoteControl {

    Command button;

    public SimpleRemoteControl(){}

    public void setCommand(Command command) {
        button = command;
    }

    public void buttonWasPressed() {
        button.execute();
    }
}

