package chap21;

import java.util.Objects;
//import java.lang.Cloneable;基本的にjava.lang.のやつは宣言をわざわざしなくても平気である。

public class Hero implements Cloneable{
  public String name;
  public int hp;
  public Sword sword;
  //cloneのメソッドを用意しておくと便利

  public Hero(String name, Sword sword) { this.name = name; this.sword = sword; }

  public Hero clone(String name, String name1) {
    Hero result = new Hero(name, sword);
    result.name = this.name;
    result.hp = this.hp;
    result.sword = this.sword.clone(name1);
    //result.sword = new Sword();
    return result;
  }

//Hashを等価評価するときにhashCodeが必要であるので、hashCodeをオーバライドしておくとよい。
  public int hashCode() {
    return Objects.hash(this.name, this.hp);
  }

  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (o == null)
      return false;
      if (!(o instanceof Hero)) return false;
    Hero r = (Hero) o;
    // trim()を使って文の先頭と末尾の空白を削除して数字だけを入手する
    if (this.name.trim().equals(r.name.trim())) {
      return false;
    }
    return true;
  }
}
