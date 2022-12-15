package chap02.part01;

import java.util.Scanner;

public class Q03 {
    static int sumOf(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("배열의 크기를 결정하세요.");
        int num = stdIn.nextInt();
        int[] height = new int[num];
        
        //배열 내용 채우기
        for (int i = 0; i < height.length; i++) {
            int input = 0;
            //height 배열 요솟값 넣기 : 양수만 입력 가능 ---> 검증
            do {
                System.out.print("height[" + i + "] : ");
                input = stdIn.nextInt();;
            } while (!(input>0));
            height[i] = input;
        }
        Q02.printArr(height);
        System.out.println("전체 합은 " + sumOf(height));
    }
}
