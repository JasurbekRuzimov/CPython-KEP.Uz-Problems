package cpython.asoslar;

public class TortXonaliSonlar {
// Barcha 4 xonali sonlar ichida raqamlari yig'indisi juft bo'lgan
// sonlarni ekranga chop etuvchi dastur tuzing.
  public static void main(String[] args) {
    for (int i = 1000; i <= 9999; i++) {
      if (yigindiJuftmi(i)) {
        System.out.print(i+" ");
      }
    }
  }

  private static boolean yigindiJuftmi(int num) {
    int sum = 0;
    while (num != 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum % 2 == 0;
  }
}