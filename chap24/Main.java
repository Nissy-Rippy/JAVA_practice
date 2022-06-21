package chap24;

import java.util.function.*;
import java.util.Arrays;
import java.util.*;
import chap21.Account;

public class Main {
  public static void main(String[] args) {

    Function<String, Integer> func = 
    (String s) -> { return s.length(); };
    int n = func.apply("kyaaaaaaaq");
    System.out.println("文字数は" + n + "です！");

    Function<String, Integer> abc = x -> x.length();
    int c = abc.apply("おやじ");
    System.out.println(c);

    IntToDoubleFunction func1 = (int x) -> { return x * x * 3.14; };
    IntToDoubleFunction func2 = (x) -> { return x * x * 3.14; };
    IntToDoubleFunction func3 = x -> { return x * x * 3.14; };
    IntToDoubleFunction func4 = x -> x * x * 3.14;

    double b = 3.14;
    IntToDoubleFunction func5 = x -> x * x * b;

    //int 型の引数2つに戻り値1つ
//  (IntBinaryOperator func, int a, int b) -> {
//   int result = func.applyAsInt(a, b) + func.applyAsInt(a, b);
//   return result;
//  }
List<Account> lists = new ArrayList<>();
lists.add(new Account("love"));
lists.add(new Account("and"));
lists.add(new Account("piece"));
lists.add(new Account("finish!"));

Collections.sort(lists,
(x, y) -> x.getName().compareTo(y.getName()));
for (Account list : lists) {
System.out.println(list.getName());
}
  }
}

// (Hero h) -> { return h.getHp(); }
// () -> { return new java.util.Date(); }
// (long[] org) -> {
//   long[] cpy = java.util.Arrays.copyOf(org, org.length);
//   java.util.Arrays.sort(cpy);
//   return cpy;
// }
