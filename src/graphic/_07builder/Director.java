package graphic._07builder;

/**
 * @author yingming006
 * Date: 2019/6/4
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("from am to pm");
        builder.makeItems(new String[]{
                "Good morning",
                "Good afternoon"
        });
        builder.makeString("night");
        builder.makeItems(new String[]{
                "Good evening",
                "Good night",
                "Goodbye"
        });
        builder.close();
    }
}
