import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class CountUpThread extends Thread {

  public void run() {
    for (int i = 0; i <= 50; i++) {
      System.out.println(i);

    }


  }
}
