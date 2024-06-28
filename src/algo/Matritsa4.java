package algo;

import java.util.Scanner;

public class Matritsa4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[][] matritsa1 = new int[n][n];
    int[][] matritsa2 = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matritsa1[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matritsa2[i][j] = scanner.nextInt();
      }
    }


    int[][] natija = new int[n][2 * n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        natija[i][j] = matritsa1[i][j];
        natija[i][j + n] = matritsa2[i][j];
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 2 * n; j++) {
        System.out.print(natija[i][j] + " ");
      }
      System.out.println();
    }
  }
}
