package chpa23;
//外部クラスのメンバーにアクセスできるがstaticなものに限られている。
//呼び出すときは、外部クラス.内部メンバクラスという形で呼び出せる
public class StaticOuter {
  int outerField;
  public static int outerStaticField;
  static class Inner{
    public void inner() {
      outerStaticField = 10;
    }
  }
  public void inner1(){ 
    Inner ic = new Inner();
  }
}
