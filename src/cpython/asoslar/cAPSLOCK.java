package cpython.asoslar;

import java.util.Scanner;

public class cAPSLOCK {

  //Satr berilgan bo'lib, satr caps lock orqali yozilganligini tekshiring.
// Satr caps lock orqali yozilgan, agarda satrni birinchi harfi kichik,
// qolganlari esa katta bo'lsa yoki barcha harflari katta harflar bo'lsa.

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    if (input.isEmpty()) {
      System.out.println("False");
    } else if (input.equals(input.toUpperCase())) {
      System.out.println("True");
    } else if (input.length() > 1 && input.substring(1).equals(input.substring(1).toUpperCase())) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}

