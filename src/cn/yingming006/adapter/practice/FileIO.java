package cn.yingming006.adapter.practice;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Liu Yingming on 2019/5/31
 */
public interface FileIO {
    void readFromFile(String filename) throws IOException;

    void wirteToFile(String filename) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);
}
