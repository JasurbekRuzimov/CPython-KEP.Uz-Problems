package cpython.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MargeList {

  public static void main(String[] args) {

    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();

    Random random = new Random();

    for (int i = 0; i < 100; i++) {
      list1.add(random.nextInt(1000) + 1);
      list2.add(random.nextInt(1000) + 1);
    }

    System.out.println("List 1: " + list1);
    System.out.println("List 2: " + list2);

    ArrayList<Integer> mergedList = new ArrayList<Integer>();
    mergedList.addAll(list1);
    mergedList.addAll(list2);

    Collections.sort(mergedList);

    System.out.println("Birlashgan listlar" + mergedList);
  }

}
