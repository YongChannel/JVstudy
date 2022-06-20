package lec05;

class Calculator5 {
    Integer value;
//    public Calculator5() {
//        this.value = 0;
//    }
    void add(int val) {
        this.value += val;
    }
    public Integer getValue() {
        return this.value;
    }
}

public class Quiz6 {
    public static void main(String[] args) {
        Calculator5 cal = new Calculator5();
        cal.add(3);
        System.out.println(cal.getValue());
    }
}
//NullPointerException 오류 발생
//생성자를 생성하고 초기값을 설정
//Integer 자료형은 값을 대입하지 않을 경우 null이기 때문에 값을 더하지 못함