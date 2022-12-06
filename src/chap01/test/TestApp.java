package chap01.test;

import java.util.Scanner;

import chap01.Chap01;
import chap01.Max3m;
import chap01.SumGaus;

public class TestApp {
    public static void main(String[] args) {
        // System.out.println("max(3,2,1) = " + Max3m.max3(3, 2, 1));
        // System.out.println("max(3,2,2) = " + Max3m.max3(3,2,2));
        // System.out.println("max(3,1,2) = " + Max3m.max3(3,1,2));
        // System.out.println("max(3,2,3) = " + Max3m.max3(3,2,3));
        // System.out.println("max(2,1,3) = " + Max3m.max3(2,1,3));
        // System.out.println("max(3,3,2) = " + Max3m.max3(3,3,2));
        // System.out.println("max(3,3,3) = " + Max3m.max3(3,3,3));
        // System.out.println("max(2,2,3) = " + Max3m.max3(2,2,3));
        // System.out.println("max(2,3,1) = " + Max3m.max3(2,3,1));
        // System.out.println("max(2,3,2) = " + Max3m.max3(2,3,2));
        // System.out.println("max(1,3,2) = " + Max3m.max3(1,3,2));
        // System.out.println("max(2,3,3) = " + Max3m.max3(2,3,3));
        // System.out.println("max(1,2,3) = " + Max3m.max3(1,2,3));
        // int minListStream = Chap01.minListStream(1, 2, 3 ,4 ,5);
        // System.out.println("min = " + minListStream);
        // int minListStreamV2 = Chap01.minListStreamV2(0, 2, 3 , 4 , 6);
        // System.out.println("min2 = " + minListStreamV2);
        Scanner stdIn = new Scanner(System.in);
        System.out.println("a의값 : ");
        int a = stdIn.nextInt();
        System.out.println("b의값 : ");
        int b = stdIn.nextInt();
        int gaus = SumGaus.sumof(a, b);
        System.out.println(gaus);
        

    }
}
