package cpython.boshlangich;

import java.util.Scanner;

public class IkkiSondankattasi {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Birinchi sonni kiriting: ");
    int son1 = scanner.nextInt();

    System.out.print("Ikkinchi sonni kiriting: ");
    int son2 = scanner.nextInt();

    int engKatta = engKattaTopish(son1, son2);
    System.out.println("Eng katta son: " + engKatta);
  }

  public static int engKattaTopish(int son1, int son2) {
    if (son1 > son2) {
      return son1;
    } else {
      return son2;
    }
  }
}



//pythondagi yechimi
//  def eng_katta_aniqlash(son1, son2):
//    if son1 > son2:
//    return son1
//    else:
//    return son2
//
//    son1 = int(input())
//    son2 = int(input())
//
//    eng_katta = eng_katta_aniqlash(son1, son2)
//    print(eng_katta)
//
