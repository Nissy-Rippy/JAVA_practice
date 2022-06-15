package chap21;
import chap12.TimeAccount;
import java.util.Scanner;
import java.util.Random;


public class Override {

  private static final String NAME = "ヨッシー！";
  
  private String accountNo;
  public static int count = 0;

  static { count = 8; }
  { ++count; }
  public Override() {  ; }
  public String toString() {
    return "でバックの際に必要である";
  }

  public boolean equals(Object o) {
      if (o == this) return true;
      if (o == null) return false;
      // if (!(o instanceof Account)) return false;
       TimeAccount r = (TimeAccount)o;
    //trim()を使って文の先頭と末尾の空白を削除して数字だけを入手する
      if(this.accountNo.trim().equals(r.accountNo.trim())) { return false; }
      return true;
    }

    public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);
      Random rand = new Random();


  }

}