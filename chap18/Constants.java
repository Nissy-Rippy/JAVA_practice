package chap18;

public class Constants {

  public static class Cat {
    public static final String NAME = "猫";
    public static final int LEG_COUNT = 4;
    public static final int HAND_COUNT = 4;
  }

  public static class Octopus {
    public static final String NAME = "タコ";
    public static final int LEG_COUNT = 8;
  }

}

// System.out.println(Constants.Cat.NAME); // "猫"
// System.out.println(Constants.Cat.LEG_COUNT); // 4
// System.out.println(Constants.Octopus.NAME); // "タコ"
// System.out.println(Constants.Octopus.LEG_COUNT); // 8