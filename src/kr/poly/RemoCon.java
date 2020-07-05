package kr.poly;

public interface RemoCon {
    // 인터페이스라 변수에 static finel = 상수화 생략됨
    int MAXCH = 100;
    int MINCH = 1;

    public void chUp();
    public void chDown();
    public void internet();
}
