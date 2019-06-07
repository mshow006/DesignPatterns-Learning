package graphic._07builder;

/**
 * 使用纯文本编写文档，并以 String 返回结果
 *
 * @author yingming006
 * Date: 2019/6/4
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("=======================\n");
        buffer.append("「").append(title).append("」");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('■').append(str).append("\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            buffer.append("  ·").append(item).append("\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("=======================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
