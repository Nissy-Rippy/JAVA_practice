package chap14;

public class WearableComputer implements Wearrable {
  private String name;
  //こんすたらくた 引数name
  public WearableComputer(String name) { this.name = name; }

  @Override public void putOn() { System.out.println(name + "ON!!"); }
  @Override public void putOff() { System.out.println(name + "OFF!! "); }

}
