package test;

import java.util.Scanner;

public class Icecream31 {
    public static int computer_turn(int data) {
        int com_pick = (int) ((Math.random() * 3) + 1);

        if ((data + com_pick) > 31) {
            com_pick = 31 - data;
        }

        for (int i = 1; i < (com_pick + 1); i++) {
            System.out.println("컴퓨터: " + (data + i));
        }

        return (data + com_pick);
    }

    public static int player_turn(int data) {
        Scanner txt = new Scanner(System.in);
        int my_pick = txt.nextInt();

        while ((my_pick != 1 && my_pick != 2 && my_pick != 3) || (data + my_pick > 31)) {
            System.out.println("다시 입력하세요!");
            my_pick = txt.nextInt();
        }

        for (int i = 1; i < (my_pick + 1); i++) {
            System.out.println("사용자: " + (data + i));
        }

        return data + my_pick;
    }

    public static void main(String[] args) {
        int last_num = 0;
        int select = (int) (Math.random() * 2);

        if (select == 0) {
            last_num = computer_turn(last_num);
        }

        while (true) {
            last_num = player_turn(last_num);

            if (last_num == 31) {
                System.out.println("컴퓨터 승리!");
                break;
            }

            last_num = computer_turn(last_num);

            if (last_num == 31) {
                System.out.println("사용자 승리!!");
                break;
            }
        }
    }
}
