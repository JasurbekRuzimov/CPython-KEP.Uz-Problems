package cpython.work;


import java.util.Arrays;
import java.util.Scanner;

public class Main12 {
  public static int maximizeParticipation(int[] akaUkalars, int R) {
    Arrays.sort(akaUkalars);
    int totalParticipations = 0;

    for (int i = akaUkalars.length - 1; i >= 0; i--) {
      if (akaUkalars[i] >= R) {
        totalParticipations += akaUkalars[i] / R;
        R = 0;
      } else {
        R -= akaUkalars[i];
      }
    }

    return totalParticipations;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Birinchi qatordan qiymatlarni olish
    int n = scanner.nextInt();
    int R = scanner.nextInt();

    // Ikkinchi qatordan reytinglarni olish
    int[] akaUkalars = new int[4];
    for (int i = 0; i < 4; i++) {
      akaUkalars[i] = scanner.nextInt();
    }

    // Uchinchi qatordan aka-ukalar qancha marotaba musobaqada qatnashishlari mumkinligini olish
    int[] participationLimits = new int[4];
    for (int i = 0; i < 4; i++) {
      participationLimits[i] = scanner.nextInt();
    }

    // Natijani chiqarish
    int result = 0;
    for (int i = 0; i < 4; i++) {
      int maxParticipation = maximizeParticipation(Arrays.copyOf(akaUkalars, akaUkalars.length), R);
      result += Math.min(maxParticipation, participationLimits[i]);
    }

    System.out.println(result);

    // Scanner'ni yopish
    scanner.close();

  }
}

