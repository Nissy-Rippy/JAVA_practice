package revieww;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;

class Hero implements Cloneable, Comparable<Hero>{
  String name;
  int age;
  int no;
  public Hero(String name, int age) { this.name = name; this.age = age; }
//compareTo()は大小関係を判定するという責務を負っている。
  public int compareTo(Hero o)  {
    if (this.no < o.no) { return -1; }//自分のが小さい時は負の数を返す
    else if (this.no > o.no) { return 1; }//自分自身のガ大きい時は整数
    else { return 0; }
  }

  public String toString() {
    return "名前: " + this.name + "年齢： " + this.age + "ナンバー: " + this.no;
  }
  public int hashCode() {
    return Objects.hash(this.name,this.age,this.no);
  }
  public boolean equals(Object o) {
    if (o == this) { return true; }
    if (o == null) { return false; }
    if (!(o instanceof Hero)) { return false; }
    Hero r = (Hero)o;
    if (!(this.name == r.name)) { return false; }
    if (!(this.age == r.age)) { return false; }
    if (!(this.no == r.no)) { return false; }
    return true;
  }
  public Hero clone() {
    Hero hero = new Hero(this.name, this.age);
    hero.name = this.name;
    hero.age = this.age;
    hero.no = this.no;
    return hero;
  }

}
  public class Review1 {

  public static void main(String[] args) {

    System.out.println("ゆううううう");

    List<Hero> heroes = new ArrayList<>();
    heroes.add(new Hero("gorio", 23));
    heroes.add(new Hero("gorio", 73));
    heroes.add(new Hero("gorio", 33));
    heroes.add(new Hero("gorio", 254));
    heroes.add(new Hero("gorio", 13));

    Collections.sort(heroes);
    Collections.sort(heroes, new AgeComparator());

    for (Hero hero : heroes) {
      System.out.println(hero.toString());
    }
  }
}
