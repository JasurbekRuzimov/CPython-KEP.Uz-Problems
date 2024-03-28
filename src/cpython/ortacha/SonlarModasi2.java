package cpython.ortacha;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SonlarModasi2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] numbers = new int[n];
    for (int i = 0; i < n; i++) {
      numbers[i] = scanner.nextInt();
    }

    Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (int number : numbers) {
      frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
    }

    int maxFrequency = Collections.max(frequencyMap.values());
    int moda = Integer.MAX_VALUE;
    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
      if (entry.getValue() == maxFrequency && entry.getKey() < moda) {
        moda = entry.getKey();
      }
    }

    System.out.println(moda);
  }
}