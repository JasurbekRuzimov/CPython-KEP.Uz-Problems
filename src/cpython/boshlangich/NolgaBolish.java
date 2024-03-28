package cpython.boshlangich;

import java.util.Scanner;

class NolgaBolish {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    int bolinuvchi = 0;

    if (b != 0) {
      bolinuvchi = a / b;
      System.out.println(bolinuvchi);
    } else {
      System.out.println("inf");
    }
  }
}
