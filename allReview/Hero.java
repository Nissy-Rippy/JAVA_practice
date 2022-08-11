import java.util.Objects;

public class Hero implements Cloneable {
  String name;
  int hp;
  Sword sword;

  public int hashCode() {
   return Objects.hash( this.name, this.hp );
  }
  public Hero clone() {
    Hero h1 = new Hero();
    h1.name = this.name;
    h1.hp = this.hp;
    h1.sword = this.sword;
    h1.sword = this.sword.clone();//深いクローンをしている。
    return h1;
  }

}
