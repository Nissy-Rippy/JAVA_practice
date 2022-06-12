package chap19;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;//これによりCollrectors.toList()が使えるようになる
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;



public class Fruit2 {

  public String name;
  public int quantity;
//コンストラクタ
  public Fruit2(String name, int quantity) {  this.name = name; this.quantity = quantity; }
  public Fruit2 order(int quantityToAdd) { return new Fruit2(this.name, this.quantity + quantityToAdd); }
  @Override
  public String toString() {  return name + ": " + quantity + "個";  }

  public static void main(String[] args) {
    List<Fruit2> fruits = new ArrayList<>();
    List<Integer> number = Arrays.asList(1,2,3,45,5);

    fruits.add(new Fruit2("りんご", 20));
    fruits.add(new Fruit2("もも", 4));
    fruits.add(new Fruit2("パイナップル", 3));
    fruits.add(new Fruit2("ぶどう", 25));
    fruits.add(new Fruit2("みかん", 14));
    fruits.add(new Fruit2("なし", 24));
    fruits.add(new Fruit2("かき", 2));

    List<Fruit2> filters = new ArrayList<>();
//10個以下のフルーツに絞る
    for(Fruit2 fruit : fruits) {
      if(fruit.quantity <= 10) {
        filters.add(fruit);
      }
    }
    //10個以下のリストに20こづつ追加していく
    List<Fruit2> ordered = new ArrayList<>();

    for(Fruit2 filter : filters) {
      ordered.add(filter.order(20));
    }
    //少ない順に並べる
    ordered.sort(new Comparator<Fruit2>() {
      @Override
      public int compare(Fruit2 x, Fruit2 y) {
        return Integer.compare(x.quantity, y.quantity);
      }
    });
//orderedの中身は少ない順に入れ替わっている。それを最後に出力させてあげる。
    for (Fruit2 f : ordered) {
      System.out.println(f);
    };
  
//メソッド.（（引数）-> 処理の内容）
  fruits.stream()
  .filter(f -> f.quantity <= 14)
  .map(f -> f.order(20))
  .sorted((f1, f2) -> f1.quantity - f2.quantity)
  .forEach(System.out::println);

 List<Fruit2> list = fruits.stream()
      .filter(f -> f.quantity <= 14)
      .map(f -> f.order(20))
      .sorted((f1, f2) -> f1.quantity - f2.quantity)
      .collect(Collectors.toList());
      System.out.println(list);

 Boolean re = fruits.stream()
  .filter(f -> f.quantity <= 14)
  .map(f -> f.order(20))
  .sorted((f1, f2) -> f1.quantity - f2.quantity)
  .noneMatch(f -> f.name.equals("りんご"));
  System.out.println(re);

  Boolean ree = fruits.stream()
      .filter(f -> f.quantity <= 14)
      .map(f -> f.order(20))
      .sorted((f1, f2) -> f1.quantity - f2.quantity)
      .anyMatch(f -> f.name.equals("もも"));
      System.out.println(ree);
      
  long count = fruits.stream()
               .filter(f -> f.quantity <= 10)
               .count();
               System.out.println(count);
  
  List<Fruit2> sortedOrder = fruits.stream()
                             .sorted((f1, f2) -> f2.quantity - f1.quantity)
                             .collect(Collectors.toList());
                             System.out.println(sortedOrder);
  }
}


// 中間操作 

// filter:要素を条件で絞り込む 
// map:要素を変換する 
// mapToInt:要素をInteger型に変換する 
// mapToLong:要素をLong型に変換する 
// mapToDouble:要素をDouble型に変換する 
// flatMap:mapに似た処理だが、ストリームが入れ子になっていたら平坦化する 
// flatMapToInt:flatMap+mapToInt に相当する処理を行う 
// flatMapToLong:flatMap+mapToLong に相当する処理を行う 
// flatMapToDouble:flatMap+mapToInt に相当する処理を行う 
// distinct:要素の重複を取り除く
// sorted:要素を並び替える 
// limit:指定した要素数で切り出す 
// skip:指定した要素数を先頭から切り捨てた残りの要素を残す 
// peek:要素を出力するなどしてデバッグに用いる

// 「同じ処理を実現するにも色々な書き方ができる」

// 終端処理

// forEach: 各要素に対し順に処理する
// forEachOrdered: 各要素に対し順に処理するが、要素を検出する順番を指定できる
// toArray: 配列に変換する
// reduce: 任意の集約処理を行う汎用的なメソッド
// collect: ストリーム処理の結果を任意の形式で返す汎用的なメソッド 
//(よくあるユースケースとして、結果をコレクションとして返したい場合などはこれを使う)

// min: 最小値を返す
// max: 最大値を返す
// count: 要素数を返す
// anyMatch: 条件がいずれかの要素に合致するかどうかを返す
// allMatch: 条件がすべての要素に合致するかどうかを返す
// noneMatch: 条件がいずれの要素にも合致しないかどうかを返す
// findFirst: 最初の要素を返す
// findAny: はじめに見つけた要素を返す