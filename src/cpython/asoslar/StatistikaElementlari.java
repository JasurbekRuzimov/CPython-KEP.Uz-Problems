package cpython.asoslar;

import java.util.Scanner;

class StatistikaElementlari {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double ortaArifmetik = (a + b) / 2;
    System.out.println(ortaArifmetik);
    double ortaGeometrik = Math.sqrt(a * b);
    System.out.println(ortaGeometrik);
    double ortaGarmonik = 2 / ((1/a) + (1/b));
    System.out.println(ortaGarmonik);
  }
}
