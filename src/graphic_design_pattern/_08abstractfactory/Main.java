package graphic_design_pattern._08abstractfactory;

import graphic_design_pattern._08abstractfactory.factory.Factory;
import graphic_design_pattern._08abstractfactory.factory.Link;
import graphic_design_pattern._08abstractfactory.factory.Page;
import graphic_design_pattern._08abstractfactory.factory.Tray;

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
