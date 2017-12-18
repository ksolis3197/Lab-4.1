public class tester
{
  public static void main(String[] args)
  {
    String[] ranks = { "Forest", "Mountain", "Sea"}
    String[] suits = { "Lions", "Tigers", "Bear"};
    int[] pv = { 3,1,9,7};
    Deck tester = new Deck(ranks, suits, pv);

    System.out.println(tester);
    tester.shuffle();

    }
  }
}
