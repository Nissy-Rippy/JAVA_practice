package chap12;

class Base{
  protected int x;
  Base() { this.x = 0; }
  Base(int x) { this.x = x; }
  
  public void print() { System.out.println("Base.x = " + x);}

}

class Derived extends Base{
  int x;
  Derived(int x1, int x2) { super.x = x1; this.x = x2; }
  public void print() { super.print(); System.out.println("Derived.x = " + x ); }
}

 public class SuperTester {
  public static void main(String[] args) {
    Base a = new Base();
    System.out.println("-- a --"); a.print();
    Derived b = new Derived(10, 20);
    System.out.println("-- b --"); b.print();
  }
}
