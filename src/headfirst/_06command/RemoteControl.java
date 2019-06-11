package headfirst._06command;

import java.util.Arrays;

/**
 * @author yingming006
 * Date: 2019/6/11
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[8];

        Command noCommand = new NoCommand();
        Arrays.fill(onCommands, noCommand);
        Arrays.fill(offCommands, noCommand);
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        return "\n====== Remote Control ======\n" +
                "RemoteControl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}
