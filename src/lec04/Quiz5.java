package lec04;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz5 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>(Arrays.asList(70, 60, 55, 75, 95, 90, 80, 80, 85, 100));
        System.out.println("for each 문을 사용해 학급 평균 점수 계산");

        int sum = 0;
        int size = marks.size();
        for (int mark : marks) {
            sum += mark;
        }
        System.out.println("평균점수: " + (double) sum / size);
    }
}
