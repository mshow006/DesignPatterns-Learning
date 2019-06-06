package graphic_design_pattern._08abstractfactory.factory;

/**
 * @author yingming006
 * Date: 2019/6/5
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
