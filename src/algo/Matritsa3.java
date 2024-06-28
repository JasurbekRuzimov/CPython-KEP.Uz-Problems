package algo;

import java.util.Scanner;

public class Matritsa3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int L = scanner.nextInt();
      int[] elements = new int[L];
      for (int i = 0; i < L; i++) {
        elements[i] = scanner.nextInt();
      }
      int n = scanner.nextInt();
      int m = scanner.nextInt();

      int[][] matrix = new int[n][m];
      int index = 0;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if (index < L) {
            matrix[i][j] = elements[index++];
          } else {
            matrix[i][j] = 0;
          }
        }
      }

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }
    }
  }

