package lec05;

class Calculator3 {
    int value;
    Calculator3() {
        this.value = 0;
    }
    boolean isOdd(int val) {
        return val % 2 == 1;
    }
}

public class Quiz3 {
    public static void main(String[] args) {
        Calculator3 ioc = new Calculator3();
        System.out.println(ioc.isOdd(13));
        System.out.println(ioc.isOdd(12));
    }
}
