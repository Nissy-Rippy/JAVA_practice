package chap19;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.Comparator;



public class Mumei {
  public static void main(String[] args) {

    List<String> animals = Arrays.asList("pig", "padfood", "dog", "cat", "fox", "elephant");
    List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6,7);

    Collections.sort(animals,
    new Comparator<String>() {
      @Override
      public int compare(String x, String y) {
        return x.compareTo(y);//x.compareTo(y);
      }
    });

    System.out.println(animals);
    List<Integer> numbers = Arrays.asList(1, -8, 4, 2);

    Collections.sort(numbers,
    new Comparator<Integer>() {
      @Override
      public int compare(Integer x, Integer y) {
        return Integer.compare(x, y);//Integer.compare(x,y);
      }
    });
    
    System.out.println(numbers);

    class A {
      public void hell() {
        System.out.println("こんんちは！");
      }


      public String hello() {
        return "こんんちいは";
      }
    }

    A a = new A() {
      @Override
      public String hello() { return "おはよう"; }
    };

    A b = new A() {
      @Override
      public String hello() { return "やっほー！"; }
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