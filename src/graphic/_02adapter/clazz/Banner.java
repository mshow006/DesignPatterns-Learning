package graphic._02adapter.clazz;

/**
 * 广告横幅
 *
 * @author Liu Yingming on 2019/5/31
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
