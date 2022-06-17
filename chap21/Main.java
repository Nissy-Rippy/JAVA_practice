package chap21;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    List<Account> list = new ArrayList<>();
    //これは、java.lang.Collectionsのcompare
    Collections.sort(list);

    // Collections.sort(list,
    // new Comparator<Account>() {
    //   @Override
    //   public int compareTo(Account x, Account y) {
    //     return Integer.compare(x, y);
    //   }
    // });

    // Collections.sort(list,
    // (x, y) -> Integer.compare(x, y);
    // );

    //これは、java.util.Comparator;のcompareをOVerrideして利用している。
    Collections.sort(list, new Zandaka());
    //Collectons.sortが引数の数によって使うメソッドを選定している。
    TreeSet<Account> accounts1 = new TreeSet<>();
    TreeSet<Account> accounts2 = new TreeSet<>(new Zandaka());
  
  Hero h = new Hero();


  Hero h1 = new Hero();
  Hero h2 = h1.clone();

  }
}
