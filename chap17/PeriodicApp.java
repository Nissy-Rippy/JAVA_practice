package chap17;
import java.util.Date;
import java.util.Timer;

public class PeriodicApp {
  public static void main(String[] args) {
    int period = 60;
    int dt = 0;
    Date now = new Date();
    String mm = String.format("%tM", now);
    String ss = String.format("%tS", now);
    int min = Integer.parseInt(mm);
    int sec = Integer.parseInt(ss);
    System.out.println("### min = " + min + "sec = " + sec);
    if(period > 60) dt = period - (min * 60 + sec); 
    else dt = period - sec;
    System.out.println("### waiting... dt =  " + dt);
    try{
      Thread.sleep( dt * 1000);
    } catch (Exception e) { System.out.println(e); }
    Timer timer = new Timer();
    Periodic p = new Periodic();
    timer.schedule(p, 0, 1000 * period);
  }
}
