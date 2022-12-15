package chap02.part01;
//1,000 이하의 소수를 열거(버전 2)
public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;            //나눗셈의 횟수
        int ptr = 0;                //찾은 소수의 개수
        int[] prime = new int[500]; //소수를 저장하는 배열

        prime[ptr++] = 2;           //2는 소수임

        for (int n = 3; n <= 1000; n+=2) {   //대상은 홀수만 (n+2+2+2...) why? 짝수는 4이상 짝수는 2를 포함한 합성수(composite number)이기 때문이다.
            int i;
            for (i = 1; i < ptr; i++) {     // prime배열에서 소수를 하나씩 꺼내서 사용하는 반복문 (i=0을 빼는 이유는 어차피 홀수이기 때문에 소수 2를 뺌)
                counter++;
                if (n % prime[i] == 0) {    //이미 찾은 소수로 나누어짐
                    break;                  //더 이상의 반복은 불필요
                }
            }
            if(ptr == i)                    //마지막까지 나누어떨어지지 않음
                prime[ptr++] = n;           //소수라고 배열에 저장
        }

        for (int i = 0; i < ptr; i++) {     //찾은 ptr개의 소수를 나타냄
            System.out.println(prime[i]);
        }
        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }// </psvm>
}
