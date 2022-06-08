package chap18;

public class Outer {
  private String greeting = "hello";
  
  public class Inner {
    public String hello(){
      return greeting;
    }

    public class Outer {
    } 
  }
}
