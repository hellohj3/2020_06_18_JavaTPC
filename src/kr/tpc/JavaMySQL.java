package kr.tpc;

public class JavaMySQL implements DBConnect {

    @Override
    public void getConnection(String url, String user, String password) {
        System.out.println("MySQL DB : 접속 성공");
    }
}
