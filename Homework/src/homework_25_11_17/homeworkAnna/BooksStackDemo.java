package homework_25_11_17;

public class BooksStackDemo {
    public static void main(String[] args) {
        Book book = new Book();
        book.name = "Bor";
        book.publisherDate = 1998;
        book.publisher = "EM";
        book.price = 7800;
        book.language = "hayeren";
        book.pageCount = 300;

        Book book1 = new Book();
        book1.name = "Narek";
        book1.publisherDate = 789;
        book1.publisher = "EM";
        book1.price = 13600;
        book1.language = "hayeren";
        book1.pageCount = 1000;


        BooksStack booksStack = new BooksStack();
        booksStack.push(book);
        System.out.println(book.name);

        BooksStack booksStack1 = new BooksStack();
        booksStack1.push(book1);
        System.out.println(book1.language);





    };
}
