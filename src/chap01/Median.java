package chap01;

import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if ( a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.println("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.println("b의 값 : ");
        int b = stdIn.nextInt();
        System.out.println("c의 값 : ");
        int c = stdIn.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }

    /**
     * static int med3(int a, int b, int c) {
     *  if ((b >= a && c <= a) || (b <= a && c >=a))
     *      return a;
     *  else if ((a > b && c < b) || (a < b && c > b))
     *      return b;
     *  return c; 
     * }
     *  
        정답 1
        1C-1의 med3 메서드는 아무리 많아도 세번의 대소 비교를 거친다. 그러나 다음 메서드는 최대 8번의 대소 비교를 하는 경우가 있기 때문에 다음 메서드가 더 효율이 떨어진다.

        정답 2
        가장 처음의 if문의 판단 if ((b >= a && c<= a) || (b <= a && c >= a))에 주목합니다.
        여기서 b >= a 및 b <= a의 판단을 뒤집은 판단(실질적으로 같은 판단)을 이어지는 else 이후의 else if ((a > b && c < b) || (b <= a && c > b)) 으로 수행합니다.
        결국 가장 처음의 if가 성립한 경우 2 번째의 if에서도 (실질적으로)같은 판단을 수행하므로 효율이 나빠집니다.
     */
}
