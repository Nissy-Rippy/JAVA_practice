package chap18;

public class Outer1 {
  private static String greeting = "hello";
   public static class Inner1{
     public String hello1(){
       return greeting;
     }
  }
}
