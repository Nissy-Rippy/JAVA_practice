package chap14;

public class Test {
  public static void main(String[] args) {
    Wearable[] w = {
      new WearableComputer("goriraaaa"),
      new WearableRobot(Color.RED),
      new WearableRobot(Color.GREEN)
    };

    for (Wearable i : w) {
      i.putOn();
      i.putOff();
      System.out.println();
    }
  }
}
