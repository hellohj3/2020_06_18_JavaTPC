public class TPC39 {
    public static void main(String[] args) {
        int a = 1;
        /*정석*/
        Integer b = new Integer(1);
        /*Boxing*/
        Integer c = 2;
        /*정석*/
        int d = b.intValue();
        /*Unboxing*/
        int e = b;

        int f = (Integer)c;

        String x = "100";
        String y = "200";

        int v1 = Integer.parseInt(x);
        int v2 = Integer.parseInt(y);
        System.out.println(v1+v2);

        String s1 = String.valueOf(v1);
        String s2 = String.valueOf(v2);
        System.out.println(s1+s2);
    }
}
