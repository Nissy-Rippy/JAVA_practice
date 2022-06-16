package chap21;

import java.util.Objects;

public class Hero {
  public String name;
  public int hp;

  
  public int hashCode() { 
    return Objects.hash(this.name, this.hp);
  }
}
