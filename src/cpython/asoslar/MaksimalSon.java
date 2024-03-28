package cpython.asoslar;

import java.util.Scanner;

public class MaksimalSon {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[4];

    for (int i = 0; i < 4; i++) {
      arr[i] = sc.nextInt();
    }
    int max = arr[0];
    int sum = 0;
    for (int i = 0; i < 4; i++) {
      if (arr[i] > arr[0]) {
        max = arr[i];
      }
      sum += arr[i];
    }

    if (max > (sum - max)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}
