package test;

public class Student {
    int[] number;
    int[] koScore;
    int[] enScore;
    int[] maScore;

    public Student(int[] number, int[] koScore, int[] enScore, int[] maScore) {
        this.number = number;
        this.koScore = koScore;
        this.enScore = enScore;
        this.maScore = maScore;
    }  // Student 생성자, 변수 초기화

    public char getTotal(int j) {
        int[] avgScore = new int[100];
        char[] Result = new char[100];
        for (int i = 0; i < 100; i++) {
            avgScore[i] = (koScore[i] + enScore[i] + maScore[i]) / 3;
            Result[i] = getGrade(avgScore[i]);
        }
        return Result[j];
    }  // 총점 계산

    public char getGrade(int Score) {
        if (Score > 80) {
            return 'A';
        } else if (Score > 60) {
            return 'B';
        } else if (Score > 40) {
            return 'C';
        } else if (Score > 20) {
            return 'D';
        } else {
            return 'F';
        }
    }  // 등급 계산
}
