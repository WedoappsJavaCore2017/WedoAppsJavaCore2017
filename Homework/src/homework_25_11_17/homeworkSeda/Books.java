package homework_25_11_17.homeworkSeda;

public class Books {
    String name;
    int pagesCount;
    String genre;
    String publisher;
    String publishedDate;
    String language;
    double price;
    Author author;

    public Books(String name, int pagesCount, String genre, String publisher, String publishedDate, String language, double price, Author author) {
        this.name = name;
        this.pagesCount = pagesCount;
        this.genre = genre;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.language = language;
        this.price = price;
        this.author = author;
    }

    public String toString (){
        return author.name+" " +author.surname+" - "+name;

    }
}
