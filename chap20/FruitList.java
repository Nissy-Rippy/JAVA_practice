package chap20;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class FruitList {
  public static void main(String[] args) {
    List<Fruit> list1 = new ArrayList<>();
    list1.add( new Fruit("りんご", 63) );
    list1.add( new Fruit("なし", 14) );
    list1.add( new Fruit("パイナップル", 40) );
    list1.add( new Fruit("ぶどう", 439)) ;
    list1.add( new Fruit("マスカット", 6) );

    List<Fruit> filter = new ArrayList<>();
    for (Fruit list : list1) {
      if (list.quantity <= 50) {
        filter.add(list);
      }
    }
    List<Fruit> order = new ArrayList<>();
    for (Fruit filt : filter){
      order.add(filt.order(20));
    }
    order.sort(new Comparator<Fruit>() {
      @Override
      public int compare(Fruit x, Fruit y) {
        return x.quantity - y.quantity;
      }
    });

  }
}
