package homework_18_11_17.homeworkSeda;

import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n * n;
        int c1 = 0;
        int c2 = n - 1;
        int r1 = 0;
        int r2 = n - 1;
        int[][] arr = new int[n][n];
        while (k > 0) {
            for (int i = c1; i <= c2; i++) {
                arr[r1][i] = k;
                k--;
            }
            for (int j = r1 + 1; j <= r2; j++) {
                arr[j][c2] = k;
                k--;
            }
            for (int i = c2 - 1; i >= c1; i--) {
                arr[r2][i] = k;
                k--;
            }
            for (int j = r2 - 1; j >= r1 + 1; j--) {
                arr[j][c1] = k;
                k--;
            }
            c1++;
            c2--;
            r1++;
            r2--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}







