package cpython.asoslar;

import static java.lang.Math.pow;

import java.util.Scanner;

//You are given a natural number n. Your task is to calculate |√1| + |√2| + |√3|+…+|√n|, where |x| denotes the integer part of x.




public class IldizlariYigindisi {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s = 0;
    for (int i = 1; i <= n; i++) {
      s += (int) pow(i,(0.5));
    }
    System.out.println(s);
  }
}
