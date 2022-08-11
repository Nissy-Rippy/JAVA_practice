import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Chap1 {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 6 };
    int[] b = { 1, 2, 3, 4, 5, 6 };

    System.out.println( "誤った判定: " + a.equals(b) );
    System.out.println( "正しい判定: " + Arrays.equals(a, b) ); //Arrays.equalsに既に定義してある。
    
    Set<Hero> lists = new HashSet<>();
    Hero aa = new Hero();
    aa.name = "みなみ";
    aa.hashCode();
    lists.add(aa);
    System.out.println( lists.size() );
    aa = new Hero();
    aa.name = "みなみ";
    aa.hashCode();
    lists.remove(aa);
    System.out.println( lists.size() );

    Collections.sort( list );
    Collections.sort( list, new ZandakaComparator() );

   TreeSet<Account> accounts1 = new TreeSet<>();
   TreeSet<Account> accounts2 = new TreeSet<>( new ZandakaComparator() );
   
  }
}