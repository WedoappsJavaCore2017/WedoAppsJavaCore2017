package homework_25_11_17.homeworkSeda;

public class BooksStack {
    private int tos;
    private Books booksArray[];

    public BooksStack(int coapacity) {
        tos = -1;
        this.booksArray=new Books[coapacity];
    }
    public void Push(Books book){
        booksArray[++tos]=book;
    }

    public Books Pop(){
        return booksArray[tos--];
    }
}
