package graphic._08abstractfactory.factory;

import java.util.ArrayList;

/**
 * @author yingming006
 * Date: 2019/6/5
 */
public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item){
        tray.add(item);
    }
}
