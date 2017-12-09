package gor_gevorgyan.homework.homework;


public class BooksStackDemo {
    public static void main(String[] args) {
        BooksStack booksStack = new BooksStack();


        Author authorName = new Author("de","d",4,"fd",6,"d");

        Book b = new Book("a",authorName,7,"s","s","s","s",8);

        booksStack.push(b);
        booksStack.push(b);
        booksStack.push(b);
        booksStack.push(b);
        booksStack.push(b);
        booksStack.push(b);
        booksStack.push(b);
        booksStack.push(b);
        booksStack.push(b);
        booksStack.push(b);

        booksStack.pop();
        booksStack.pop();
        booksStack.pop();
        booksStack.pop();
    }

}
