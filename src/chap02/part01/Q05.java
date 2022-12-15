package chap02.part01;

public class Q05 {
    static void rcopy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i] = b[a.length-i-1];
        }
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = {10, 20, 30, 40, 50};

        rcopy(a, b);
        
        Q02.printArr(b);
        Q02.printArr(a);
        
    }
}
