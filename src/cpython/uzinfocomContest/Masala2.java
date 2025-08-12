package cpython.uzinfocomContest;

import java.util.Scanner;

public class Masala2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    if(n>k && k>0){
      System.out.println("legal");
    } else if (n>=k*(-1) && k<0 ) {
      System.out.println("legal");
    }else {
      System.out.println("out of bounds");
    }

  }
}