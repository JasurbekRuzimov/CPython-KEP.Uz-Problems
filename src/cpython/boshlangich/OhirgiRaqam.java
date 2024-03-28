package cpython.boshlangich;

import java.util.Scanner;
public class OhirgiRaqam {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int son = scanner.nextInt();
    if (son % 10 == 5) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
