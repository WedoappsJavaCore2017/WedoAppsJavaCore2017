package oop;

import javax.print.DocFlavor;

public class RecursionDemo {
    public static void main(String[] args) {
        System.out.println(factorial(4));

        String name = "String builder";
//        name ("");
        for (int i = 0; i < 10 ; i++) {
            name += i + " - index,  ";
        }

        System.out.println(name);
    }

    static long factorial(long i) {
        if(i == 1){
            return 1;
        }
        return factorial(i - 1) * i;
    }
}
