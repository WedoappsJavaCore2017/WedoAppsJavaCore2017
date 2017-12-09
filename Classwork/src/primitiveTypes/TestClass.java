package primitiveTypes;

public class TestClass {

    public static void main(String arg[]){
        for (int main = 0; main<10; main++){
            if(main>8){

            }
            if(main == 8 || main == 7) {
                continue;
            }

            System.out.println(" main " +main);
        }
        int a = 4;
        while (a < 20) {
            System.out.println(a);
            a +=3;
        }

    }


}
