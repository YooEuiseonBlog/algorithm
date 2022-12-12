package chap01;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("몇 단을 입력하시겠습니까? ");
        int n = stdIn.nextInt();
        npira(n);
    }
    static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i-1)*2+1; k++) {
                System.out.print(i);
            }           
            System.out.println();
        }
    }
}
