package graphic._03templatemethod;

/**
 * 传入 Hello, World.
 * 输出：
 * +-------------+
 * |Hello, World.|
 * +-------------+
 *
 * @author Liu Yingming on 2019/6/3
 */
public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length; // 以字节为单位计算出的字符串长度
        // this.width = string.length();
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
