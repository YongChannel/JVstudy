package lec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        //quiz6
        System.out.println("리스트 [1, 3, 5, 4, 2] 를 [5 ,4, 3, 2, 1] 로 변환");
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        System.out.println(myList);
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);

        ArrayList<Integer> subList = new ArrayList<>(4);
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        for (int i = 0; i < 4; i++) {
            int s = sc.nextInt();
            subList.add(s);
        }
        System.out.println(subList);
        subList.sort(Comparator.naturalOrder());
        System.out.println(subList);
    }
}
