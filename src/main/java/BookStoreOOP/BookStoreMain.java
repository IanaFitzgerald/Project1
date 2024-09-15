package BookStoreOOP;

public class BookStoreMain {
    public static void main(String[] args) {
        // lesson1.Book book1 = new lesson1.Book("Harry Potter", "J.K Rowling", 1, 10.5, false);
        //lesson1.Book book2 = new lesson1.Book("Anna Karenina", "L. Tolstoy", 2, 20, true);
        AudioBook audiobook1 = new AudioBook("Harry Potter", "J.K.Rowling", 3, 15, true, "mp3", 128, "Smith");
        EBook ebook1 = new EBook("Anna Karenina", "L. Tolstoy", 2, 15, true, "http://....");
//        book1.setAvailable(true);
//        book2.setPriceInUSD(30);
//
//
//        book1.printBookDetails();
//        book2.printBookDetails();
        audiobook1.printBookDetails();
        ebook1.printBookDetails();
    }
}
