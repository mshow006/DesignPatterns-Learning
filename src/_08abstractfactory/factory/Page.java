package _08abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * @author yingming006
 * Date: 2019/6/5
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        String filename = title + ".html";
        try (Writer writer = new FileWriter(filename)) {
            writer.write(this.makeHTML());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(filename + "完成");
    }

    protected abstract String makeHTML();
}
