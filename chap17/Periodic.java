package chap17;

import java.util.Date;
import java.util.TimerTask;

public class Periodic extends TimerTask {
  Date now;
  public void run() {
    now = new Date();
    System.out.println("Time: " + now);
  }
}
