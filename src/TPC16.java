import kr.tpc.Overload;

public class TPC16 {
    public static void main(String[] args) {
        Overload over = new Overload();

        over.hap(10,20);
        over.hap(10,20f);
        over.hap(14f,20f);
    }
}
