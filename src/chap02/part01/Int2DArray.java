package chap02.part01;

public class Int2DArray {
    public static void main(String[] args) {
        int[][] x = new int[2][4];          //2차원 배열을 선언
        
        x[0][1] = 37;                       //x[0][1]에 37을 대입
        x[0][3] = 54;                       //x[0][3]에 54를 대입
        x[1][2] = 65;                       //x[1][2]에 65를 대입

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
            }
        }
    }
}
