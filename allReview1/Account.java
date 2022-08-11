// package allReview;

public class Account implements Comparable<Account> {
  int number;
  int zansaka;

  public int compareTo(Account obj) {
    if ( this.number < obj.number ) {
      return -1;
    } else if ( this.number > obj.number) {
      return 1;
    } else {
      return 0;
    }
  }
}
