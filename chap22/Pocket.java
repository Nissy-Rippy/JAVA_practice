package chap22;



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
  
}
