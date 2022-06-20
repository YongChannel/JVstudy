package test;

public class CalcScore {
    int[] number = new int[100];
    int[] koScore = new int[100];
    int[] enScore = new int[100];
    int[] maScore = new int[100];

    public static void main(String[] args) {
        CalcScore cs = new CalcScore();
        cs.scoreCalculation();
    }

    public CalcScore() {
        for (int i = 0; i < 100; i++) {
            number[i] = i + 1;
            koScore[i] = getRandomScore();
            enScore[i] = getRandomScore();
            maScore[i] = getRandomScore();
        }
    }  // CalcScore 생성자, 변수 초기화

    public int getRandomScore() {
        return ((int) (Math.random() * 100));
    }  // 성적 랜덤 입력

    public void scoreCalculation() {
        Student student = new Student(number, koScore, enScore, maScore);
        for (int i = 0; i < 100; i++) {
            System.out.println("학번:" + number[i] + " 국어:" + koScore[i] + " 영어:" + enScore[i] + " 수학:" + maScore[i] + " 등급:" + student.getTotal(i));
        }
    }  // 학생 클래스 생성, 결과 출력
}
