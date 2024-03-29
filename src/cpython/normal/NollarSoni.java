package cpython.normal;

import java.util.Scanner;

public class NollarSoni {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    int count = 0;


    if (n == 0) {
      System.out.println(1);
    } else {
      while (n % 10 == 0 && n != 0) {
        count++;
        n = n / 10;
      }
      System.out.println(count);
    }
  }
}