package pl.michalregulski.springdemo;

public class DemoApplication {
    public static void main(String... args) {
        var singleton = SingletonClass.getInstance();
        var singleton2 = SingletonClass.getInstance();
        System.out.println(singleton.equals(singleton2));
    }
}
