package cpython;

import java.util.Scanner;

//124. Ikkita juft son
//Sizga n natural son berilgan bo'lib, uni ikkita natural juft sonni yig'indisi ko'rinishida ifodalab bo'lishini tekshiring.
public class IkkitaJuftSon {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int a = 0;
    int b = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        if (a == 0) {
          a = i;
        } else {
          b = i;
          break;
        }
      }
    }
    if (a != 0 && b != 0) {
      System.out.println("Ikkita juft son: " + a + " va " + b);
    } else {
      System.out.println("Ikkita juft son topilmadi");
    }
  }

}
