package chap21;
import java.lang.Comparable;

public class Account implements Comparable<Account> {

  private static int accountNum;
  private String name;
  private int id = 0;
  private int number;
  public int zandaka;

  static {  accountNum = 5 * 10; }
  { ++id; accountNum++; }
  public Account() { }
  public Account(String name) { this.name = name; }

  public String getName() { return this.name; }
  public void setName(String name) { this.name = name; }

  public int compareTo(Account obj) {
    if (this.number < obj.number) {
      return -1;
    }
    if (this.number > obj.number) {
      return 1;
    }
    return 0;
  }


}
