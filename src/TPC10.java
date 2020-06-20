import kr.tpc.BookDTO;

public class TPC10 {
    public static void main(String[] args) {
        /* PDT */
        int a;
        a = 10;

        /* UDDT */
        BookDTO b = new BookDTO();

        b.setTittle("자바");
        b.setPrice(17000);
        b.setCompany("영진");
        b.setPage(670);

        System.out.print(b.getTittle() +  "\t");
        System.out.print(b.getPrice() +  "\t");
        System.out.print(b.getCompany() +  "\t");
        System.out.println(b.getPage());
    }
}
