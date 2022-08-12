
import java.util.function.*;
import java.util.*;


public class Main {
  public static void main(String[] args) {
    Function<String, Integer> func =
    (String s) -> { return s.length(); };

    int n = func.apply("トヨダ（　ノﾟДﾟ） よし！");
    System.out.println("文字列「Java」は、" + n + "文字です");

    Function<String, Integer> func2 = s -> s.length() + 5;
    System.out.println("合計は！" + func2.apply("gorira"));

    double g = 3.14;

    IntToDoubleFunction df = x -> x * x * g;
    System.out.println(df.applyAsDouble(5));

    DoubleConsumer cfun = x -> System.out.println(x + x + 3.14);
    cfun.accept(3.4);

    List<Account> list = new ArrayList<>();
    Collections.sort(list,
    (x, y) -> (x.zandaka - y.zandaka)
    );

    List<Hero> heroes = new ArrayList<>();
    boolean anyone =
    heroes.stream().anyMatch(n -> n.hp == 0);

    int[] ages = {44, 55, 67 };
    long totalAges = Arrays.stream(ages).sum();
    System.out.println(totalAges);

    Optional<Hero> hopt = heroes.stream().findFirst();
    System.out.println("名前は？" + hopt.get().getName());
    
    Optional<Hero> oh1 = heroes.stream().max(x, y -> x.hp - y.hp);
    if (oh1.isPresent()) {
      System.out.println("最大のHPの人は," + oh1.get().getName() );
    }
    List<Hero> heroes = hList.stream().collect(Collectors.toList());

    List<Hero> heroes1 = 
    Arrays.stream(hList).collect(Collectors.toList());

    long all = heroes.stream().count();

    long kockout = heroes.stream().filter(h -> h.hp == 0).count();

    List<String> kockoutNames = heroes.stream().filter(h -> h.hp == 0).limit(3).map(h -> h.name).collect(Collectors.toList());
  }
}
