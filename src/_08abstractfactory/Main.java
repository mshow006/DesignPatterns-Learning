package _08abstractfactory;

import _08abstractfactory.factory.Factory;
import _08abstractfactory.factory.Link;
import _08abstractfactory.factory.Page;
import _08abstractfactory.factory.Tray;

/**
 * @author yingming006
 * Date: 2019/6/5
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("ListFactory");

        Link people = factory.createLink("人民日报", "http://123.com");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);

        Page page = factory.createPage("LinkPage", "author");
        page.add(traynews);
        page.output();
    }
}
