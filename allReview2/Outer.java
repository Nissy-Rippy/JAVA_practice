public class Outer {
  public int outerField;
  public static int outerStaticField;
  public int outerMember = 3;

  public void outerMethod() {
    int a = 10;
    class Inner {
      public void im() {
        System.out.println("imメソッドです！！");
        System.out.println(outerMember + a);
      }
    }
    Inner in = new Inner();
    in.im();
  }
  static class Inner{
    public void innerMethod() {
      outerStaticField = 10;
    }
  }
  Inner in = new Inner();

  class Inner2{
    public void innerMe() {
      outerField = 10;
    }
  }
}
