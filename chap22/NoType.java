package chap22;
import chap21.Hero;


public class NoType {
  public static void prints(Object x, Object y) {
    for (int i = 0; i < (Integer)y; i++) {
      System.out.println(x);
    }
  }
public static void main(String[] args) {
  Object s = "こんにちは";
  s = new Hero();
  Object n = 1;
  prints(s, n);
}

}