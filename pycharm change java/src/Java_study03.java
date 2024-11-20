public class Java_study03 {
    public static class Library {
        int totalBook = 0;
        private String name;
        private int books;
        public Library(String name, int books) {
            this.name = name;
            this.books = books;
            totalBook += books;
        }

        public void add_book(int count){
            totalBook += count;
            books += count;
            System.out.println("책이 "+count+"만큼 추가됌");
        }
        public void remove_book(int count){
            totalBook -= count;
            books -= count;
            System.out.println("책이 "+count+"만큼 삭제됌");
        }
        public void display_info(){
            System.out.println(name);
            System.out.println(books);
            System.out.println(totalBook);
        }
    }
    public static void main(String[] args) {
        // Library 객체 생성
        Library library1 = new Library("중앙 도서관", 100);
        Library library2 = new Library("서부 도서관", 50);

        // 도서관 정보 출력
        library1.display_info();
        library2.display_info();

        // 책 추가 및 제거
        library1.add_book(30);
        library2.remove_book(20);

        // 도서관 정보 출력
        System.out.println("\n책 추가 및 제거 후:");
        library1.display_info();
        library2.display_info();
    }
}

