import java.util.concurrent.*;

public class PrintingThread2 implements Runnable {
  public void run() {
    for (int i = 9; i >= 0; i--) {
      System.out.println(i + "....");
      try {
        TimeUnit.SECONDS.sleep(2);
      } catch (InterruptedException e) {
        ;
      }
    }
  }
}
