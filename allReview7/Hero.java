
import java.io.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Hero implements Serializable {

  public int hp;
  public int mp;
  public String name;

  public Hero() { this.hp = 1; this.mp = 1; this.name = "前田敦子"; }
  public Hero(int hp, int mp, String name) { this.hp = hp; this.mp = mp; this.name = name; }

}
