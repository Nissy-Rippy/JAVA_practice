package chap14;

interface A {
  public static void hello() {
    System.out.println("hello");
  }
  private void print(String s1, String s2) {
    System.out.println(s1 + " : " + s2);
  }
  default void on() {
    print("default", "On");
  }
  default void out() {
    System.out.println("アウトー！");
  }
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

    A2 a2 = new A2();
    a2.on();
    a2.off();

  }
}
