package headfirst_design_pattern.demo01.duckbehavior;

/**
 * 鸭子叫声实现类
 * 静音
 *
 * @author yingming006
 * Date: 2019/6/6
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
