package cpython;

import java.util.Scanner;

public class BirinchiRaqam {
 // 23. Sonni birinchi raqami
  //Berilgan sonni birinchi raqamini topuvchi dastur tuzing.

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a=scanner.nextInt();
    int b=0;
    while(a>0){
      b=a%10;
      a=a/10;
    }
    System.out.println(b);
  }

}
// ikkita list int tipida, va random son berish kerak, va ikkita listni birlashtirish kerak, va birlashtirilgan listni sort qilish kerak
// 1. Listni birlashtirish
// 2. Listni sort qilish
// 3. Listni chiqarish