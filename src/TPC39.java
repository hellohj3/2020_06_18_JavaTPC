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
    }
}
