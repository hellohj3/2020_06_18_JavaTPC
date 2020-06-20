package kr.bit;

/* 책 사용자 정의 자료형 (User Define Data Type)
 * 제목 : title
 * 가격 : price
 * 출판사 : company
 * 페이지수 : page */
public class BookVO {
    private String title;
    private String company;
    private int price;
    private int page;

    public BookVO() {
        this.title = "자바";
        this.price = 14000;
        this.company = "이지스";
        this.page = 780;
    }

    public BookVO(String title, int price, String company, int page) {
        this.title = title;
        this.price = price;
        this.company = company;
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
