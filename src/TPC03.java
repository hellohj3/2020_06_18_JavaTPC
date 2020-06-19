import kr.bit.BookVO;
import kr.bit.PersonVO;

public class TPC03 {
    public static void main(String[] args) {
        /* PDT vs UDDT */

        /* 정수 1개를 저장하기 위한 변수를 선언하시오. */
        int a;

        /* 책 1권을 저장하기위한 변수를 선언하시오 = BookVO 객체 생성 (내부적으로 reference를 저장) */
        BookVO b = new BookVO();

        b.setTittle("자바");
        b.setPrice(15000);
        b.setCompany("한빛미디어");
        b.setPage(700);

        System.out.print("[Title] : " + b.getTittle() + "\t");
        System.out.print("[Price] : " + b.getPrice() + "\t");
        System.out.print("[Company] : " + b.getCompany() + "\t");
        System.out.println("[Page] : " + b.getPage());

        /* 회원 1인의 정보를 저장하기위한 변수를 선언하시오 = BookVO 객체 생성 (내부적으로 reference를 저장) */
        PersonVO p = new PersonVO();

        p.setName("박매일");
        p.setAge(40);
        p.setWeight(68.4f);
        p.setHeight(175.7f);

        System.out.print("[Name] : " + p.getName() + "\t");
        System.out.print("[Age] : " + p.getAge() + "\t");
        System.out.print("[Weight] : " + p.getWeight() + "\t");
        System.out.println("[Height] : " + p.getHeight());
    }
}
