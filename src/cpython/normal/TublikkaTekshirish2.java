package cpython.normal;

import java.util.Scanner;

public class TublikkaTekshirish2 {

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
    if (num == 2) {
      return true;
    }
    if (num % 2 == 0) {
      return false;
    }
    for (int i = 3; i <= Math.sqrt(num); i += 2) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}