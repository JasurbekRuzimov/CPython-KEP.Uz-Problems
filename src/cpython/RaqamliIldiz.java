package cpython;

import java.util.Scanner;

class RaqamliIldiz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    if (a < 0) {
      return;
    }
    int b = 0;
    while (a > 0) {
      b += a % 10;
      a = a / 10;
    }
    while (b >= 10) {
      b = b / 10 + b % 10;
    }
    System.out.println(b);
  }
}