public class TPC08 {
    /* JVM Memory Model 1 - auto
    1. 디렉토리에서 클래스 서치
    2. method Area 에 static-zone 에 static method 로딩 (main, add 둘다 로드되어 있으므로 add 사용가능)
    3. 메소드 순서대로 stack Area 에서 method 실행*/

    /*public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(add(a,b));
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }*/

    /* JVM Memory Model 2
    1. 디렉토리에서 클래스 서치
    2. method Area 에 static-zone 에 static method 로딩 (main 만 로드되어 있으므로 add 사용불가능), non-static-zone 에 비 static method 로딩 (add)
    3. 메소드 순서대로 stack Area 에서 method 실행
    4. 실행중 non-static method 를 만나면 heap Area (new 키워드를 사용해서 객체를 heap 영역에 올려두고 non-static-zone 을 포인터로 참조해서 사용가능) 에서 non-static-zone 의 메소드를 찾음
    5. stack Area 에서 메소드 실행*/

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        TPC08 tpc = new TPC08();
        System.out.println(tpc.add(a,b));
    }

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
