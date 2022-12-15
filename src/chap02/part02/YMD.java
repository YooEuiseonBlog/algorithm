package chap02.part02;

import chap02.part01.DayOfYear;

public class YMD {
    int y;
    int m;
    int d;

    public YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public YMD after(int n) {
        d += n;
        int daysPerPresentMonth;
        // int daysPerMonth = DayOfYear.mdays[DayOfYear.isLeap(y)][m-1]; //presentMonth
        // while(d > daysPerMonth) {
        //         d -= daysPerMonth;
        //         m++;
        //     if (m > 12) {
        //         m -= 12;
        //         y++;
        //     }
        //     daysPerMonth = DayOfYear.mdays[DayOfYear.isLeap(y)][m-1]; //presentMonth reInitial
        // }
        daysPerPresentMonth = DayOfYear.mdays[DayOfYear.isLeap(y)][m-1]; // 현재 달의 마지막 값을 알기 위한 것
        while(d > daysPerPresentMonth) {
            d -= daysPerPresentMonth;
            if(++m > 12) {
                m = 1;
                y++;
            }
            daysPerPresentMonth = DayOfYear.mdays[DayOfYear.isLeap(y)][m-1]; // 변화된 필드값에 따른 초기화
        }
        return new YMD(y, m, d);
    }

    public YMD before(int n) {
        int daysPerPresentMonth;
        d -= n;
        while(d < 1) {
            if(--m<1) {
                y--;
                m = 12;
            }
            daysPerPresentMonth = DayOfYear.mdays[DayOfYear.isLeap(y)][m-1]; // 변화된 필드값에 따른 초기화
            d += daysPerPresentMonth;
        }
        return new YMD(y, m, d);
    }

    @Override
    public String toString() {
        return y + "년 " + m + "월 " + d +"일입니다.";
    }

    public static void main(String[] args) {
        YMD ymd = new YMD(2023, 3, 5);
        System.out.println(ymd.after(365));
    }
}
