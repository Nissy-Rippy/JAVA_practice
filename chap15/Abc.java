package chap15;
import java.util.Scanner;

//継承する
class CheckedException extends Exception {

  CheckedException(String s, Throwable e) { super(s, e); }
}
class UncheckedException extends RuntimeException {
  UncheckedException(String s, Throwable e) { super(s, e); }
}

public class Abc {

  static void work(int sw) throws Exception {
    switch (sw) {
      case 1: throw new RuntimeException("非検査例外");
      case 2: throw new Exception("検査例外");
    }
  }

  static void test(int sw) throws CheckedException {
   try {
    work(sw);
  } catch (RuntimeException e) {
    throw new UncheckedException("非検査例外対処不能", e);
  } catch (Exception e) {
    throw new CheckedException("検査例外対処不能", e);
  }
}

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("sw : ");
    int x = stdIn.nextInt();
    try{
    test(x);
    } catch (Exception e) {
      System.out.println("例外 : " + e);
      System.out.println("例外の原因：　" + e.getCause());
      e.printStackTrace();
    }
  }
}
