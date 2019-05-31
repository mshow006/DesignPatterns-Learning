package cn.yingming006.singleton;

/**
 * @author Liu Yingming on 2019/5/16
 */
class EnumSingletonTest{
    private String name;

}
public enum EnumSingleton {
    INSTANT;
    private Singleton singleton;

    public Singleton getName() {
        return singleton;
    }

    public void setName(String name) {
    }

    public static void main(String[] args) {
        EnumSingleton firstSingleton = EnumSingleton.INSTANT;
        firstSingleton.setName("firstName");
        System.out.println(firstSingleton.getName());
        EnumSingleton secondSingleton = EnumSingleton.INSTANT;
        secondSingleton.setName("secondName");
        System.out.println(firstSingleton.getName());
        System.out.println(secondSingleton.getName());
        EnumSingleton thirdSingleton = EnumSingleton.INSTANT;
        thirdSingleton.setName("thirdName");
        System.out.println(thirdSingleton.getName());

        try {
            EnumSingleton[] enumSingletons = EnumSingleton.class.getEnumConstants();
            for (EnumSingleton enumSingleton : enumSingletons) {
                System.out.println(enumSingleton.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
