package chap14;

public class Test {

  public static void main(String[] args) {
    Wearrable[] w = {
      new WearableComputer("goriraaaa"),
      new WearableRobot(Color.RED),
      new WearableRobot(Color.GREEN)
    };

    for (Wearrable i : w) {
      i.putOn();
      i.putOff();
      System.out.println();
    }
  }
}
