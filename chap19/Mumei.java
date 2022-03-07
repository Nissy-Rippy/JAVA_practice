package chap19;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class A {
  public void hell() {
    System.out.println("こんんちは！");
  }
  public String hello() { return "こんんちいは"; }
}

public class Mumei {
  public static void main(String[] args) {

    List<String> animals = Arrays.asList("pig", "padfood", "dog", "cat", "fox", "elephant");
    Collections.sort(animals,
    new Comparator<String>() {
      @Override
      public int compare(String x, String y) {
        return x.compareTo(y);
      }
    });
    System.out.println(animals);
    List<Integer> numbers = Arrays.asList(1, -8, 4, 2);
    Collections.sort(numbers,
    new Comparator<Integer>() {
      @Override
      public int compare(Integer x, Integer y) {
        return Integer.compare(x, y);
      }
    });
    System.out.println(numbers);

    A a = new A() {
      @Override
      public String hello() { return "おはよう"; }
    };

    System.out.println(a.hello());
    Gori gori = new Gori() {
      @Override
      public String hello() { return "こんにちはんんんん！"; }
      @Override
      public int num() { return 33; }
    };
    System.out.println(gori.num());
  }
}