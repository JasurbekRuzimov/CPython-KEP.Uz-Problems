package cpython;

import java.util.ArrayList;
import java.util.List;

public class ListniBirlashtirish {

  public static void main(String[] args) {
    List<Integer> x = List.of(10, 15, 20, 25, 30);
    List<Integer> y = List.of(5, 10, 15, 20, 25);

    List<Integer> merged = merge(x, y);
    sort(merged);

    System.out.println("Birlashtirilgan list: " + merged);
  }

  private static List<Integer> merge(List<Integer> x, List<Integer> y) {
    List<Integer> merged = new ArrayList<>();
    merged.addAll(x);
    merged.addAll(y);
    return merged;
  }

  private static void sort(List<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i) > list.get(j)) {
          int temp = list.get(i);
          list.set(i, list.get(j));
          list.set(j, temp);
        }
      }
    }
  }


}



