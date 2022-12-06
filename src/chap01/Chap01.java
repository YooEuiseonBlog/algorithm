package chap01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Chap01 {
    //최댓값
    static int max4(int a, int b, int c, int d) {
        int max = a;

        if (max < b) {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        if (max < d) {
            max = d;
        }
        return max;
    }

    public static int max4V2(int... param) {
        int max = param[0];
        for (int p : param) {
            if (max < p) max = p;
        }
        return max;
    }

    public static int max4StreamV1(int... param) {
        return Arrays.stream(param)
                    .max()
                    .orElse(Integer.MIN_VALUE);
    }

    public static int max4StreamV2(Integer... param) {
        // return Arrays.stream(param)
        //             .max(Comparator.naturalOrder())
        //             .get();
        return Arrays.stream(param)
                    .max(Integer::compare)
                    .get();             
    }

    public static int max4StreamV(Integer... param) {
        return Arrays.stream(param)
                    .reduce((a, b) -> Integer.max(a, b))
                    // .reduce(Integer::max)
                    // .reduce((a, b) -> a > b ? a : b)
                    .get();
    }

    // 최솟값
    public static int min3(int a, int b, int c) {
        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        return min;
    }

    public static int min3V2(int a, int b, int c , int d) {
        int min = a;

        if (min > b) min = b;
        if (min > c) min = c;
        if (min > d) min = d;

        return min;
    }

    public static int minArrV3(int...arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i)  min = i;
        }
        return min;
    }

    public static int minListStream(Integer...arr) {
        List<Integer> list = Arrays.asList(arr);
        return list.stream()
                .mapToInt(v -> v)
                // .reduce((a, b) -> a < b ?  a : b)
                // .reduce((a, b) -> Integer.min(a, b))
                .reduce(Integer::min)
                .getAsInt();
    }

    public static int minListStreamV2(Integer...arr) {
        return Arrays.<Integer>stream(arr)
            // .min(Comparator.naturalOrder())
            // .min((a,b) -> Integer.compare(a, b))
            // .min(Integer::compare)
            .min(Comparator.comparing(t -> t))
            .get();
    }


}
