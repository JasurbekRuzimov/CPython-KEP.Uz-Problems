package cpython.work;

public class TubRaqam {

  public static void main(String[] args) {
    //Berilgan natural sonni istalgan bir tub bo'lgan raqamini toping.Yagona qatorda masala yechimini chiqaring. Agar yechim mavjud bo'lmasa -1 ni chiqaring.

    int n = 893;
    int tub = 0;
    for (int i = 2; i < n; i++) {
      if (n % i != 0) {
        tub = -1;
        break;
      }
    }
    if (tub != 0) {
      System.out.println(2);
    } else {
      System.out.println(tub);
    }


  }

}
