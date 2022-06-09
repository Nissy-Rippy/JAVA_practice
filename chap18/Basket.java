package chap18;

import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

//<E extends Fruit>Fruit型を継承している
public class Basket<E extends Fruit> {

  private E elem;

  private final  BigDecimal PRICE = new BigDecimal(100);

  public Basket(E elem) { this.elem = elem; }

  void replace(E e) {
    this.elem = e;
  }
  E get() {
    return elem;
  }

  public void getPrintName() {
    System.out.println("カゴの中身は" + elem.getName() + "です");
  }

  public void getPrintTotalPrice() {
    BigDecimal totalPrice = PRICE.add(elem.getPrice());  //かごと商品の値段
    System.out.println(elem.getName() + "の入ったカゴの合計は、" + totalPrice + "円です！！");
  }
//<? extends Fruit>という風にすると ?_の部分がもしFruitを継承しているならということでFruitを継承しているなら大丈夫

  public void doSomething(List<? extends Fruit> fruits) { // 型パラメータとして、Fruitを継承したクラスを指定
    // 何らかの処理
  }
  public static void main(String[] args) {
    Basket<Apple12> ba = new Basket<>( new Apple12("りんご", new BigDecimal(100)));
    Basket<Peach12> bp = new Basket<>( new Peach12("もも", new BigDecimal(200)));
    Basket<Apple12> ba12 = new Basket<>(new Apple12("ぶどう", new BigDecimal(400)));
    Basket<Peach12> pp12 = new Basket<>(new Peach12("すもも", new BigDecimal(450)));

    List<? extends Fruit> ff;
    List<Fruit> lf = new ArrayList<>();
    List<Apple12> la = new ArrayList<>();
    ff = la;
    // lf = la;

    ba.getPrintTotalPrice();
    bp.getPrintTotalPrice();
    System.out.println(ba.get().getName());
    
    //Apple型

    ba.replace(new Apple12("gori", new BigDecimal(399)));
    ba.replace(new Apple12("momo", new BigDecimal(500)));
    ba.getPrintTotalPrice();
  }
}

class Apple{
 private String name;
 //コンストラクタ
 public Apple(String name) {
   this.name = name;
 }
 public String getName() { return this.name; }

}

class Peach{
 
  private String name;
  public Peach(String name) { this.name = name; }
  String getName() {
    return this.name;
  }
}
