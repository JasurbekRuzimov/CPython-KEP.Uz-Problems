package cpython;
//Indinga yakshanba kuni kelishiga qancha kun qoladi?
public class HaftaKuni {

  public static void main(String[] args) {
    int kun = 1;
    int hafta = 1;
    while (kun < 365) {
      if (hafta == 7) {
        hafta = 1;
      } else {
        hafta++;
      }
      kun++;
    }
    System.out.println(hafta);
  }

}
