package chap14;

public class WearableRobot implements Color, Wearable{
  private int color;
  public WearableRobot(int color){ changeColor(color); }
  @Override public void changeColor(int color) { this.color = color; }
  @Override public void putOn() { System.out.println(toString() + "装着！！"); }
  @Override public void putOff() { System.out.println(toString() + "解除！！"); }

  @Override public String toString() {
    switch (color) {
      case RED   :  return "赤ロボット";
      case BLUE  :  return "青ロボット";
      case GREEN :  return "緑ロボット";
    }
    return "ロボット";
  }

}


