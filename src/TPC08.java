public class TPC08 {
    /* JVM Memory Model 1 - auto
    1. 디렉토리에서 클래스 서치
    2. method Area 에 static-zone 에 static method 로딩 (main, add 둘다 로드되어 있으므로 add 사용가능)
    3. 메소드 순서대로 stack Area 에서 method 실행*/

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(add(a,b));
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
