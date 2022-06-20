package chap24;

//同じ型の2つの引数に対応する
import java.util.function.BiFunction;
//似たように2つの同じ基本データを受け取る関数を格納するには
import java.util.function.ToIntBiFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToDoubleBiFunction;

public class FunM2 {
  public static void main(String[] args) {

    //前の二つのStringが引数！　そして、3つめのStringが戻り値になっている！！！
    BiFunction<String, String, String> func = System::getProperty;
    System.out.println( func.apply("JAVA.Version", "不明") );
    

  } 
}
