package review;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
// import java.util.stream.Stream;
// import java.util.function.ToIntBiFunction;
// import java.util.function.IntBinaryOperator;
import java.util.function.BiFunction;//<String, string, String>最初の二つは引数、最後は戻り値
import java.util.function.Supplier;//引数を受け取らず、戻り値のみ返す
import java.util.function.Consumer;//引数だけを受け取り、戻り値がないvoidのような物
import java.util.function.*;
// import java.util.stream.*;
// import java.util.List;
// import java.util.ArrayList;
// import java.util.stream.Stream;

public class Review3 {
  private static int sum;
  // public static int back(int a, int b) {
  //   return a + a + b + b;
  // }
  public static Integer leng(String s) {
    return s.length();
  }
  public static void main(String[] args) {
    Function<String, Integer> func1 = Review3::leng;
    int size = func1.apply("gorio!");
    System.out.println(size);

    Consumer<String> cons = System.out::println;//Consumerは、Stringでデータ型は基本、IntConsumer, LongConsumer, DoubleConsumer,
    cons.accept("gorioooo!");

    Supplier<String> sup = System::lineSeparator;//Supplierは基本String型で, データ型はIntSupplier, LongSupplierなど
    System.out.println("改行します！！" + sup.get());
    BiFunction<String, String, String> bi = (x, y) -> { return x +  " " + y; };
    String ozi = bi.apply("石井", "まこと");
    System.out.println(ozi);
    BiFunction<String, String, String> bifunc = System::getProperty;
    System.out.println(bifunc.apply("java.version", "不明"));//ToIntBiFunction, ToLongBiFunctionなどがある！

    // long[] x = (long[] org) -> {
    //   long[] cpy = java.util.Arrays.copyOf(org, org.length);
    //   java.util.Arrays.sort(cpy);
    //   return cpy;
    // };
     
    // int num = (IntBinaryOperator func, int a, int b) -> {
    //   int result = func.applyAsInt(a, b) + func.applyAsInt(a, b);
    // };

    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(13);
    numbers.add(15);
    numbers.add(165);
    numbers.add(133);
    numbers.add(111);

    boolean is = numbers.stream().anyMatch(h -> h.intValue() == 13);
    System.out.println(is);

    int[] lists = {1,3,4,5,6,7,7};
    sum = Arrays.stream(lists).sum();
    System.out.println("oo");
    List<String> names = List.of("ozi", "oba", "oni", "imouto");
    names.stream().filter(h -> h.length() < 4).forEach(e -> System.out.println(e + "さん"));
    names.stream().filter(h -> h.length() < 4).map(h -> h + "さん").forEach(System.out::println);//同じ!！

  }
}
