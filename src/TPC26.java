import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.Tv;

public class TPC26 {
    public static void main(String[] args) {
        RemoCon tv = new Tv();
        RemoCon radio = new Radio();

        tv.chUp();
        tv.chDown();
        tv.internet();

        radio.chUp();
        radio.chDown();
        radio.internet();
    }
}
