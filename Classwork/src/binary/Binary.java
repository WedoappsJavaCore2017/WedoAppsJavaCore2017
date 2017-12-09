package binary;

public class Binary {

    public static void main(String[] args) {
        byte b1 = 8;
        byte b2 = -8;

        String s1 = String.format("%8s", Integer.toBinaryString(b1 & 255)).replace(' ', '0');
        System.out.println(s1);

        String s2 = String.format("%8s", Integer.toBinaryString(b2 & 255)).replace(' ', '0');
        System.out.println(s2);

//        String s1 = String.format("%8s", Integer.toBinaryString(b1));
//        System.out.println(s1);
//
//        String s2 = String.format("%8s", Integer.toBinaryString(b2));
//        System.out.println(s2);
//
//        String s3 = String.format("%8s", Integer.toBinaryString(0xFF)).replace(' ', '0');
//        System.out.println(s3);

        int a = -42;
        int b = -8;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

    }
}
