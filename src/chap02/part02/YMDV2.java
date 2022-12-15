package chap02.part02;

import java.time.Year;

public class YMDV2 {
    
    int y;
    int m;
    int d;

    static int[][] mdays = {
        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
        {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    public YMDV2(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    YMDV2 after(int n) {
        if (n < 0) {
            return before(-n);
        }

        int daysMonth = mdays[isLeap(y)][m-1];

        d += n;
        while(d > daysMonth) {
            d -= daysMonth;
            if(++m>12) {
                y++;
                m=1;
            }
        }
        return new YMDV2(y, m, d);
    }

    YMDV2 before(int n) {
        int daysMonth;
        if(n<0) {
            return after(-n);
        }

        d -= n;

        while(d<1) {
            if(--m<1) {
                y--;
                m=12;
            }
            daysMonth = mdays[isLeap(y)][m-1];
            d += daysMonth;
        }
        return new YMDV2(y, m, d);
    }

    @Override
    public String toString() {
        return y + "년 " + m + "월 " + d +"일입니다.";
    }

    public static void main(String[] args) {
        YMDV2 ymd = new YMDV2(2022, 3, 15);
        System.out.println(ymd.after(365));
    }
}
