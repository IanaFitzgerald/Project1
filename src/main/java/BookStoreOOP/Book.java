package BookStoreOOP;

public abstract class Book {
    String bookName;
    String authorName;
    int id;
    double usdPrice;
    boolean isAvailable;

    String euro = "EUR";
    String ruble = "RUB";

    public Book (String name, String authorName, int id, double price, boolean isAvailable) {
        this.bookName = name;
        this.authorName = authorName;
        this.id = id;
        this.usdPrice = price;
        this.isAvailable = isAvailable;
    }


    public String getBookName() { return bookName; }

    public void setBookName(String bookName) { this.bookName = bookName; }

    public String getAuthorName() { return authorName; }

    public void setAuthorName(String authorName) { this.authorName = authorName; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public double getPriceInUSD() { return usdPrice; }

    public void setPriceInUSD(double priceInUSD) { this.usdPrice = priceInUSD; }

    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) { isAvailable = available; }



    public double convertPrice(String currency) {
        double rate = 1;
        if (currency.equals(euro)) {
            rate = 1.1;
        } else if (currency.equals(ruble)) {
            rate = 70;
        } else {
            System.out.println("Error: unknown currency, USD price will be returned");
        }
        double priceAfterConversion = usdPrice * rate;
        return priceAfterConversion;
    }

    public void printBookDetails(){
        System.out.println("**********************");
        System.out.println("lesson1.Book name is: " + bookName);
        System.out.println("lesson1.Book id is: " + id);
        System.out.println("lesson1.Book price: " + usdPrice + " USD, " + convertPrice(euro) +" EUR, " + convertPrice(ruble) + " RUB");
        System.out.println("lesson1.Book is available: " + isAvailable);

    }
}