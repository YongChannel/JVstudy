package lec03;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        //quiz2
        System.out.println("자연수 13이 홀수인지 짝수인지 판별");
        int num = 13;
        String rel = (num % 2 == 1) ? "홀수" : "짝수";
        System.out.println(rel);

        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int num2 = sc.nextInt();
        String rel2 = (num2 % 2 == 1) ? "홀수" : "짝수";
        System.out.println(rel2);
    }
}
