package chap18;

public class Class {
  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
    Outer.Inner inner2 = new Outer.Inner();
  }
}
