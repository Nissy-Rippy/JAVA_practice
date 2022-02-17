package chap15;
import java.util.Scanner;


public class ThrowAndCatch {

  static void check(int sw) throws Exception {
    switch (sw) {
      case 1: throw new Exception("検査例外発生！！");
      case 2: throw new RuntimeException("非検査例外発生！！");
    }
  }

  static void test(int sw) throws Exception {
    check(sw);
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("sw : ");
    int sw = stdIn.nextInt();
    try {
      test(sw);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
