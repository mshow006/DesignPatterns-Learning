package cn.yingming006.adapter.practice;

import java.io.IOException;

/**
 * @author Liu Yingming on 2019/5/31
 */
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("src\\cn\\yingming006\\adapter\\practice\\file.txt");
            f.setValue("year", "2019");
            f.setValue("month", "5");
            f.setValue("day", "31");
            f.wirteToFile("src\\cn\\yingming006\\adapter\\practice\\newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
