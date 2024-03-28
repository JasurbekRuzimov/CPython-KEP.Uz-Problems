package cpython.asoslar;

import java.util.Scanner;

class Nochiziqli {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    double S = (double) (x * x + 1) / (x * x + x * y + y * y);
    System.out.println(S);
  }
}

