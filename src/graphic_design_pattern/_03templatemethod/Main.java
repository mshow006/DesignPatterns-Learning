package graphic_design_pattern._03templatemethod;

/**
 * @author Liu Yingming on 2019/6/3
 */
public class Main {
    public static void main(String[] args) {
        // 多态
        AbstractDisplay display1 = new CharDisplay('H');
        AbstractDisplay display2 = new StringDisplay("Hello,world.");
        AbstractDisplay display3 = new StringDisplay("你好，世界。");
        display1.display();
        display2.display();
        display3.display();


        String string = "你好，世界。";
        System.out.println(string.getBytes().length); // 18 字节长度
        System.out.println(string.length()); // 6 中文字数
    }
}
