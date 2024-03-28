package cpython.boshlangich;

import java.util.Scanner;

public class SonVaRaqam {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int son = scanner.nextInt();
    int raqam = scanner.nextInt();
    String sonString = Integer.toString(son);
    String natija = sonString.concat(Integer.toString(raqam));
    System.out.println(natija);
  }
}

