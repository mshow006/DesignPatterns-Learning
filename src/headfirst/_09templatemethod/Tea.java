package headfirst._09templatemethod;

/**
 * 泡茶
 *
 * @author yingming006
 * Date: 2019/6/12
 */
public class Tea extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
