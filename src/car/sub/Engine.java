package car.sub;

class Engine {
    String name;
    boolean isStarted = false;

    Engine(String carName) {
        this.name = carName;
    }

    void start() {
        if (isStarted) {
            System.out.println(String.format("%s는 이미 시동이 걸려있습니다.", name));
        }
        isStarted = true;
        System.out.println(String.format("%s의 시동을 걸었습니다.", name));
    }

    void turnOff() {
        if (!isStarted) {
            System.out.println(String.format("%s는 이미 시동이 꺼져있습니다.", name));
        }
        isStarted = false;
        System.out.println(String.format("%s의 시동을 껐습니다.", name));
    }
}
