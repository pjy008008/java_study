package mid1.nested.test.ex1;

public class Library {
    private Book[] books;
    private int count;

    //Book은 Library내의 요소(맴버 변수)를 사용하지 않음, 따라서 static으로 선언
    private static class Book{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
    public Library(int amount) {
        this.books = new Book[amount];
    }

    public void addBook(String title, String author) {
        if (count >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        books[count++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: "+book.title+", 저자: "+book.author);
        }
    }
}
