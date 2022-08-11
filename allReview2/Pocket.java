// public class Pocket {
//   private Object data;
//   public void put(Object d) { this.data = d; }
//   public Object get() { return this.data; }

// }


public class Pocket<E extends Bank> {
  
  private E data;

  public void put(E data) { this.data = data; }
  public E get() { return this.data; }

  public void setName(String name) {
    this.name = name;
  }

  // Pocket<?> p;
  // p = new Pocket<String>();
  // p = new Pocket<Integer>();
  // p = new Pocket<Hero>();

  // Pocket<? extends T> p;
  // Pocket<? super T> p;

}