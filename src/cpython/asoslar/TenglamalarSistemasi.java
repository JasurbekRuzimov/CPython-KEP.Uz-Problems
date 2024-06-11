package cpython.asoslar;

import java.util.Scanner;

public class TenglamalarSistemasi {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    double discriminant = a * a - 4 * b;

    double x1 = (a + Math.sqrt(discriminant)) / 2;
    double x2 = (a - Math.sqrt(discriminant)) / 2;

    double y1 = a - x1;
    double y2 = a - x2;

    if (x1 > 0 && y1 > 0) {
      System.out.println(x1 + " " + y1);
    } else if (x2 > 0 && y2 > 0) {
      System.out.println(x2 + " " + y2);
    } else {
      System.out.println("");
    }
  }
}
