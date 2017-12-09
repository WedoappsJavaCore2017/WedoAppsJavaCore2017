package javaSETests;

class SuperClass {
    SuperClass(int x) {
        System.out.println("Super");
    }
}

public class SubClass extends SuperClass {
    SubClass() {
        super(10);
        // Line n1         System.out.println("Sub 2");
    }
}