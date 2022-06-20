package car.sub;

class Accelerator {
    String name;

    Accelerator(String carName) {
        this.name = carName;
    }

    void push() {
        System.out.println(String.format("%s가 앞으로 갑니다.", name));
    }

    void back() {
        System.out.println(String.format("%s가 멈추었습니다.", name));
    }
}
