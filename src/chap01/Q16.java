package chap01;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("몇 단 입니까? ");
        int n = stdIn.nextInt();
        spira(n);
    }

    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= (i-1)*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
