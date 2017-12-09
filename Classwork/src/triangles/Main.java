package triangles;

public class Main {
    public static void main(String[] args) {
        int row = 10;
//       printTriangleA(row);
//        System.out.println();
//       printTriangleB(row);
//        System.out.println();
//       printTriangleC(row);
//        System.out.println();
//       printTriangleD(row);
//        System.out.println();
//        printTriangleE(row);
//        System.out.println();
//        printTriangleF(row);


//        printTrinagleWithTwoFor(110);
        o:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue o;
                }
                System.out.print( "  " + i * j);
            }
        }
        System.out.println();
    }

    /*

        triangle A

         *****
          ****
           ***
            **
             *

     * @Param row is rows count
     */
    private static void printTriangleA(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = row; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*

        triangle B

             *
            **
           ***
          ****
         *****

     * @Param row is rows count
     */
    private static void printTriangleB(int row) {
        for (int i = row; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < row - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*

        triangle C

        *****
        ****
        ***
        **
        *

    * @Param row is rows count
    */

    private static void printTriangleC(int row) {
        for (int i = row; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*

        triangle D

        *
        **
        ***
        ****
        *****

    * @Param row is rows count
    */

    private static void printTriangleD(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*
        triangle E

           *
          ***
         *****
        *******
       *********

     * @Param row is rows count
     */
    private static void printTriangleE(int row) {
        if (row % 2 == 0) row += 1;
        for (int i = 1; i < row; i += 2) {
            for (int j = (row - i) / 2; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        triangle F

           *********
            *******
             *****
              ***
               *

    * @Param row is rows count
    */
    private static void printTriangleF(int row) {
        if (row % 2 == 0) row += 1;
        for (int i = row; i > 0; i -= 2) {
            for (int j = 0; j < row - i / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void printTrinagleWithTwoFor(int a) {
        for (int i = 0; i < a / 2; i++) {
            for (int j = 0; j < a; j++) {
                if (j > a / 2 - i && j < a / 2 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


}
