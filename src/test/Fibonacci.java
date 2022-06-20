package test;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("숫자입력: ");
        int num = sc.nextInt();

        System.out.println(num + "번째 fibo값: " + fibo(num));
    }

    public static int fibo(int data) {
        int[] arr = new int[data + 1];
        arr[0] = 1;
        arr[1] = 1;

        if (data == 1 || data == 2) {
            return 1;
        } else {
            int result = fibo(data - 1) + fibo(data - 2);
            return result;
        }
    }
}
