package headfirst._06command;

/**
 * @author yingming006
 * Date: 2019/6/11
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
