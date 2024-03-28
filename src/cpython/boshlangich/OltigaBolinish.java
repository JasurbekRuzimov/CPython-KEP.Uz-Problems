package cpython.boshlangich;

import java.util.Scanner;

public class OltigaBolinish {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int x = n * (n + 1) * (n + 2);
    int qoldiq = x % 6;
    System.out.println(qoldiq);
  }
}



//  pythondagi yechimi


//  def qoldiq_topsish(n):
//    x = n * (n + 1) * (n + 2)
//    qoldiq = x % 6
//    return qoldiq
//    n = int(input())
//    natija = qoldiq_topsish(n)
//    print(natija)
