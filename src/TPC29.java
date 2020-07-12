import kr.tpc.A;
import kr.tpc.B;

public class TPC29 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        display(a);
        display(b);
    }

    private static void display(Object o) {
        if(o instanceof A) {
            ((A)o).go();
        } else {
            ((B)o).go();
        }
    }
}
