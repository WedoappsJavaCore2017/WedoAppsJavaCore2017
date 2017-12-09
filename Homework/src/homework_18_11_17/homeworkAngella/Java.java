/**
 * Created by Angela on 11/15/2017.
 */
public class Java {

    public static void main(String[] args) {

        int n = 25;
        int count = 0;
        int jCount = 5;
           int x = 3;
           int y = 2;
        int nLast = n - jCount;
        int nFirst = nLast - (jCount + (jCount - 3)* 2 + 1);
        int nMedial = nFirst - 1;

            for (int j = 0; j <jCount; j++) {

                if (count == 0){
                System.out.print(n + " ");
                    n--;}
                if (count < jCount - 1 && count > 0){
                    if (j == 0){
                        System.out.print(nFirst+ " ");
                        nFirst++;
                    }
                    else if(j == jCount - 1){
                        System.out.print(nLast );
                        nLast--;
                        n--;
                    }
                  if (count == 1 && j >= 1 && j < jCount - 1){
                      System.out.print(nMedial + "  ");
                      nMedial--;
                  }
                  else if (count == 3 && j >= 1 && j < jCount - 1){
                      System.out.print(x + "  ");
                      x++;
                  }
                  else if (count == 2 && j >= 1 && j < jCount - 1){
                    if (j == 2 || j == 1) {
                        System.out.print(y + "  ");
                        y--;
                    }
                    else {
                        System.out.print(nMedial + "  ");
                    }
                  }

                }
                if (count == jCount - 1 ){
                    System.out.print(nFirst + " ");
                    nFirst++;
                }
                if (j == jCount - 1){
                    System.out.println();
                    j = -1;
                    count++;
                }
                if (count==jCount){
                    break;
                }
            }
    }
    }



