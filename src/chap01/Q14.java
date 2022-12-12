package chap01;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        square();
    }

    static void square() {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("단 수 : ");
        int num = stdIn.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
