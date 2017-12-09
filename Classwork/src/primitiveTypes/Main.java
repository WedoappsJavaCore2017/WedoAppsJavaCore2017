package primitiveTypes;

public class Main {

    static byte a = 10;

    public static void main(String[] args) {
//        byte a = 10;
        byte my_parameter = 20;
        byte c = 10, d = 3, h = 4;
        byte w;
        float a = 10.0f;
        double dble = 30d;
        boolean mBool = true;
        char capitalM = 'M';
        short mShort = 200;
//        w = (byte) (c + d);
//        System.out.println(w);
//        w = (byte) (w + 130);
//        System.out.println(w);
        byte myByte = (byte) 601;

//        int i = true;
//        System.out.println(myByte);
//        a = 30;
//        System.out.println(" a - " + a);
//        System.out.println(" b - " + b);
//        if (a < 20) {
//            System.out.println("a < 20");
//        } else {
//            System.out.println("a >= 20");
//        }
//        b = 30;

 /*       switch (b) {
            case 10:
                System.out.println(" b = 10");
                break;
            case 20:
                System.out.println(" b = 20 ");
                break;
            default:
                System.out.println(" default ");
        }
*/

//        a = (byte) (a + b);
//        System.out.println(" a - " + a);
//        System.out.println("ss");

        for (int i = 10, j = 20; i > 0; i = i - 1, j--) {
            System.out.println("i - " + i + "\n" + "j - " + j);
//            System.out.println("index = " + i + " " + (i < 5 ? i  + " < 5" : i + " >= 5 "));
        }

//        for (byte i = 0; i < 20; i++) {
//            if (i == 10) {
//                break;
//            }
//            System.out.println(i);
//        }

        //----------------------------------------------------------------------------------------//
//        int i = 0;
//        while (i < 30){
//            i++;
//            if( i == 2){
//                continue;
//            } else if(i == 19){
//                break;
//            }
//            System.out.println(" i = " + i);
//        }
//        int k = 0;
//        do {
//            k++;
//            if (k == 6) {
//                continue;
//            }
//            System.out.println(" k = " + k);
//        } while (k < 10);
    }

    public void myMethod() {
        a = 10;
    }
}
