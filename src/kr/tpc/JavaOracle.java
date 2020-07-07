package kr.tpc;

public class JavaOracle implements DBConnect {

    @Override
    public void getConnection(String url, String user, String password) {
        System.out.println("Oracle DB : 접속 성공");
    }
}
