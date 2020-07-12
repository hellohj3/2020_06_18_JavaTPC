import kr.tpc.A;
import kr.tpc.B;

public class TPC30 {
    public static void main(String[] args) {
        Object[] o = new Object[2];
        o[0] = new A();
        o[1] = new B();

        pringGo(o);
    }

    private static void pringGo(Object[] o) {
        for(int i=0; i<o.length; i++) {
            if(o[i] instanceof A) {
                ((A)o[i]).go();
            } else {
                ((B)o[i]).go();
            }
        }
    }
}
