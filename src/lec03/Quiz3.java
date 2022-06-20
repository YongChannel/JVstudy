package lec03;

public class Quiz3 {
    public static void main(String[] args) {
        //qiuz3
        System.out.println("주민등록번호 앞부분과 뒷부분 나누어 출력");
        String pin = "123123-1234123";
        String year = pin.substring(0, 6);
        String gender = pin.substring(7);

        System.out.println(pin);
        System.out.println(year);
        System.out.println(gender);
    }
}
