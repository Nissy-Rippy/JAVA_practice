package chap25;

import java.lang.Class;


public class RefSample {
  public int times = 0;
  private String name;
  public RefSample(int times) { this.times = times; }
  public RefSample(int times, String name) { this.times = times; this.name = name; }
  public void hello(String msg) { this.hello(msg, this.times); }
  public void hello(String msg, int t) { System.out.println("Hello" + msg + " x" + t); }
}
