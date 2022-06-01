package chap15;

public interface Toyo extends Player {
  
  public static final int Y = 0;
  public abstract void keep(int Y);
  void go();
  void goAndDash();
  
}
