package cpython.normal;

import java.util.Scanner;

public class OhirgiIkkitaSon {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int[] arr = new int[a];
    for (int i = 0; i < a; i++) {
      arr[i] = scanner.nextInt();
    }
    System.out.print(arr[arr.length - 2] + " " + arr[arr.length - 1]);
  }
}

//    Pythondagi kodi
//
//    a=int(input())
//    arr=[int(input())for _ in range(a)]
//    print(arr[-2],arr[-1])