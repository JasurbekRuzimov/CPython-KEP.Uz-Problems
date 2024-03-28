package cpython.boshlangich;

import java.util.Scanner;

public class BolinishniTekshirish {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    if (a % b == 0 || b % a == 0) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
