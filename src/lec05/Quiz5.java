package lec05;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz5 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());
        System.out.println(a==b);
        //a와 b는 동일한 객체를 가리키기 때문에 결과는 true

        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> d = new ArrayList<>(c);
        c.add(4);
        System.out.println(c.size());
        System.out.println(d.size());
        System.out.println(c==d);
        //a와 c는 서로 다른 객체를 가리키기 때문에 결과는 false
    }
}
