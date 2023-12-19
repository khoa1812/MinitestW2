public class Main {
    public static void main(String[] args) {
        ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
        FictionBook[] fictionBooks = new FictionBook[5];


        double totalPrice = 0;
        int countJavaBooks = 0;
        int countFictionBooks1 = 0;
        int countCheapFictionBooks = 0;

        for (ProgrammingBook book : programmingBooks) {
            totalPrice += book.getPrice();
            if ("Java".equals(book.getLanguage())) {
                countJavaBooks++;
            }
        }

        for (FictionBook book : fictionBooks) {
            totalPrice += book.getPrice();
            if ("Viễn tưởng 1".equals(book.getCategory())) {
                countFictionBooks1++;
            }
            if (book.getPrice() < 100) {
                countCheapFictionBooks++;
            }
        }

        System.out.println("Tổng tiền của 10 cuốn sách: " + totalPrice);
        System.out.println("Số sách ProgrammingBook có language là 'Java': " + countJavaBooks);
        System.out.println("Số sách Fiction có category là 'Viễn tưởng 1': " + countFictionBooks1);
        System.out.println("Số sách Fiction có giá dưới 100: " + countCheapFictionBooks);
    }
}
