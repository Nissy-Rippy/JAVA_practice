package chap24;
import java.util.*;
import chap24.Func1;
import chap24.FunM2;
public class Test {

  public static void main(String[] args) {
    Func1 odd = x -> x % 2 == 1;
    System.out.println(odd.isOdd(45));

    Func2 result = (x, y) -> y + "さんは" + (x > 65 ? "合格" : "不合格");

    System.out.println(result.passCheck(65, "gorio"));

    FuncList funcList = new FuncList();
    Func1 f1 = FuncList::isOdd;
    Func2 f2 = funcList::passCheck;
    System.out.println(f1.isOdd(3));
    System.out.println(f2.passCheck(3, "gorita"));

  }
}
