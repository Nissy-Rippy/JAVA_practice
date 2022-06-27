package chap24;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    List<String> names = Arrays.asList("菅原拓真", "湊雄輔", "朝香あゆみ");
    names.stream()
         .filter(h -> h.length() <= 4)
         .map(h -> h + "さん")
         .forEach(System.out::println);
    
    List<String> aa = List.of("a", "b", "c");
    Set<Integer> nn = Set.of(1,2,3,4,5);
    Map<String, Integer> dd = Map.of("東京", 12, "京都", 21, "熊本", 32);
    Stream<String> cc = Stream.of("x", "y", "s");

    for(String a : aa) {
      System.out.println(a);
    }
    // for ( m : mm) {
    //   System.out.println(m);
    // }

    try (IntStream ff = Stream.of(1,2,3,4)) {
    }
  }
}
