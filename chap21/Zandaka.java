package chap21;

import java.util.Comparator;

public class Zandaka implements Comparator<Account> {

  public int compare(Account x, Account y) {
        return (x.zandaka - y.zandaka);
      }

}

