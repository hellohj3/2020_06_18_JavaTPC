package kr.bit;

/* 책 사용자 정의 자료형 (User Define Data Type)
 * 제목 : tittle
 * 가격 : price
 * 출판사 : company
 * 페이지수 : page */
public class BookVO {
    private String tittle;
    private String company;
    private int price;
    private int page;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
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
