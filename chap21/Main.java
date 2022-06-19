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

    //これは匿名クラスを使っている例である!!
    // Collections.sort(list,
    // new Comparator<Account>() {
    //   public int compareTo(Account x, Account y) {
    //     return Integer.compare(x, y);
    //   }
    // });

    // Collections.sort(list,
    // (x, y) -> Integer.compare(x, y);
    // );

    //これは、java.util.Comparator;のcompareをOVerrideして利用している。
    Collections.sort(list, new ZandakaComparator());
    //Collectons.sortが引数の数によって使うメソッドを選定している。


    //番号で並び替える
    TreeSet<Account> accounts1 = new TreeSet<>();
    //残高で並べ替える
    TreeSet<Account> accounts2 = new TreeSet<>(new ZandakaComparator());
  


  Hero h1 = new Hero("みなと", new Sword("みつまた"));
  Sword s = new Sword("鋼の剣");
  h1.setSword(s);
  System.out.println( "装備: " + h1.getSword().getName() );
  System.out.println("clone で複製します！！");
  Hero h2 = h1.clone();

  System.out.println("コピー元の勇者の剣の名前をかえます!");
  h1.getSword().setName("ヒノキの棒");
  System.out.println("コピー元とコピー先の勇者の装備を表示します//");
  System.out.pritnln("コピー元：　" + h1.getSword().getName() + "コピー先の剣の名前: " + h2.getSword().getName() );




  }
}
