package pl.michalregulski.springdemo;

public class DemoApplication {
    public static void main(String... args) {
        Engine v8Engine = new V8Engine();
        Engine v12Engine = new V12Engine();
        var rover = new Car("Rover", v8Engine);
        var ferrari = new Car("Ferrari", v12Engine);
        rover.startEngine();
        ferrari.startEngine();
    }
}
