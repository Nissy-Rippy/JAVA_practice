import java.util.concurrent.*;
//AtomicBOoleanによって、スレッドの途中でも停止する機能を加える事ができるようになる！
import java.util.concurrent.atomic.AtomicBoolean;

public class PrintingThread extends Thread {
  final AtomicBoolean stopReq = new AtomicBoolean(false);

  public void run() {
    for (int i = 9; i >= 0; i--) {
      if (this.stopReq.get()) {
        //中断のメッセを受け取ったらループを抜けてる()を終了する！
        break;
      }
      System.out.println(i + "....");
      try {
        TimeUnit.SECONDS.sleep(2);
      } catch (InterruptedException e) { ; }
    }
  }
}
