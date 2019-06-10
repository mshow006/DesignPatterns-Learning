package headfirst._03decorator.internal;

import java.io.*;

/**
 * @author yingming006
 * Date: 2019/6/10
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        // 设置 FileInputStream, 先用 BufferedInputStream 装饰它，
        // 再用 LowerCaseInputStream 装饰
        try (InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream("src/headfirst/_03decorator/internal/test.txt")))) {
            while ((c = in.read()) >= 0) {
                // System.out.print(c + " ");
                System.out.print((char) c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
