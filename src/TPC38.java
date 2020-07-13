import kr.bit.BookVO;
import java.util.ArrayList;
import java.util.List;

public class TPC38 {
    public static void main(String[] args) {
        List<BookVO> list = new ArrayList<BookVO>();

        list.add(new BookVO("자바", 12000, "이지스", 600));
        list.add(new BookVO("C언어", 17000, "에이콘", 700));
        list.add(new BookVO("파이선", 15000, "제이펍", 690));

        for (BookVO bookVO : list) {
            System.out.println(bookVO.getTitle() + "\t" + bookVO.getPrice() + "\t" + bookVO.getCompany() + "\t" + bookVO.getPage());
        }
    }
}
