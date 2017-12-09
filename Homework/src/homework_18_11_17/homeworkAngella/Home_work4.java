import java.util.Random;
import java.util.Scanner;

/**
 * Created by Angela on 11/12/2017.
 */
public class Home_work4 {
    public static void main(String[] args) {






    }

      /*  Ստեղծել ծրագիր, որն օգտագործողից կհարցնի 1 թիվ (Scanner - ի միջոցով, օրինակներն ունենք նախորդ դասից)
       և կստուգի այդ թիվն պարզ է, թե ոչ, եթե պարզ է ուղղակի կոնսոլի մեջ պետք է տպի, որ մուտքագրված թիվն պարզ է,
       եթե պարզ չէ, ապա պետք է տպի, որ մուտքագրված թիվն պարզ չէ և պետք է տպի այդ թվի բոլոր բաժանարարները։*/


    static void isSimple() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("insert number but not 0");
            int x = scanner.nextInt();
            if (x == 0) break;
            boolean parz = true;
            String bajanarar = "";

            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    bajanarar += i + " ";
                    parz = false;
                }
            }
            if (parz) {
                System.out.println("parz e");
            } else {
                System.out.println("parz che  " + bajanarar);
            }
        }
    }

       /* Ստեղծել ծրագիր, որն օգտագործողից կհարցնի 1 - 9 միջակայքում ընկած որևէ թիվ և կոնսոլում կտպի
       այդ թվի բազմապատկման աղյուսակն, օրինակ 9 - ի դեպքում պետք է տպի հետևյալն.
        0 x 9 = 0
        1 x 9 = 9
        2 x 9 = 18
        3 x 9 = 27
        4 x 9 = 36
        5 x 9 = 45
        6 x 9 = 54
        7 x 9 = 63
        8 x 9 = 72
        9 x 9 = 81
        10 x 9 = 90
        */

    static void table() {

       while(true)
    {
        System.out.println("insert number between 1-9");
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        if (y > 10 || y < 1) break;
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " * " + y + " = " + i * y);
        }

    }

}

     /*   3.    Ստեղծել ծրագիր, որն 20 - չափանի զանգվածի մեջ կավելացնի պատահական թվեր, սորտավորել զանգվածն
        աճման կարգով և գտնել մաքսիմում և մինիմում արժեքներն։
         */



     static void sortArray() {
         Random random = new Random();
         int arrSort[] = new int[20];
         int temp;
         for (int i = 0; i < arrSort.length; i++) {
             arrSort[i] = random.nextInt(100);
             System.out.print(arrSort[i] + " ");
         }
         //sort

         int j;
         for (int i = 1; i < arrSort.length; i++) {
             j = i;
             while (j > 0 && arrSort[j] < arrSort[j - 1]) {

                 temp = arrSort[j];
                 arrSort[j] = arrSort[j - 1];
                 arrSort[j - 1] = temp;
                 j--;
             }
         }

         System.out.println();

         for (int i = 0; i < arrSort.length; i++) System.out.print(arrSort[i] + " ");
         System.out.println();
         System.out.println("min is "  + arrSort[0] );
         System.out.println("max is "  + arrSort[arrSort.length - 1] );
     }


      //  Օգտագործողից հարցնել 10 - ից մեծ թիվ, զանգվածի մեջ պահել այդ թվի թվանշաններն և տպել զանգվածն կոնսոլում։


 static void firstSecondNums() {
            Scanner scan = new Scanner(System.in);
            int firstNum;
            int lastNum;
            while (true) {
                System.out.println("insert bigger than 9");
                int x = scan.nextInt();
                if (x < 10)
                    break;
                lastNum = x % 10;
                firstNum = x / 10;
                System.out.println(firstNum + " " + lastNum);


            }
        }


    }

