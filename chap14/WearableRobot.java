package chap14;

public class WearableRobot implements Color, Wearrable{
  private int color;

  public WearableRobot(int color) { changeColor(color); }
  //Color
  @Override public void changeColor(int color) { this.color = color; }
  //wearrble
  @Override public void putOn() { System.out.println(toString() + "装着！！"); }
  @Override public void putOff() { System.out.println(toString() + "解除！！"); }

  @Override public String toString() {
    switch (color) {
      case RED   :  return "赤ロボット";
      case BLUE  :  return "青ロボット";
      case GREEN :  return "緑ロボット";
      default    :  return "ロボット";
    }

  }
}


