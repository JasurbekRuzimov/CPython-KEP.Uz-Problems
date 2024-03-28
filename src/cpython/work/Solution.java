package cpython.work;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
  public static int maximizeSum(int[] arr, int K) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int num : arr) {
      pq.add(num);
    }

    while (K > 0) {
      int min = pq.poll();
      pq.add(-min);
      K--;
    }
    int sum = 0;
    while (!pq.isEmpty()) {
      sum += pq.poll();
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scan.nextInt();
    }
    int K = scan.nextInt();
    scan.close();
    int maxSum = maximizeSum(arr, K);
    System.out.println(maxSum);
  }
}

