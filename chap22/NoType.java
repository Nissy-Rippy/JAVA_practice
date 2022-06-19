package chap22;
import chap21.Hero;


public class NoType {
  public static void prints(Object x, Object y) {
    for (int i = 0; i < (Integer)y; i++) {
      System.out.println(x);
    }
  }
  public static void prints1(String x, int y) {
    for (int i = 0; i < (Integer) y; i++) {
      System.out.println(x);
    }
  }
public static void main(String[] args) {
  Object s = "こんにちは";
  s = new Hero();
  Object n = 1;
  prints(s, n);
  //型が違うためコンパイルの時点でエラーが起きる
  // prints1(s, n);
}

}