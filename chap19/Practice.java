package chap19;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Comparator;
import java.util.Collections;

public class Practice {
  //引数に渡すこともできるのである
  public static void sayHello(Greeting g) {
    System.out.println(g.hello("yahho-"));
  }

  public static void main(String[] args) {
    List<Integer> list1 = Arrays.asList(-3,4,5,-7,3,4);

    Collections.sort(list1,
    new Comparator<Integer>() {
      @Override
      public int compare(Integer x, Integer y){
        return Integer.compare(x, y);
      };
    }
    );
    System.out.println(list1);

    Greeting greeting1 = (String word)-> { return "こんにちはー！"; };

    System.out.println(greeting1.hello("konnbannha"));

    Greeting greeting = (String word) -> {
      System.out.println(word);
      return word;
    };

    System.out.println(greeting.hello("おはにょう"));

    Comparator<Integer> list3 = Integer::compare;

    Collections.sort(list1,
    (Integer x, Integer y) -> { return Integer.compare(x, y); }
    );

    System.out.println(list1);
    System.out.println(list3);

  }
}
