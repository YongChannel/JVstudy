package lec03;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz7 {
    public static void main(String[] args) {
        //quiz7
        System.out.println("리스트 ['Life', 'is', 'too', 'short'] 를 'Lift is too short' 로 변환");
        ArrayList<String>text = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String subtext = String.join(" ", text);
        System.out.println(subtext);
    }
}
