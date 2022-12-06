package chap01;

import java.util.Scanner;

public class Q11 {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args) {
        // int length = getLengthV1();
        int length = getLengthV2();
        System.out.println("그 수는 " + length + "자리입니다.");
    }

    private static int getLengthV1() {
        int n = 0;

        do {
            System.out.println("n의 값 : ");
            n = stdIn.nextInt(); 
        } while (n <= 0);

        int length = String.valueOf(n).length();
        return length;
    }

    static int getLengthV2() {
        int ten = 1;
        int count = 0;
        System.out.println("n의 값 : ");
        int n = stdIn.nextInt();
        while(n >= ten) {
            count++;
            ten *= 10;
        }
        return count;
    }
}
