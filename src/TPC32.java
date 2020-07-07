import kr.tpc.DBConnect;
import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

public class TPC32 {
    public static void main(String[] args) {
        DBConnect conn = new JavaOracle();

        conn.getConnection("url", "user", "1234");

        conn = new JavaMySQL();

        conn.getConnection("url", "user", "1234");
    }
}
