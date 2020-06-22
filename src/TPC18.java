import kr.tpc.MyUtil;

public class TPC18 {
    public static void main(String[] args) {
        /* 1. Java에서 제공해주는 class = API */
        String str = new String("APPLE");
        System.out.println(str.toLowerCase());

        /* 2. 직접만든 class */
        MyUtil my = new MyUtil();
        int sum = my.hap();
        System.out.println(sum);
    }
}
