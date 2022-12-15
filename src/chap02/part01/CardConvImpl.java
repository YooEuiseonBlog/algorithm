package chap02.part01;

public class CardConvImpl implements CardConv {
    // x: 정수, r: 진수, 배열 d: 지수 넣어두는 문자 배열
    @Override
    public int cardConv(int x, int r, char[] d) {
        int digits = 0;                         //변환 후의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r); //r로 나눈 나머지를 저장
            x /= r;
        } while (x != 0);
        return digits;
    }
    
}
