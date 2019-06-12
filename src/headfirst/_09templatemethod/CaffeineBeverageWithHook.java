package headfirst._09templatemethod;

/**
 * 模板方法
 * 定义了一个算法的步骤，并允许子类为一个或多个步骤提供实现
 *
 * @author yingming006
 * Date: 2019/6/12
 */
public abstract class CaffeineBeverageWithHook {

    // 模板方法
    // final 子类不可以覆盖
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // 由子类实现
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring int cap");
    }

    // 钩子（Hook）
    // 有子类决定是否覆盖，若不覆盖，使用默认方法
    boolean customerWantsCondiments() {
        return true;
    }
}
