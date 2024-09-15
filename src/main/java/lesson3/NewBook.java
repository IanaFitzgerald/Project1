package lesson3;

public class NewBook {
    //describe a book, create all the variables we need
    // name, author, id, price in USD, availability
    // using conversion rate, calculate EUR Price of book
    // using conversion rate, calculate RUB Price of book
    // print all the books details including prices
    String euro = "EUR";
    String ruble = "RUB";
    public static void main(String[] args) {
        NewBook book1 = new NewBook();
        book1.createNewBook("Harry Potter", "J.K Rowling", 1, 10.5, false);
        book1.createNewBook("Anna Karenina", "L. Tolstoy", 2, 20, true);

    }

    public void createNewBook(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable) {
        double priceInEUR = calculatePrice(priceInUSD, euro);
        double priceInRubles = calculatePrice(priceInUSD, ruble);


        System.out.println("lesson1.Book name is: " + bookName);
        System.out.println("lesson1.Book id is: " + id);
        System.out.println("lesson1.Book price: " + priceInUSD + " USD, " + priceInEUR + " EUR, " + priceInRubles + " RUB");
        System.out.println("lesson1.Book is available: " + isAvailable);

    }

    public double calculatePrice(double priceInUSD, String currency) {
        double rate = 1;
        if (currency.equals(euro)) {
            rate = 1.1;
        } else if (currency.equals(ruble)) {
            rate = 70;
        } else {
            System.out.println("Error Unknown currency");
        }
        double priceAfterConversion = priceInUSD * rate;
        return priceAfterConversion;
    }

}

