import kr.poly.A;

public class TPC28 {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        System.out.println(a.toString());

        Object o = new A();
        ((A)o).display();
        System.out.println(o.toString());
    }
}
