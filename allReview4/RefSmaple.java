import java.lang.reflect.*;


public class RefSmaple {

 public int times = 0;
 public RefSmaple(int times) { this.times = times; }

 public void hello(String msg) {
  this.hello(msg, this.times);
 }
 public void hello(String msg, int time) {
  System.out.println("Hello, " + msg + " x" + time);
 }



}
