package singleton;

/**
 * 饿汉式 - 线程不安全
 *
 * @author Liu Yingming on 2019/5/16
 */
public class Singleton {
    //在类内部实例化一个实例
    private static Singleton instance = new Singleton();

    //私有的构造函数,外部无法访问
    private Singleton() {
    }

    //对外提供获取实例的静态方法
    public static Singleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton simpleSingleton1 = Singleton.getInstance();
        Singleton simpleSingleton2 = Singleton.getInstance();
        System.out.println(simpleSingleton1 == simpleSingleton2); // true
    }
}
