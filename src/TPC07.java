public class TPC07 {
    public static void main(String[] args) {
        int a = 20;
        float b = 56.7f;

        /* Call By Value */
        float v = sum(a,b);
        System.out.println(v);

        /* Call By Reference */
        int[] arr = {1,2,3,4,5};
        int vv = arrSum(arr);
        System.out.println(vv);
    }

    private static int arrSum(int[] arr) {
        int sum = 0;
        for(int i=0 ; i<arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static float sum(int a, float b) {
        float v = a + b;
        return v;
    }
}
