package test;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("숫자입력: ");
        int num = sc.nextInt();

        System.out.println(num + "! 결과값: " + fac(num));
    }

    public static int fac(int data) {
//		int result = 1;
//		while (data > 0) {
//			result *= data;
//			data--;
//		}
//		return result;

        if (data == 1) {
            return 1;
        } else {
            return data * fac(data - 1);
        }
    }
}
