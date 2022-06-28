package chap07;

import java.util.*;
import java.util.function.*;

public class Gorira {
  public static void main(String[] args) {
    List<String> heroes = new ArrayList<>();
    heroes.add("おじ");
    heroes.add("おば");
    heroes.add("まご");
    heroes.add("むすめ");
    heroes.add("ちち");
    heroes.add("はは");

    Optional<String> hopt = heroes.stream().findFirst();
    heroes.stream().forEach(System.out::println);
    heroes.stream().forEach(h -> System.out.println("家族の名前" + h));

  }
}
