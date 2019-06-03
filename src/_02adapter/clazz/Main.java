package _02adapter.clazz;

/**
 * 类适配器模式
 * 使用继承的适配器
 * 使用 Print 接口（即调用 printWeak() 和 printStrong()）来进行编程
 * 对于 Main 类，Banner类，showWithParen() 和 showWithAster() 完全被隐藏
 * 就好比手机在 9V 电压下就可以充电，不需要知道 9V 的电压是由充电器（适配器）将 220V 电压转换来的
 *
 * @author Liu Yingming on 2019/5/31
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("clazz _02adapter:");
        // 使用多态，使用 Print 接口中的方法，而不是 PrintBanner 类中的方法
        // 使用 PrintBanner 类中的方法 ((PrintBanner)p).method();
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
