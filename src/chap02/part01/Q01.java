package chap02.part01;

import java.util.Random;

public class Q01 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        //사람 수 랜덤값으로
        int num = rand.nextInt(10) + 1;
        
        int[] height = new int[num];

        for (int i = 0; i < height.length; i++) {
            height[i] = rand.nextInt(90) + 100;
            System.out.println("height [" + i + "] : " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }

    static int maxOf(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
}
