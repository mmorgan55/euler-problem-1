public class MultThreeFive {

  public static void main(String[] args) {
    System.out.println(mult35(1000));
  }

  private static int mult35(int limit) {
    int total = 0;
    for (int i = 0; i < limit; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        total += i;
      }
    }
    return total;
  }
}