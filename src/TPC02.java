import java.util.concurrent.BlockingDeque;

public class TPC02 {
    public static void main(String[] args) {
        /* 프로그래밍의 3대요소
        * 변수 : 메모리 공간의 이름 (크기, 종류 필요) - Variable
        * 자료형 : 변수가 저장할 수 있는 데이터 타입 - Data Type
        * 할당 : '=' 로 변수에 자료를 저장 - Assign */

        /* 변수 선언 = 메모리할당 */
        int num1, num2, num3;

        /* 변수에 데이터 할당 */
        num1 = 1;
        num2 = 1;
        num3 = num1 + num2;

        System.out.println(num3);

        /* 기본적으로 실수형은 Double형으로 인식하므로
        * 후미에 f를 붙여서 float형이라는 것을 명시해야한다 */
        float fnum1;

        fnum1 = 34.5f;

        /* 문자는 '', 문자열은 "" */
        char ch;
        String str;

        ch = 'A';
        str = "ABCD";

        /* blooean 은 TRUE/FALSE = 1/0 */
        boolean bl;
        bl = true;

        /* 사용자정의자료형(UDDT)
        * : 객체 자료형 (Object)
        * class로 만들어진 자료형 (VO, DTO...)*/
    }
}
