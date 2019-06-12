package headfirst._09templatemethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author yingming006
 * Date: 2019/6/12
 */
public class BeverageTest {
    public static void main(String[] args) {
        System.out.println("making tea...");
        Tea myTea = new Tea();
        myTea.prepareRecipe();

        System.out.println("\nmaking coffee...");
        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        coffeeHook.prepareRecipe();

        HashMap<Integer, String> hashMap = new HashMap<>();
        Iterator iterator = hashMap.values().iterator();
        iterator = hashMap.keySet().iterator();


    }
}
