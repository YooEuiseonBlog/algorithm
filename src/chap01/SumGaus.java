package chap01;

import java.util.Scanner;

public class SumGaus {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("n의 값 : ");
        int n = stdIn.nextInt();
        int result = (1+n)*(n-1+1)/2;
        System.out.println(result);

    }

    public static int sumof(int a, int b) {
        int imp = 0;
        if (a > b)  {
            imp = b;
            b = a;
            a = imp;
        }
        return (a+b)*(b-a+1)/2;
    }
}
