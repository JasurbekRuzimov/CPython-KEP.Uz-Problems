package cpython.work;
import java.util.Scanner;

public class MassivBirYuzEkki {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    double[] arr = new double[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    double min =arr[0];
    for (int i = a; i <= b; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }

    for (int i = a; i <= b; i++) {
      arr[i] = arr[i] / min;
    }

    for (int i = 0; i < n; i++) {
      System.out.printf("%.1f ", arr[i]);
    }
  }
}