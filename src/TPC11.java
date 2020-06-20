import kr.bit.BookVO;

public class TPC11 {
    public static void main(String[] args) {
        /* BookVO 를 이용해 책 1권의 객체를 생성하시오 */
        BookVO b = new BookVO();

        b.setTittle("파이썬");
        b.setPrice(16000);
        b.setCompany("에이콘");
        b.setPage(700);

        System.out.print(b.getTittle() +  "\t");
        System.out.print(b.getPrice() +  "\t");
        System.out.print(b.getCompany() +  "\t");
        System.out.println(b.getPage());
    }
}
