package cpython.boshlangich;
//Shunday 4 xonali son toping, uni birinchi raqami ikkinchi raqamidan 3 marta kichik, uchinchi raqami birinchi va ikkinchi raqamlar yig'indisiga teng va to'rtinchi raqam ikkinchi raqamdan 3 marta katta.
public class TortXonaliSonniTopish2 {

  public static void main(String[] args) {
    int son = 0;
    for (int i = 1000; i < 10000; i++) {
      int birinchiRaqam = i / 1000;
      int ikkinchiRaqam = i / 100 % 10;
      int uchinchiRaqam = i / 10 % 10;
      int tortinchiRaqam = i % 10;

      if (birinchiRaqam == ikkinchiRaqam - 3 && uchinchiRaqam == birinchiRaqam + ikkinchiRaqam && tortinchiRaqam == ikkinchiRaqam * 3) {
        son = i;
        break;
      }
    }
    System.out.println("Topilgan son: " + son);
  }

}
