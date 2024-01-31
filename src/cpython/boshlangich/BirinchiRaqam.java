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