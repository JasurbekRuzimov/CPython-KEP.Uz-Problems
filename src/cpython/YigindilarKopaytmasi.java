package cpython;

import java.util.Scanner;

public class YigindilarKopaytmasi {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int a = 1, b = 1, result=1;
    for (int i = 1; i <= n; i++) {
      a = a * i;
      b = b * (i + 1);
    }
    result = a * b / (int) Math.pow(2, n);
    System.out.println(result);
  }

}
