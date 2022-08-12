import java.util.function.*;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.BiFunction;

public class Func {
  public static Integer len(String s) {
    return s.length();
  }
  
  public static void main(String[] args) {

    Function<String, Integer> func = Func::len;
    int a = func.apply("JAVA");
    int b = func.apply("PHP");
    System.out.println("文字列は" + a + b);

    Counsumer<String> conf = System.out::println;
    conf.accept("oppappi");

    Supplier<String> supf = System::lineSeparator;
    System.out.println("開業します" + supf.get() );

    BiFunction<String, String, String> bfunc = System::getProperty;
    System.out.println(bfunc.apply("java.version", "不明"));





  }
}
