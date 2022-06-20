package lec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Quiz9 {
    public static void main(String[] args) {
        //quiz9
        System.out.println("리스트 중복 숫자 제거");
        ArrayList<Integer>numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3 ,4, 4, 5));
        HashSet<Integer>temp = new HashSet<>(numbers);
        ArrayList<Integer>subnumbers = new ArrayList<>(temp);
        System.out.println(subnumbers);
        //리스트 자료형이 집합 자료형으로 변환 되면서 중복값 제거

        ArrayList<Integer>numbers2 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3 ,4, 4, 5));
        ArrayList<Integer>subnumbers2 = new ArrayList<>();
        for(Integer item : numbers2) {
            if(!subnumbers2.contains(item)) {
                subnumbers2.add(item);
            }
        }
        subnumbers2.sort(Comparator.reverseOrder());
        System.out.println(subnumbers2);
    }
}
