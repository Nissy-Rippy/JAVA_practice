import java.util.function.*;
import java.util.stream.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class Test {
  public static void main(String[] args) {
    // FuncList func = new FuncList();
    // Func1 func1 = FuncList::isOdd;
    // Func2 func2 = func::passCheck;
    // System.out.println(func1.call(4)); 
    // System.out.println(func2.call(45, "おじいちゃん"));
    Func1 f1 = x -> x % 2 == 1;
    Func2 f2 = (point, name) -> {
      return name + "さんは" + (point > 65 ? "合格" : "不合格");
    };

    System.out.println(f2.call(43, "goria"));

    IntPredicate ip = x -> x % 2 == 1;

    List<String> lists = new ArrayList<>();
    lists.add("田中");
    lists.add("田じま");
    lists.add("田ろう");
    lists.add("田口");

    lists.stream().filter(h -> h.length() <= 4).map(h -> h + "さん").forEach(System.out::println);

    String[] names = { "田中聖", "赤西仁", "亀梨和也", "中丸なんとかｋなんとか" };
    Arrays.stream(names).filter(h -> h.length() <= 4).map(h -> h + "さん").forEach(System.out::println);

    List<String> ls = List.of("a", "b", "v", "b");
    Set<String> ss = Set.of("d", "e", "f");
    Map<String, Integer> ms = Map.of("東京都", 499, "ブラジル", 333, "南大陸", 4099);

    Stream<String> sst = Stream.of("#", "oigfajg", "ごじら", "ごあち");
    // IntStream = Stream.of(1,4,5,6);

  }
}
