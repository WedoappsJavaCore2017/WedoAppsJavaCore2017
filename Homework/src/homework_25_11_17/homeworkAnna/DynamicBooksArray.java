package authorBook;

import java.util.Arrays;

public class DynamicBooksArray {

    // սա մասիվն է, որը միայն ներքին օգտագործման համար է, և որը հետո extend մեթոդի մեջ մեծանալու է
    private Book[] array = new Book[16];

    //սա մասիվի մեջի էլեմենտների քանակն է․ սկզբից 0 է, հետո ամեն անգամ երբ կանչենք add մեթոդը, պիտի size-ը մեծանա մեկով
    private int size = 0;


    //այս մեթոդը նախատեսված է մասիվի մեջ ավելացնել ընդունող value-ն; ամեն անգամ ավելացնելուց առաջ պետք է ստուգել
    //արդյոք մասիվի մեջ տեղ կա թե ոչ? եթե չկա, կանչել extend մեթոդը
    public void add(Book book) {
        if (size == array.length - 1) {
            extend();
        }
        array[size++] = book;

    }

    //այս մեթոդի նպատակն է ստեղծել նոր մասիվ, որը կլինի array-ի նախքին չափս + 10 էլեմենտանի, հետո ցիկլով կազմակերպել
    //հին մասիվի էլեմենտների վերագրումը նոր մասիվին, և վերջում հին մասիվին վերագրել նոր մասիվը։
    private void extend() {
        Book[] array1 = new Book[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array = array1;
    }


    //Այս մեթոդը վերադարձնում է մասիվի -iրդ էլեմենտը
    public Book get(int i) {
        return array[i];
    }

    // սա ուղղակի տպում է array մասիվի էլեմենտները։
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

}
