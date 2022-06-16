package chap21;
import java.util.Set;
import java.util.HashSet;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class NoHero {
  public static void main(String[] args) {
    //配列同士を比較するときimpor.java.Arraysクラスの場的メソッドのequalsを利用する
    int[] a = { 1, 2, 3, 4, 5, 6, 7 };
    int[] b = { 1, 2, 3, 4, 5, 6, 7 };
    //Overrideしてないobjectクラスから継承したそのままのequalsメソッド
    System.out.println("誤った判定: " + a.equals(b) );
    //Arraysライブラリのしっかりオーバライドしたequals
    System.out.println("正しい判定: " + Arrays.equals(a, b) );



    List<Hero> hero = new ArrayList<>();
    Hero h1 = new Hero();
    h1.name = "みなと";
    hero.add(h1);// hero.add(h1.name = "みなと");
    System.out.println(hero);
    System.out.println("要素数 = " + hero.size());

    h1 = new Hero();
    h1.name = "みなと";
    // 同じ、みなととして削除しているはずなのに実際のところしっかりと削除することが出来ていない。そのため、要素数は1から1のまま！！！
    hero.remove(h1);
    System.out.println("要素数 = " + hero.size());

    Set<Hero> heroo = new HashSet<>();
    Hero h2 = new Hero();
    h2.name = "abc";
    heroo.add(h2);
    System.out.println("要素数: " + heroo.size() );

    h2 = new Hero();
    h2.name = "abc";
    //要素の中身は同じなのにまたもや削除することが出来ない！！なぜだ～というと

    heroo.remove(h2);
    System.out.println("要素数: " + heroo.size() );

    Set<Hero> hash = new HashSet<>();

    Hero h3 = new Hero();
    h3.name = "gori";
    h3.hp = 2;
    hash.add(h3);
    System.out.println(h3.size());

    h3 = new Hero();
    h3.name = "gori";
    h3.hp = 2;
    hash.remove(h3);
    System.out.println(h3.size());

  }
}