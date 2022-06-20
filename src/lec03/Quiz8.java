package lec03;

import java.util.HashMap;

public class Quiz8 {
    public static void main(String[] args) {
        //quiz8
        System.out.println("grade에서 'B'값 추출 후 제거");
        HashMap<String, Integer>grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        System.out.println(grade.keySet());
        System.out.println(grade.values());
        System.out.println("제거: " + grade.remove("B"));

        for(String i : grade.keySet()) {
            System.out.println("[학생]" + i + " [점수]" + grade.get(i));
        }
    }
}
