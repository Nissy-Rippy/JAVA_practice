package chap24;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import chap21.Hero;

public class Main1 {

//streamは、配列で使うときは Arrays.stream(配列).sum()といったようにつかう！
  public static void main(String[] args) {
    List<Hero> heroes = new ArrayList<>();
    // int[] hList = {1,3,4,5,5,6,};

    //リストをストリームにしてリストにする
    List<Hero> heroList = heroes.stream().collect(Collectors.toList());
    // List<Hero> heroes1 = Arrays.stream(hArray).collect(Collectors.toList());

    boolean anyoneKnockedOut2 = heroes.stream().anyMatch(h -> h.hp == 0);
    boolean anyoneKnockedOut3 = heroes.stream().noneMatch(h -> h.hp == 0);
    boolean anyoneKnockedOut5 = heroes.stream().allMatch(h -> h.hp == 0);

    //長く書くと下記のようになる
    boolean anyoneKnockedOut = false;
    for (Hero h : heroes) {
      if (h.hp == 0) {
        anyoneKnockedOut = true;
        break;
      }
    }
  //配列の時はArrays.stream(配列)と使う!
    int[] ages = { 66, 54, 23, 45 };
    long totalAge = Arrays.stream(ages).sum();
    System.out.println(totalAge);


    heroes.stream().forEach(h -> {
      System.out.println("勇者" + h.name);
    });
    Optional<Hero> hopt = heroes.stream().findFirst();
    if (hopt.isPresent()) { System.out.println("先頭は " + hopt.get().name); }
    Optional<Hero> hopts = heroes.stream().max((x, y) -> x.hp - y.hp);
    if (hopts.isPresent()) { System.out.println("最大HPの勇者は！！ " + hopt.get().name); }

    long all = heroes.stream().filter(h -> h.hp ==0).count();
    
    
    //List<String>に代入する
    List<String> noHpHero = heroes.stream()
                                  .filter(h -> h.hp ==0)//hp= 0の人を抽出する
                                  .limit(3)//最大3名まで
                                  .map(h -> h.name)//Heroから名前を取得する
                                  .collect(Collectors.toList());//リストとして取り出す！

    System.out.println(noHpHero);

  }
}
