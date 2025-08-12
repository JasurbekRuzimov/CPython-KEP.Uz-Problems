package cpython.uzinfocomContest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class masala4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    String startDateStr = scanner.nextLine();
    String endDateStr = scanner.nextLine();

    LocalDate start = LocalDate.parse(startDateStr, formatter);
    LocalDate end = LocalDate.parse(endDateStr, formatter);

    int beautifulDays = 0;

    while (!start.isAfter(end)) {
      if (start.getDayOfWeek().getValue() == 5) {
        beautifulDays++;
      }
      start = start.plusDays(1);
    }
    System.out.println(beautifulDays);
  }
}
