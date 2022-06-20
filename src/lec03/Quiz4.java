package lec03;

import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        //quiz4
        System.out.println("주민등록번호 성별을 나타내는 숫자 출력");
        String pin = "123123-1234123";
        System.out.println(pin.charAt(7));

        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        String pin2 = sc.nextLine();
        String gender2 = (pin2.charAt(7)) == '1' ? "남성" : "여성";
        System.out.println(gender2);
    }
}