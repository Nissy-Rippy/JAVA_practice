package chpa23;
// これはメンバクラスと呼ばれている。

public class Outer {
  public void add() { System.out.println(""); }  
  class Inner {
  }
}
//ローカルクラスとは メソッドの中で定義しそのメソッドの中でのみ利用することができる。メソッドの中で
class Outer1{
  int outerMember = 23;

  public void outerMethod() {
    int a = 12;

    class Inner {
      public void innerMethod(){
        System.out.println("innerMethodです");
        System.out.println(outerMember + a);
      }
    }
    Inner ic = new Inner();
    ic.innerMethod();
  }


}

//匿名クラス
class Outer2{
  void add() {
    int r =134;
    Object o = new Object() {
      
    }
  }
}