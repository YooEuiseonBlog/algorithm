package chap01;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.println("a의 값 : ");
        a = stdIn.nextInt();
        do {
            System.out.println("b의 값 : ");
            b = stdIn.nextInt();
            if (a >= b) System.out.println("a보다 큰 값을 입력하세요!");
        } while (a >= b);
        System.out.println("b-a는 " + (b-a) + "입니다.");
    }
}
