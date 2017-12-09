package arrayUtils;

public class GMA {


    public static final double ALGORITHM = 12;
    public static final double DISCRET = 100;
    public static final double ANGL = 100;
    public static final double JAVA = 25;
    public static final double DB = 100;


    public static void main(String[] args) {

        double Mkrtich_Algorithm = percent(ALGORITHM, 11.25);
        double Mkrtich_Java = percent(JAVA, 23);

        double Angela_Algorithm = percent(ALGORITHM, 11.25);
        double Angela_Java = percent(JAVA, 21.5);

        double Gor_Algorithm = percent(ALGORITHM, 8.25);
        double Gor_Java = percent(JAVA, 19.5);

        double Aram_Algorithm = percent(ALGORITHM, 3);
        double Aram_Java = percent(JAVA, 20);

        double Seda_Algorithm = percent(ALGORITHM, 9.75);
        double Seda_Java = percent(JAVA, 22);

        double Anna_Algorithm = percent(ALGORITHM, 8.75);
        double Anna_Java = percent(JAVA, 21.5);


//        System.out.println("Mkrtich - " + Mkrtich_Algorithm);
//        System.out.println("Angela - " + Angela_Algorithm);
//        System.out.println("Gor - " + Gor_Algorithm);
//        System.out.println("Aram - " + Aram_Algorithm);
//        System.out.println("Seda - " + Seda_Algorithm);
//        System.out.println("Anna - " + Anna_Algorithm);


//        System.out.println("Mkrtich - " + studentAVG(Mkrtich_Algorithm, Mkrtich_Java , 53, 57, 85) + " % ");
//        System.out.println("Angela - " + studentAVG(Angela_Algorithm, Angela_Java , 60, 70, 91) + " % ");
//        System.out.println("Gor - " + studentAVG(Gor_Algorithm, Gor_Java , 35, 40, 73) + " % ");
//        System.out.println("Aram - " + studentAVG(Aram_Algorithm, Aram_Java , 40, 40, 85) + " % ");
//        System.out.println("Seda - " + studentAVG(Seda_Algorithm, Seda_Java , 60, 44, 90) + " % ");
//        System.out.println("Anna - " + studentAVG(Anna_Algorithm, Anna_Java , 63, 67, 82) + " % ");

    }


    static double percent(double max, double mark) {

        return mark * 100 / max;

    }

    static double studentAVG(double alg, double java, double discret, double db, double ang) {
        return (alg + java + discret + db + ang) / 5;
    }

}
