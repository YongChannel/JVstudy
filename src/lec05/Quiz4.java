package lec05;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator4 {
    int value;
    Calculator4() {
        this.value = 0;
    }
    int avg(ArrayList<Integer> data) {
        int total = 0;
        for (int num : data) {
            total += num;
        }
        return total / data.size();
    }
    int avg2(int[] data2) {
        int total2 = 0;
        for (int num2 : data2) {
            total2 += num2;
        }
        return total2 / data2.length;
    }
}

public class Quiz4 {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        Calculator4 cal = new Calculator4();
        int result = cal.avg(data);
        System.out.println(result);

        int[] data2 = {1, 3, 5, 7, 9};
        Calculator4 cal2 = new Calculator4();
        int result2 = cal2.avg2(data2);
        System.out.println(result2);
    }
}
