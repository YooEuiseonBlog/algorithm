package chap01;

import java.util.Scanner;
/**
 * 드모르간 법칙
 * 1. x && y 와 !(!x || !y)는 같다.
 * 2. x || y 와 !(!x && !y)는 같다.
 */
public class Digit {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;

        System.out.println("2자리의 정수를 입력하세요.");

        do {
            System.out.println("입력 : ");
            no = stdIn.nextInt();
        // } while (no < 10 || no > 99);
        } while (!(no >= 10 && no <= 99));

        System.out.println("변수 no의 값은 " + no + "가(이) 되었습니다.");
    }
}
