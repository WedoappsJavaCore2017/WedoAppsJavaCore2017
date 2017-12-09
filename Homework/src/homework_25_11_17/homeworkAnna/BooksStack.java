package homework_25_11_17;

public class BooksStack{

    public static final int DEFAULT_CAPACITY = 16;

    /**
     * Data storage to store the Stack's values
     */
    private Book[] storage;


    /**
     * Index of the last element in the Stack.
     * Initial value must be -1.
     * This is not a length of data storage.
     * It must be increased when new element is added in to StackImpl
     * and decreased on pop action
     */
    private int tos;

    public BooksStack() {
        this(DEFAULT_CAPACITY);
    }

    public BooksStack(int capacity) {
        this.storage = new Book[capacity];
        this.tos = -1;
    }

//    END OF CONSTRUCTORS

    public void push(Book bk ) {
        if (tos == storage.length - 1){
            extendStorage();
        }
        storage[++tos] = bk;
    }

    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @return The value at the top of stack (tos) (the last item
     * of storage).
     */
    public Book pop() {
        return storage[tos--]; // TODO implement
    }

    /**
     * Method is invoked when storage is full and need to extend
     */
    private void extendStorage() {
        Book [] bookArray = new Book[storage.length * 2];
        for (int i = 0; i < tos; i++){
            bookArray[i] = storage[i];
        }
        storage = bookArray;
    }
//    public void rin(Book [] storage){
//        for ( int i = 0; i < storage.length; i++){
//            System.out.println(storage[i]);
//        }
//    }
}
