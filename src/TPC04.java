public class TPC04 {
    public static void main(String[] args) {
        /* Value vs Array */
        int a,b,c;
        a=10;
        b=20;
        c=30;

        hap(a,b,c);

        int[] arr = {11,22,33};

        sum(arr);
    }

    public static void hap(int x, int y, int z) {
        int sum = x+y+z;
        System.out.println(sum);
    }

    public static void sum(int[] x) {
        int sum = 0;
        for(int i=0 ; i<x.length ; i++) {
            sum += x[i];
        }
        System.out.println(sum);
    }
}
