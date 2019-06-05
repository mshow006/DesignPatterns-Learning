package _08abstractfactory.listfactory;

import _08abstractfactory.factory.Item;
import _08abstractfactory.factory.Page;

/**
 * @author yingming006
 * Date: 2019/6/5
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<html><head><title>").append(title).append("</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>").append(title).append("</h1>\n");
        buffer.append("<ul>\n");
        for (Object obj : content) {
            Item item = (Item) obj;
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>").append(author).append("</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
