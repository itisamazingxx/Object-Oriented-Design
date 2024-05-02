
public class Enumeration_java {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        Season winter = Season.WINTER;
        // 调用枚举类的方法
        System.out.println(spring.name());
        // 从0开始编号 返回枚举对象的次序 可以用ordinal()做比较
        System.out.println(spring.ordinal()); // 输出0
        System.out.println(winter.ordinal()); // 输出1
        System.out.println(winter.compareTo(spring));

        // 含有枚举类的全部对象
        Season[] seasons = Season.values();
        // 增强for循环
        for (Season season : seasons) {
            System.out.println(season);
        }

        Season spring2 = Season.valueOf("SPRING");
        System.out.println(spring2);
    }
}

/**
 * Enumeration演示
 */
enum Season {
    // 如果用Enum类实现枚举, 常量对象要写在最前面
    SPRING("spring", "warm"),
    WINTER("winter", "cold");

    private String name;
    private String description;

    private Season(String name, String description) {

    }
}

enum Gender {
    // 这里默认调用了Gender的无参构造器
    FEMALE,
    MALE;
}
