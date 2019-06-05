package _08abstractfactory.listfactory;

import _08abstractfactory.factory.Factory;
import _08abstractfactory.factory.Link;
import _08abstractfactory.factory.Page;
import _08abstractfactory.factory.Tray;

/**
 * @author yingming006
 * Date: 2019/6/5
 */
public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
