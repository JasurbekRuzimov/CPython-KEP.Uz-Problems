package cpython.boshlangich;
import java.util.Scanner;

class TeskariSon {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int son = scanner.nextInt();
    int teskariSon = 0;
    while (son != 0) {
      int raqam = son % 10;
      teskariSon = teskariSon * 10 + raqam;
      son = son / 10;
    }
    System.out.println(teskariSon);
  }
}
