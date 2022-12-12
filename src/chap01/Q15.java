package chap01;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        System.out.println("삼각형 단을 입력해주세요.");
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        // triangleB(n);
        // triangleRU(n);
        triangleRB(n);
    }

    static void triangleB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleU(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        for (int i = n; i > 0; i--) {
            for (int k = 0; k < n-i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < n-i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
