
import java.util.Comparator;


public class ZandakaComparator implements Comapartor<Account> {
  public int compare(Account x, Account y) {
    return (x.zandaka - y.zandaka);
  }
}
