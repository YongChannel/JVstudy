package lec04;

public class Quiz2 {
    public static void main(String[] args) {
        System.out.println("while문을 사용해 1~1000까지 자연수 중 3의 배수의 합");
        int i = 0;
        int sum = 0;
        while (i <= 1000) {
            if (i % 3 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
