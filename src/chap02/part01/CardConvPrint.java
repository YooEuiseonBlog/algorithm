package chap02.part01;

import java.util.Arrays;

import javax.xml.stream.events.Characters;

public class CardConvPrint implements CardConv{

    @Override
    public int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        formatPrint(x, r);
        do {
            char rest = dchar.charAt(x % r); //r로 나눈 나머지를 저장
            d[digits++] = rest;
            int restNum = rest - '0';
            x /= r;
            formatPrint(x, r, restNum);
        } while (x != 0);
        // System.out.println("before : "+Arrays.toString(d));
        for (int i = 0; i < digits/2; i++) {
            swap(d, i, digits-i-1);
        }
        // System.out.println("after : "+Arrays.toString(d));
        return digits;
    }
    private void formatPrint(int x, int r) {
        System.out.printf("%-2d|%8d%n", r, x);
        System.out.println("  +---------");
    }

    private void formatPrint(int x, int r, int restNum) {
        System.out.printf("%-2d|%8d···%d%n", r, x, restNum);
        if (x!=0) System.out.println("  +---------");
    }

    private void swap(char[] chArr, int idx1, int idx2) {
        char t = chArr[idx1]; chArr[idx1] = chArr[idx2]; chArr[idx2] = t;
    }
}
