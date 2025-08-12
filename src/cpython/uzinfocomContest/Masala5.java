package cpython.uzinfocomContest;

import java.util.Scanner;

public class Masala5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine().trim();
    text = text.replaceAll("\\s+", " ");

    text = text.replaceAll("\\s+([,.!?])", "$1");

    text = text.replaceAll("([,.!?])(\\S)", "$1 $2");

    if (!text.isEmpty()) {
      text = text.substring(0, 1).toUpperCase() + text.substring(1);
    }
    System.out.println(text);
  }
}
