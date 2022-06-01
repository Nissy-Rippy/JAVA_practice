package chap14;


interface A {

  public static void hello() {
    System.out.println("hello");
  }
//privateの関数はゲッターやセッターみたいな感じに間接的になら呼び出すことが出来る。
  private void print(String s1, String s2) {
    System.out.println(s1 + " : " + s2);
  }

//defaultの関数はオーバライドしなくても平気である
  default void on() {
    //print = private();
    print("default", "On");
  }

  default void out() {
    System.out.println("アウトー！");
  }
  //この部分だけオーバーライドする
  public abstract void off();

}

class A1 implements A{
  @Override public void off() { System.out.println("A1 : Off"); }
}

class A2 implements A{
  @Override public void on() { System.out.println("A2 : On!!"); }
  @Override public void off() { System.out.println("A2 : Off!!"); }
}


public class InterfaceTester {
  public static void main(String[] args) {

    A.hello();
    A1 a1 = new A1();
    a1.on();
    a1.off();
    a1.out();

    A2 a2 = new A2();
    a2.on();
    a2.off();
    a2.out();

  }
}
