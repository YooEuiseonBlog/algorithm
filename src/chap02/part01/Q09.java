package chap02.part01;

import java.util.Arrays;

public class Q09 {
    static int leftDayOfYear(int y, int m, int d) {
        return DayOfYear.isLeap(y) == 1 ? lefDayCalculate(y, m, d, 1): lefDayCalculate(y, m, d, 0); 
    }

    private static int lefDayCalculate(int y, int m, int d, int leapYear) {
        return Arrays.stream(DayOfYear.mdays[leapYear]).sum() - DayOfYear.dayOfYearV2(y, m, d);
    }
}

