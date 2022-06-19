package chpa23;
//クラスメソッドを短く書きたいときに static package クラス名 使うメソッド等 を記入すると短くかける
import static chpa23.AccountType.FUTU;

public class Account {
  private String accountNo;
  // private String accountType;
  private int zandaka;
  private AccountType accountType;//列挙型！！！
  public Account(String accountNo, AccountType accountType) { this.accountNo = accountNo; this.accountType = accountType; }

  public static void main(String[] args) {
    Account ac = new Account("1213", FUTU);
    Account bc = new Account("123", AccountType.TEIKI);
  }
}
