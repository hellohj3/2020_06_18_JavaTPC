import kr.poly.RemoCon;
import kr.poly.Tv;

public class TPC27 {
    public static void main(String[] args) {
        RemoCon tv = new Tv();

        tv.chUp();
        tv.chUp();
        tv.chDown();
        tv.chDown();
        tv.internet();
    }
}
