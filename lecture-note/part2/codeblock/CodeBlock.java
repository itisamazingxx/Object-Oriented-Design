/**
 * This class represhent 代码块的应用
 */
public class CodeBlock {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Hello voco");
        Movie movie2 = new Movie("AW", 5.4);

        DD d1 = new DD();
        DD d2 = new DD();

        // 如果只是使用静态成员，普通代码块并不会执行（static代码块会）
        System.out.println(Movie.city);
    }
    
}

class DD {
    // 静态代码块只在首次类加载时执行一次
    // 静态代码块是属于类的 而不是类的某个特定对象实例
    static {
        System.out.println("static code block");
    }
}

class Movie {
    private String name;
    private Double price;
    private String director;

    public static String city = "Seattle";

    static {
        System.out.println("static code block for movie");
    }

    // 非静态代码块在每次创建类的实例时都会执行(而不是类加载)
    // 非静态代码块可以用来执行所有实例共通必须进行的初始化操作
    {
        System.out.println("Open the monitor");
        System.out.println("The movie is playing");
    }

    // Overloading
    public Movie(String name) {

    }

    public Movie(String name, Double price) {

    }

    public Movie(String name, Double price, String director) {

    }
}
