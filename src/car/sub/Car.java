package car.sub;

public class Car {
    String name;
    Accelerator accelerator;
    Engine engine;
    Handle handle;
    Wheel wheel;

    public Car(String name) {
        this.name = name;
        this.accelerator = new Accelerator(name);
        this.engine = new Engine(name);
        this.handle = new Handle();
        this.wheel = new Wheel("바퀴");
    }

    public void ready() {
        engine.start();
    }

    public void stop() {
        accelerator.back();
        engine.turnOff();
    }

    public void goStraight() {
        accelerator.push();
        wheel.go();
    }

    public void turnLeft() {
        handle.left();
    }

    public void turnRight() {
        handle.right();
    }
}
