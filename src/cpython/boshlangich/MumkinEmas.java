package cpython;

public class MumkinEmas {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    int sum = 0;
    for (int i = 0; i < 4; i++) {
      sum += arr[i];
    }
    if (sum % 2 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}
