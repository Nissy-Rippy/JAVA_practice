package chap18;

public class Soldier implements Character {
  @Override
  public int attack() {
    System.out.println("戦士の会心の一撃");
    return 100;
  }
}
