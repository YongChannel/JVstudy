package car;

import car.sub.Car;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car("yongCar");
        car.ready();
        car.goStraight();
        car.turnLeft();
        car.goStraight();
        car.turnRight();
        car.goStraight();
        car.stop();
    }
}
