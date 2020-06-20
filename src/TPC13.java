import kr.tpc.BookDTO;

public class TPC13 {
    public static void main(String[] args) {

        /* 이건 책 '객체' X, 단일 변수들이다 */
        String title = "Spring";
        int price = 25000;
        String company = "제이펍";
        int page = 890;

        /* '설계'된 'class' 사용 */
        BookDTO dto;            // 이건 'object', 구체적 정의 X
        dto = new BookDTO(title, company, price, page);    // 이건 'instance' 구체적 정의 O

        bookPring(dto);
    }

    public static void bookPring(BookDTO dto) {
        System.out.print(dto.getTitle() +  "\t");
        System.out.print(dto.getPrice() +  "\t");
        System.out.print(dto.getCompany() +  "\t");
        System.out.println(dto.getPage());
    }
}
