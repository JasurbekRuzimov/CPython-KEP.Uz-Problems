package cpython.boshlangich;

import java.util.Scanner;

public class Faktorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("n ni kiriting: ");
    int n = scanner.nextInt();
    int kopaytma = 1;
    for (int i = 1; i <= n; i++) {
      kopaytma *= i;
    }
    System.out.println(kopaytma);
  }
}
