package chap02.part01;

public class Q04 {
    static void copy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }    
    }

    public static void main(String[] args) {
        int[] clonedArr = new int[5];
        int[] cloningArr = {1, 2, 3, 4, 5, 6};

        copy(clonedArr, cloningArr);

        Q02.printArr(clonedArr);
        Q02.printArr(cloningArr);
    }
}
