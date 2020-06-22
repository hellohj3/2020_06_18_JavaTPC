import kr.tpc.MovieVO;

public class TPC17 {
    public static void main(String[] args) {
        /* 배열의 선언방법 */
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        int[] b = {10,20,30,40,50};

        int[] c = new int[] {10,20,30,40,50};

        for(int i=0; i<5; i++) {
            System.out.print(a[i] + "\t");
            System.out.print(b[i] + "\t");
            System.out.println(c[i]);
        }

        MovieVO mv = new MovieVO("비트",12000,"연기자",12,1.3f);
        System.out.println(mv);

        MovieVO[] marr = new MovieVO[3];
        marr[0] = new MovieVO("비트1",12000,"연기자1",12,1.3f);
        marr[1] = new MovieVO("비트2",13000,"연기자2",11,1.34f);
        marr[2] = new MovieVO("비트3",14000,"연기자3",13,1.35f);

        for (int i=0; i<marr.length; i++) {
            System.out.println(marr[i]);
        }
    }
}
