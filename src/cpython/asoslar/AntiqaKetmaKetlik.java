package cpython.asoslar;

import java.util.Scanner;


//18. Antiqa ketma-ketlik
class AntiqaKetmaKetlik {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    StringBuilder sb = new StringBuilder();
    boolean first = true;

    for (int i = 1; i <= n; i++) {
      int times = (i % 3 == 0) ? 3 : (i % 3);
      for (int j = 0; j < times; j++) {
        if (!first) sb.append(" ");
        sb.append(i);
        first = false;
      }
    }

    System.out.println(sb.toString());
  }
}
