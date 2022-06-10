package chap20;

public class Fruit {
  
  //フィールド
  public String name;
  public int quantity;
  //コンストラクタ
  public Fruit(String name, int quantity) { this.name = name; this.quantity = quantity; }
  
  public Fruit order(int quantityToAdd) {
    //戻り値がフルーツ型のクラスとかの場合,
    //新しくインスタンス変数を作ってあげてコピーを戻り値にしないとそのままのインスタンス変数でやるといろいろと困ったことになる。
    return new Fruit(this.name, this.quantity + quantityToAdd);
  }
  
  @Override
  public String toString() {
    return this.name + " : " + this.quantity + "個";
  }
}
