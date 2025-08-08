package cpython.normal;
import java.util.Scanner;
public class TortOltiYokiBesh {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int times = 0;
    for (int i = 1; i <= n; i++) {
      if ((i % 4 == 0 && i % 6 == 0) || (i % 5 == 0)) {
        times++;
      }
    }
    System.out.println(times);
  }
}
