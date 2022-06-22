package chap25;

import java.lang.Class;

public class Class1 {
  public static void main(String[] args) {
    Class<?> info1 = String.class;//info1にStringクラスの情報を格納する

    // Class<?> info2 = Class.forName("Hero");//(FQCN文字列)
    // Class<?> info3 = 変数名.getClass();
    
    //クラス情報をインスタンスに格納して下記のメソッドを利用して情報を取得していく！！！

    System.out.println(info1.getSimpleName()); //クラス名を返す　　Stringがた 
    System.out.println(info1.getName());//java.lang.String;
    System.out.println(info1.getPackage().getName());

    System.out.println(info1.isArray());//isArrayはboolean型である
    Class<?> info3 = info1.getSuperclass();//親クラスの情報を返す
    System.out.println(info3.getName());
    Class<?> info4 = args.getClass();
    System.out.println(info4.isArray());
    System.out.println(info1.getPackage());
    System.out.println(info1.getModule());

  }
}
