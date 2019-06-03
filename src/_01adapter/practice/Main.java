package _01adapter.practice;

import java.io.IOException;

/**
 * Properties 类可以管理文件中的键值对（属性）
 *
 * @author Liu Yingming on 2019/5/31
 */
public class Main {
    public static void main(String[] args) {
        // 使用 FileIO 接口里的方法
        FileIO f = new FileProperties();
        try {
            f.readFromFile("src\\cn\\yingming006\\_01adapter\\practice\\file.txt");
            // f.setValue("year", "2019");
            f.setValue("month", "5");
            f.setValue("day", "31");
            f.writeToFile("src\\cn\\yingming006\\_01adapter\\practice\\newFile.txt");
            System.out.println(f.getValue("day"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
