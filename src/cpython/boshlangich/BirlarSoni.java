package cpython.boshlangich;

import java.util.Scanner;

class BirlarSoni {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int son = scanner.nextInt();
    int qatnashishlarSoni = 0;
    while (son != 0) {
      int raqam = son % 10;
      if (raqam == 1) {
        qatnashishlarSoni++;
      }
      son /= 10;
    }
    System.out.println(qatnashishlarSoni);
  }
}
