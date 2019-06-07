package graphic._08abstractfactory.listfactory;

import graphic._08abstractfactory.factory.Link;

/**
 * @author yingming006
 * Date: 2019/6/5
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
