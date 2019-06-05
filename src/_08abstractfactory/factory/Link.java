package _08abstractfactory.factory;

/**
 * @author yingming006
 * Date: 2019/6/5
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
