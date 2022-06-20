package chap22;

import java.util.Optional;

//<>ジェネリックスで指定しないと、コンパイル時にエラーに気づけなくなる
// public class Pocket {

//   private Object data;
//   public void put(Object data) { this.data = data;  }
//   public Object get() { return this.data; }

// }


//仮引数だとこうなる

// public class Pocket<E> {

//   private E data;
//   public void data(E data) { this.data = data; }
//   public E get() {  return this.data; }

// }

// <String>で指定すると

// public class Pocket<String> {

//   private String data;
//   public void put(String data) { this.data = data; }
//   public String get() { return this.data; }

// }

public class Pocket<E extends NoType> {

  public void put(NoType noType) {

  }
//Optionalクラスは、1つのインスタンスを格納するだけのクラス  
  public static void main(String[] args) {
    Optional<String> op1 = Optional.ofNullable("いなと");
    Optional<Integer> op3 = Optional.ofNullable(2);
    Optional<String> op4 = Optional.ofNullable(null);
        //Optional.of();はnullを許さないメソッドである
    // Optional<String> op2 = Optional.of(null);

    System.out.println(op1);
    // System.out.println(op2);

    //中身があるかどうか確認する
    System.out.println(op1.isPresent());

    System.out.println("勇者" + op1.get() );

    //get()の際にnullだとエラーが発生する
    // System.out.println("勇者" + op4.get());

    //orElseはnullを置換して内容を取得できる。
    System.out.println("勇者" + op1.orElse("ななし") );//いなと　のまま
    System.out.println("勇者" + op4.orElse("ななし") );//nullなので　ななしに入れ替わる


    }
  
}
