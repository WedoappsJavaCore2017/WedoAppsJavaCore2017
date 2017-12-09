package dinamicArray;

public class DynamicArray {

    public static final int DEFAULT_CAPACITY = 16;
    private int[] storage;
    private int size;

    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicArray(int capacity) {
        storage = new int[capacity];
        size = 0;
    }


    /**
     * Returns the number of elements in this DynamicArray.
     *
     * @return the number of elements in this DynamicArray
     */
    public int size() {
        return size;
    }

    /**
     * Returns <tt>true</tt> if this DynamicArray contains no elements.
     *
     * @return <tt>true</tt> if this DynamicArray contains no elements
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns <tt>true</tt> if this DynamicArray contains the specified element.
     * More formally, returns <tt>true</tt> if and only if this DynamicArray contains
     * at least one element <tt>e</tt>
     *
     * @param e element whose presence in this DynamicArray is to be tested
     * @return <tt>true</tt> if this DynamicArray contains the specified element
     */
    public boolean contains(int e) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == e) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the index of the I occurrence of the specified element
     * in this DynamicArray, or -1 if this DynamicArray does not contain the element.
     */
    public int indexOf(int element) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the element at the specified position in this DynamicArray.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this DynamicArray
     */
    public int get(int index) {
        if (index < 0 || index > size - 1) {
            return 0;
        }
        return storage[index];
    }

    /**
     * Replaces the element at the specified position in this DynamicArray with
     * the specified element.
     *
     * @param index   index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     */
    public int set(int index, int element) {
        if (index < 0 || index > size - 1) {
            return 0;
        }
        int temp = storage[index];
        storage[index] = element;
        return temp;
    }

    /**
     * Appends the specified element to the end of this DynamicArray.
     *
     * @param element element to be appended to this DynamicArray
     * @return <tt>true</tt>
     */
    public void add(int element) {
        if (size == storage.length) {
            extendStorage();
        }
        storage[size++] = element;
    }

    /**
     * Inserts the specified element at the specified position in this
     * DynamicArray. Shifts the element currently at that position (if any) and
     * any subsequent elements to the right (adds one to their indices).
     *
     * @param index   index at which the specified element is to be inserted
     * @param element element to be inserted
     */
    public void add(int index, int element) {
        if (index < 0 || index > size) {
            return;
        }
        if (size == storage.length) {
            extendStorage();
        }
        for (int i = size - 1; i >= index; i--) {
            storage[i + 1] = storage[i];
        }
        storage[index] = element;
        size++;
    }

    /**
     * Removes the element at the specified position in this DynamicArray.
     * Shifts any subsequent elements to the left (subtracts one from their
     * indices).
     *
     * @param index the index of the element to be removed
     * @return the element that was removed from the DynamicArray
     */
    public int remove(int index) {
        if(index < 0 || index > size - 1){
            return 0;
        }
        int temp = storage[index];
        for (int i = index; i < size - 1; i++) {
            storage[i] = storage[i+1];
        }
        size--;
        return temp;
    }


    /**
     * Method is invoked when storage is already full, and need to extend it.
     */
    private void extendStorage() {
        int[] temp = new int[storage.length * 3 / 2];
        for (int i = 0; i < storage.length; i++) {
            temp[i] = storage[i];
        }
        storage = temp;
    }


    public int getElementCount(int element){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(storage[i] == element){
                count++;
            }
        }
        return count;
    }


}
