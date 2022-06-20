package lec03;

import java.util.HashMap;

public class Quiz1 {
    public static void main(String[] args) {
        System.out.println("점수의 평균값을 구하시오.");
        HashMap<String, Integer> score = new HashMap<>(3);
        score.put("국어", 80);
        score.put("영어", 75);
        score.put("수학", 55);

        for (String i : score.keySet()) {
            System.out.println("[과목]" + i + " [점수]" + score.get(i));
        }

        //quiz1
        int num = score.size();
        int sum = 0;
        for (String i : score.keySet()) {
            sum += score.get(i);
        }
        System.out.print("평균값: " + (sum / num));
    }
}
