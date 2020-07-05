package kr.poly;

public abstract class Animal {
    public abstract void eat();
    
    public void move() {
        System.out.printf("무리를 지어서 이동한다.");
    }
}
