package gor_gevorgyan.homework.homework;

public class BooksStack {

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

    public void push(Book value) {
        // TODO implement such that it will have ability to add elements unlimited.
        // this is mean that it must be checked
        // if tos == storage.length -1 then must be called a method for instance "extendStorage()"
        // in the mentioned method You must create new int[] fill in content of storage field,
        // and then assign the new array reference to the storage field.
        if (tos == storage.length - 1) {
            extendStorage();
        }
        value = storage[++tos];
    }

    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @return The value at the top of stack (tos) (the last item
     * of storage).
     */
    public Book pop() {
        // TODO implement
        if (tos == -1) {
            System.out.println("storage is empty");
            return null;
        }
//        System.out.println("autor is  " + storage[tos].author.name + "  book's name is  " + storage[tos].name);
        return storage[tos--];
    }

    /**
     * Method is invoked when storage is full and need to extend
     */
    private void extendStorage() {
        Book[] tempArray = new Book[storage.length + 10];
        for (int i = 0; i < storage.length; i++) {
            tempArray[i] = storage[i];
        }
        storage = tempArray;
    }
}
