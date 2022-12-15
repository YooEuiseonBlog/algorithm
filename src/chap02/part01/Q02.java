package chap02.part01;

import java.util.Arrays;

public class Q02 {
    static void swap(int[] arr, int idx1, int idx2) {
        int t = arr[idx1]; arr[idx1] = arr[idx2]; arr[idx2] = t;
    }
    
    static void printArr(int[] arr) {
        String str = "";
        for (int i : arr) {
            str += i + " ";
        }
        // str = str.substring(0, str.length()-1);
        // str = str.replaceFirst(".$", "*");
        str = str.trim();
        System.out.println(str);
    }
    public static void main(String[] args) {
        int[] arr = {5, 10, 73, 2, -5, 42};
        printArr(arr);
        for (int i = 0; i < arr.length/2; i++) {
            int idx1 = i;
            int idx2 = arr.length-i-1;
            System.out.println("a[" + idx1 + "]과(와) " + "a[" + idx2 + "]를 교환합니다.");
            swap(arr, idx1, idx2);
            printArr(arr);
        }
        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
