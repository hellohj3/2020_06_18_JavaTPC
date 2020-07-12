public class TPC35 {
    public static void main(String[] args) {
        String str_1 = new String("APPBLE");
        String str_2 = new String("APPBLE");

        if(str_1 == str_2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        if(str_1.equals(str_2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
