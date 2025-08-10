package cpython.ortacha;
import java.util.Scanner;

public class RaqamliIldiz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    sc.close();

    while (n.length() > 1) {
      int sum = 0;
      for (char c : n.toCharArray()) {
        sum += c - '0';
      }
      n = String.valueOf(sum);
    }

    System.out.println(n);
  }
}
