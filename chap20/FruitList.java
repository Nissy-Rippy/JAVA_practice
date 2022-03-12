package chap20;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class FruitList {
  public static void main(String[] args) {
    List<Fruit> list1 = new ArrayList<>();
    list1.add(new Fruit("りんご", 63));
    list1.add(new Fruit("なし", 14));
    list1.add(new Fruit("パイナップル", 40));
    list1.add(new Fruit("ぶどう", 439));
    list1.add(new Fruit("マスカット", 6));

    // まずは、在庫50個以下のリストを作る
    List<Fruit> filter = new ArrayList<>();
    for (Fruit list : list1) {
      if (list.quantity <= 50) {
        filter.add(list);
      }
    }
    // 在庫不足のリストに20個づつ追加注文をする
    List<Fruit> order = new ArrayList<>();
    for (Fruit filt : filter) {
      order.add(filt.order(20));
    }
    // リストを追加した後少ない順に並べ替える
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
