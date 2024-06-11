package cpython.asoslar;

import java.util.Scanner;

public class Lenta {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n, m;
    n = scanner.nextInt();
    m = scanner.nextInt();
    int total = n / m;
    if (n % m != 0) {
      total++;
    }
    System.out.println(total);

  }

}
