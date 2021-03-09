package pl.michalregulski.springdemo;

public class Car {
    private final String manufacturer;
    private final Engine engine;

    public Car(String manufacturer, Engine engine) {
        this.manufacturer = manufacturer;
        this.engine = engine;
    }

    public void startEngine() {
        System.out.println(manufacturer + " makes:");
        engine.start();
    }
}
