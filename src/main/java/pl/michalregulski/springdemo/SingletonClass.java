package pl.michalregulski.springdemo;

public class SingletonClass {
    private static SingletonClass SINGLE_INSTANCE = null;

    // private constructor to make it not possible to accidentally call it from outside of the class
    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (SINGLE_INSTANCE == null) {
            synchronized (SingletonClass.class) {
                SINGLE_INSTANCE = new SingletonClass();
            }
        }
        return SINGLE_INSTANCE;
    }

}
