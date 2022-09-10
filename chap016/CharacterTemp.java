

public abstract class CharacterTemp {
  
  protected String name;

  public final void introduce() {
    System.out.println("私の名前は、" + this.name + "です");
    doIntroduce();
    System.out.println("よろしくお願いいたします！");

  }
  protected abstract void doIntroduce();

}
