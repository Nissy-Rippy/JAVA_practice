package chap12;

class A{
  
  private int a;
  A() { a = 50; }
  public int getA() { return this.a; }
}
class B extends A{

}
class DefaultConstructorf {
  public static void main(String[] args) {
    B x = new B();
    System.out.println("x.getA() = " + x.getA());

  }
}
