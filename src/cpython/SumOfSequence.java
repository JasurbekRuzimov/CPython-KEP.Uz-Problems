package cpython;
// k ta birinchi hadning yig'indisini Java tilida topish
import java.util.Scanner;
public class SumOfSequence {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int k = input.nextInt();
    double sum = 0;
    int number = 1;
    int count = 0;
    while (count < k) {
      if (isPrime(number)) {
        sum = sum + 1.0 / (2 * count + number);
        count++;
      }
      number++;
    }
    System.out.println(sum);
  }


  public static boolean isPrime(int number) {
    for (int i = 2; i <= number / 2; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
