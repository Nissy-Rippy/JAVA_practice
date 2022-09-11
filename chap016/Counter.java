import java.util.concurrent.atomic.*;
import java.util.concurrent.*;

public class Counter {

  final AtomicLong count = new AtomicLong(0);
  private long count2;

  public void add(long i) {
    System.out.println("足し算します");
    this.count.addAndGet(i);
    this.count.getAndUpdate((c) -> c + i);
  }

  /**
   * このメソッドでは、スレッドによる強豪を無くし変数にかけ算してもエラーが出ないメソッドになっている！
   * @param i はかけ算したいかず
   */

  public void mul(long i) {
    System.out.println("掛け算します！");
    this.count.getAndUpdate((c) -> c * i );
    this.count.getAndUpdate((c) -> c + 1 + 1 + i);
  }
    public void add2(long i) {
    System.out.println("足し算します");
    synchronized(this) {
    this.count2 += i;
  }
  }

  public void mul2(long i) {
    System.out.println("掛け算します！");
    synchronized(this) {
    this.count2 *= i;
    }
  }


  }

