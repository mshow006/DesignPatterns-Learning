package headfirst._06command;

/**
 * @author yingming006
 * Date: 2019/6/11
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
