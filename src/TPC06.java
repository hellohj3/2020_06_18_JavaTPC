public class TPC06 {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
    }

    /* 매개변수 정수 2개를 더하여 총합을 구하여 리턴 */
    public static int sum(int a, int b) {
        int v = a + b;
        return v;
    }

    /* 정수 3개 리턴 */
    public static int[] returnArray() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        return arr;
    }
}
