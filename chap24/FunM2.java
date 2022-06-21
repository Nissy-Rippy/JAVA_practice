package chap24;

//同じ型の2つの引数に対応する
import java.util.function.BiFunction;
//似たように2つの同じ基本データを受け取る関数を格納するには
import java.util.function.ToIntBiFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.IntBinaryOperator;

public class FunM2 {

  public static int add(int a, int b) { return a * b ; }
  public static void main(String[] args) {

    //前の二つのStringが引数！　そして、3つめのStringが戻り値になっている！！！
    BiFunction<String, String, String> func = System::getProperty;
    System.out.println( func.apply("JAVA.Version", "不明") );


    // IntBinaryOperator<Integer, Integer, Integer> ibo = FunM2::add;
    // 既に決まっているので,ジェネリックスを持たない。
    IntBinaryOperator ibo = FunM2::add;
    ibo.applyAsInt(2,3);
    System.out.println(ibo.applyAsInt(3, 4));


  }


}
