import kr.bit.BookVO;

public class TPC12 {
    public static void main(String[] args) {
        BookVO b1 = new BookVO();

        System.out.print(b1.getTitle() +  "\t");
        System.out.print(b1.getPrice() +  "\t");
        System.out.print(b1.getCompany() +  "\t");
        System.out.println(b1.getPage());

        BookVO b2 = new BookVO("Python", 18000, "대림", 900);

        System.out.print(b2.getTitle() +  "\t");
        System.out.print(b2.getPrice() +  "\t");
        System.out.print(b2.getCompany() +  "\t");
        System.out.println(b2.getPage());
    }
}
