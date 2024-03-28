package cpython.ilgor;

import java.util.Scanner;

//Sizga n soni berilgan. [1;n] oralig'ida bo'lgan sonlar orasida barcha tub sonlarni ekranga chiqaring.
public class TubSonlar2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("n sonini kiriting: ");
    int n = scanner.nextInt();
    System.out.println("Tub sonlar:");
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }
  public static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}