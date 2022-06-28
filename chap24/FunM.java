package chap24;

import static chap07.Chagingnum.sum;
import java.util.function.*;

//Funtion<T, R>と定義されている。　関数の引数をTにいれて、戻り値をRになるように定義している。
//これは、引数と戻り値がしっかりある関数を代入できるようにしてくれる。
import java.util.function.Function;

//このインターフェイスでは１つの引数だけを受け取って,戻り値を返さない関数を格納することができる。
import java.util.function.Consumer;
//下記はデータの型によって使い分ける
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.DoubleConsumer;

//下記は引数がなく、戻り値飲みを返す関数を書くのするときに使う
import java.util.function.Supplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.DoubleSupplier;

public class FunM {

  public static Integer len(String s) {
    return s.length();
  }

  public Integer leng(String s) {
    return s.length();
  }

  public Integer add(int a) {
    return a * 2;
  }

  public static void main(String[] args) {

    // FunM::lenによって関数そのものを代入するのではなく、lenメソッドへの参照を代入している。
    // そしてこれは,クラス名::そのクラスの静的メソッド名となっている。
    // Function<Hero, SuperHero> hero = Mavel::gori; こういうのもアリ！
    Function<String, Integer> func = FunM::len;

    //Functionはapplyでうけとる.
    Integer a = func.apply("JAVA");
    System.out.println("文字列「JAVA」は" + a + "文字列です");

    // あとは、変数名 = インスタンス変数::そのインスタンスのメソッド名 **()はつけない
    Function<String, Integer> func1 = new FunM()::leng;

    Consumer<String> cf = System.out::println;//printlnは引数一つ！
    // 1つの引数は受け取る(accept)で、消費する(consume)だけなんでConsumerというクラス名になっている
    cf.accept("Hello, World!");

    //＜＞ ジェネリックすには、引数がないので戻り値の値を代入してあげる。
    //戻り値はget()を使って受け取る
    Supplier<String> fun = System::lineSeparator;
    System.out.println( "改行します" + fun.get() );

    // DoubleSupplier<Double> df = System::add;
    // System.out.println("改行します" + df.get());
    System.out.println("これはどう？");

  }

}
