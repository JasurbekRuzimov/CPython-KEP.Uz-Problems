package cpython.asoslar;

import java.util.Scanner;

public class BolinmaydiganSon {
//Sizga n soni berilgan. Sizni vazifangiz
// n sonini bo'luvchisi bo'lmagan eng kichik natural sonni topish. scanner bilan ishlash kerak

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i=1; i<=n; i++){
      if (n%i != 0){
        System.out.println(i);
        break;
      }
    }


  }

}
