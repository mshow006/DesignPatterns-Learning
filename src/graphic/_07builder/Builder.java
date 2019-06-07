package graphic._07builder;

/**
 * 编写文档的方法的抽象类
 *
 * @author yingming006
 * Date: 2019/6/4
 */
public abstract class Builder {
    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();

}
