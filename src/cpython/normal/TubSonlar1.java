package cpython.normal;

import java.util.Scanner;

public class TubSonlar1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 1; i <= n; i++) {
      if (isPrime(i)) {
        System.out.print(i+" ");
      }
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