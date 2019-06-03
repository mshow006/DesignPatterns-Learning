package _03templatemethod;

/**
 * 假设传入字符 H, 输出 <<HHHHHH>>
 *
 * @author Liu Yingming on 2019/6/3
 */
public class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
