package chap02.part01;

public class CardConvReverse implements CardConv {

    @Override
    public int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x%r);
            x /= r;
        } while (!(x==0));
        for (int i = 0; i < digits/2; i++) {
            swap(d, i, digits-i-1);
        }
        return digits;
    }

    private void swap(char[] chArr, int idx1, int idx2) {
        char t = chArr[idx1]; chArr[idx1] = chArr[idx2]; chArr[idx2] = t;
    }
    
}
