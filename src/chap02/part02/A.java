package chap02.part02;

public class A {
    private int f1;
    protected int f2;   // 패키지 내에서만 사용 가능하고 상속 받은 자손클래스도 사용가능
    public int f3;      // public : 다른 패키지에서 사용 가능

    static final int S1 = 0;

    public A() {
        f1 = f2 = f3 = 0;
    }

    public A(int f1, int f2, int f3) {
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
    }

    public int getF1() {
        return f1;
    }

    public void setF1(int f1) {
        this.f1 = f1;
    }

    public int getF2() {
        return f2;
    }

    public void setF2(int f2) {
        this.f2 = f2;
    }

    public int getF3() {
        return f3;
    }

    public void setF3(int f3) {
        this.f3 = f3;
    }

    public static int getS1() {
        return S1;
    }

    
}
