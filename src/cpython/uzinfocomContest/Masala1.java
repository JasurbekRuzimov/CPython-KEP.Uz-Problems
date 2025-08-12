package cpython.uzinfocomContest;

import java.util.Scanner;

public class Masala1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    String[] aks_sado = new String[s.length()];
    for(int i=1; i<s.length(); i++){

      for (String string : aks_sado) {
        string = s.substring(0);

        System.out.println(string+string);
      }
    }

  }
}