package chap22;
import chap21.Hero;1
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PocketMain {
  public static void main(String[] args) {
    // Pocket<?> p;
    // p = new Pocket<String>();
    //子孫のクラスの時
    Pocket<? extends NoType> a = new Pocket<>();
    //先祖のクラスの時
    Pocket<? super NoType> b = new Pocket<>();


    // public static <T> List<T> asList(T... a);
    // public static <E> Set<E> asSet(E.. a7);
    List<String> s = Arrays.asList("hello", "world");
    List<Integer> i = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    List<Hero> h = Arrays.asList( new Hero(), new Hero(), new Hero() );
    
    }
}
