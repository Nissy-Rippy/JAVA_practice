package chpa23;
import chap22.NoType;
import chap22.Pocket;

public class Main {
  public static void main(String[] args) {
    StaticOuter.Inner oi = new StaticOuter.Inner();

    Outer outer = new Outer();
    Outer.Inner of = outer.new Inner();

    Pocket<NoType> pocket = new Pocket<>();
    System.out.println("使い捨てのインスタンスを作ります");
    pocket.put(new NoType() {
      String innerField;
      void innerMethod() { }
    });


  }
}