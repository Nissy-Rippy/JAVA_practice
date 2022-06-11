package chap20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FruitList {
  public static void main(String[] args) {
    List<Fruit> list1 = new ArrayList<>();
    list1.add(new Fruit("りんご", 63));
    list1.add(new Fruit("なし", 14));
    list1.add(new Fruit("パイナップル", 40));
    list1.add(new Fruit("ぶどう", 439));
    list1.add(new Fruit("マスカット", 6));

    List<Fruit> filter = new ArrayList<>();
    for (Fruit list : list1) {
      if (list.quantity <= 50) {
        filter.add(list);
      }
    }

    List<Fruit> order = new ArrayList<>();
    for (Fruit filt : filter) {
      order.add(filt.order(20));
    }
    order.sort(new Comparator<Fruit>() {
      @Override
      public int compare(Fruit x, Fruit y) {
        return x.quantity - y.quantity;
      }
    });

    for (Fruit fruit : order) {
      System.out.println(fruit);
    }

    list1.stream()
    .filter(f -> f.quantity <= 10)
    .map(f -> f.order(20))
    .sorted((f1, f2) -> f1.quantity - f2.quantity)
    .forEach(System.out::println);

   long count = list1.stream()
    .filter(f -> f.quantity <= 10)
    .count();
    System.out.println(count);

    List<Fruit> list11 = list1.stream()
                         .sorted((f1, f2) -> f2.quantity - f1.quantity)
                         .collect(Collectors.toList());
    System.out.println(list11);
  }
}

// (引数) -> {処理}
// 条件に応じ省略した記法を用いる。次のサンプルを用いて省略のしかた。

// // サンプル1
// (Integer x, Integer y) -> {
//   return x + y;
// };
// // サンプル2
// (Integer x) -> {
//   return x * 5;
// };

// 引数の型
// 引数の型は省略

// // サンプル1
// (x, y) -> {
//   return x + y;
// };
// 括弧 {} と return
// 括弧 {}内の処理が1行の場合、{} と return は省略できます。ただし、片方のみならず両方とも省略する必要がある

// // サンプル1
// (Integer x, Integer y) -> x + y;
// 括弧 ()
// 括弧 () は引数が1つの場合、型とともに省略できる

// // サンプル2
// x -> {
//   return x * 5;
// };

// // サンプル1
// (x, y) -> x + y;


// // サンプル2
// x -> x * 5;