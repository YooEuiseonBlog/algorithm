package chap02.part01;
    //배열 a의 최댓값을 나타냅니다.(값을 입력 받음).

import static java.lang.System.out;

import java.util.Scanner;

public class MaxOfArray {
    //배열 a의 최댓값을 구하여 반환합니다.
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        out.print("사람 수 : ");
        int num = stdIn.nextInt();

        int[] height = new int[num];

        for (int i = 0; i < height.length; i++) {
            out.print("height[" + i +"] : ");
            height[i] = stdIn.nextInt();
        }

        out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}
