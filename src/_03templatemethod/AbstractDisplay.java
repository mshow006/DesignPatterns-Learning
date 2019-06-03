package _03templatemethod;

/**
 * 模板方法中的父类
 *
 * @author Liu Yingming on 2019/6/3
 */
public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    // 使用 final 修饰，不可被重写
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
