package chap02.part01;
//두 배열이 같은가를 판단

import static java.lang.System.out;

import java.util.Scanner;

public class ArrayEqual {
    //두 배열 a, b의 모든 요소가 같은가?
    static boolean equals(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        out.print("배열 a의 요솟수 : ");
        int na = stdIn.nextInt();

        int[] a = new int[na];

        for (int i = 0; i < a.length; i++) {
            out.print("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }

        out.print("배열 b의 요솟수 : ");
        int nb = stdIn.nextInt();

        int[] b = new int[nb];

        for (int i = 0; i < b.length; i++) {
            out.print("b[" + i + "] : ");
            b[i] = stdIn.nextInt();
        }

        out.println("배열 a와 b는 " + (equals(a, b) ? "같습니다." : "같지 않습니다."));
    }
}
