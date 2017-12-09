import javax.print.DocFlavor;

public class WrapperClassDemo {

    private int a;


    public WrapperClassDemo(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
//        Integer i = new Integer(5);
//        Character ch = new Character('5');
//        Double d = new Double(45.00);
//        Float f = new Float(45.5f);
//        Boolean b = new Boolean(true);
//
//        Integer a = 5;
//        Integer aa = 5;
//        Integer c = 5;
//
//        a++;
//
//        Integer aaa = new Integer(55);
//
//        int cc = aaa;
//
//        System.out.println(c.equals(aa));
//        System.out.println(a == aaa);
//
//        a = -128;
//        aa = -128;
//        System.out.println(a == aa);
//
//        Integer w = new Integer(55);
//        Integer q = new Integer(56);
//        int iQ = 55;
//        System.out.println(q == iQ);
//
//


        WrapperClassDemo demo = new WrapperClassDemo(10);
        WrapperClassDemo demo1 = new WrapperClassDemo(10);
        System.out.println(demo.equals(demo1));
    }

}