
import java.io.*;

public class Hero implements Serializable {
  private String name;
  private int hp;
  private int mp;
  private Sword sword;

  public Hero(String name, int hp, int mp, Sword sword) {
    this.name = name;
    this.hp = hp;
    this.mp = mp;
    this.sword = sword;
  }

  private static final long serialVersionUID = 81923983183821L;
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getHp() {
    return hp;
  }
  public void setHp(int hp) {
    this.hp = hp;
  }
  public int getMp() {
    return mp;
  }
  public void setMp(int mp) {
    this.mp = mp;
  }
  
  public Sword getSword() {
    return sword;
  }

  public void setSword(Sword sword) {
    this.sword = sword;
  }


}
