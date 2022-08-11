public class Sword implements Cloneable {
  private String name;

  public Sword clone() {
    Sword sword = new Sword();
    sword.name = this.name;
    return sword;
  }
}
