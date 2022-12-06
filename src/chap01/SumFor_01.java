package chap01;

import java.util.Scanner;

public class SumFor_01 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("1부터 n까지 합을 구합니다.");
        System.out.println("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = 0;
        String str = "";

        for (int i = 1; i <= n; i++) {
            str += i + " + ";
            sum += i;
        }
        str = str.substring(0, str.length()-2).concat("= " + sum);
        System.out.println(str);
    }
}
