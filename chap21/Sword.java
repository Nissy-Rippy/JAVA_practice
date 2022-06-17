package chap21;

public class Sword implements Cloneable {
  private String name1;

  public String getName() { return this.name1; }
  public void setName(String name1) { this.name1 = name1; }

  public Sword(String name1) { this.name1 = name1; }

  public Sword clone(String name) {
    Sword s = new Sword(name);
    s.name1 = this.name1;
    return s;
  }


  
}
