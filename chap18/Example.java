package chap18;

import chap18.Outer1.Inner1;

public class Example {
  public static void main(String[] args) {
    //これは、内部クラスを呼び出す時に使うやり方である。
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();

    Outer outer1 = new Outer();
    Outer.Inner inner1 = outer1.new Inner();

    Inner inner2 = new Inner();
    Inner.Outer outer2 = new Inner.Outer();

    Outer1 outer11 = new Outer1();
    Outer1.Inner1 outerinner = new Outer1.Inner1();

    outerinner.hello1();

//import の宣言のおかげでこれが可能になっている。
    Inner1 in = new Inner1();

    
  }
}
