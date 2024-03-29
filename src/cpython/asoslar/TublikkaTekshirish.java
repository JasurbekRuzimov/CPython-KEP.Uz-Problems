package cpython.asoslar;

import java.util.Scanner;

public class TublikkaTekshirish {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    if (isPrime(num)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
  private static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}