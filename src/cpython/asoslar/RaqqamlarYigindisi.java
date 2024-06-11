package cpython.asoslar;
import java.util.Scanner;
public class RaqqamlarYigindisi {
  //Berilgan sonni raqamlar yig'indisini hisoblovchi dastur tuzing.

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
      int sum = 0;
      while (num != 0) {
        sum += num % 10;
        num /= 10;
      }
      System.out.println(sum);
    }

}
