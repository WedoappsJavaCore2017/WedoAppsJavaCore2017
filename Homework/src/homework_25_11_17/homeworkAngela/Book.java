public class Book {
    String name;
    Author author;
    int pagesCount;
    String gender;
    String publisher;
    String publishedDate;
    String language;
    double price;

    public Book(String name, Author author, int pagesCount, String gender, String publisher, String publishedDate, String language, double price) {
        this.name = name;
        this.author = author;
        this.pagesCount = pagesCount;
        this.gender = gender;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.language = language;
        this.price = price;
    }
}
