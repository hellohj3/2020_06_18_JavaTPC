import kr.inflean.ObjectArray;
import kr.tpc.A;
import kr.tpc.B;

import java.util.ArrayList;

public class TPC37 {
    public static void main(String[] args) {
        ObjectArray arr = new ObjectArray(5);
        arr.add(new A());
        arr.add(new B());
        arr.add(new A());
        arr.add(new B());
        arr.add(new A());

        for(int i=0; i<arr.size(); i++) {
            Object o = arr.get(i);
            if( o instanceof A ) {
                ((A)o).go();
            } else {
                ((B)o).go();
            }
        }

        ArrayList list = new ArrayList(5);

        list.add(new A());
        list.add(new B());
        list.add(new A());
        list.add(new B());
        list.add(new A());
        list.add(new A());
        list.add(new B());
        list.add(new A());
        list.add(new B());
        list.add(new A());

        for(int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
