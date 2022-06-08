package chap18;

public class Outer1 {
  //privateがついているが、ネストクラスもstatic同士であると呼び出すことができるが、private static のようにstaticをつけ忘れるとerrorが起きる。

  private static String greeting = "hello";
   
  public static class Inner1{
     public String hello1(){
       return greeting;
     } 
  }
}
