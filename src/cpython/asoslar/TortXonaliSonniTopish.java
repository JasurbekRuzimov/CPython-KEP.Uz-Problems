package cpython.asoslar;

public class TortXonaliSonniTopish {

  public static void main(String[] args) {
    for (int i = 1000; i <= 9999; i++) {
      int reversed = reverseNumber(i);
      if (reversed/i == 4) {
        System.out.println("Topilgan son: " + i);
        break;
      }
    }
  }

  private static int reverseNumber(int num) {
    int reversed = 0;
    while (num != 0) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }
    return reversed;
  }
}