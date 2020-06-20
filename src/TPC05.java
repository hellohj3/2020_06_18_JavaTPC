public class TPC05 {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        int sum = 0;

        for(int i=0 ; i<3 ; i++) {
            sum += a[i];
        }
        System.out.println(sum);

        int[][] b = new int[3][3];
        for(int i=0 ; i<3 ; i++) {
            for(int j=0 ; j<3 ; j++) {
                b[i][j] = i*j;
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] c = new int[5][];
        c[0] = new int[1];
        c[1] = new int[2];
        c[2] = new int[3];
        c[3] = new int[4];
        c[4] = new int[5];

        for(int i=0 ; i<c.length ; i++) {
            for(int j=0 ; j<c[i].length ; j++) {
                c[i][j] = '*';
                System.out.print((char)c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
