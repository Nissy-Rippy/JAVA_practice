package review;


public class Review2<E> {

  private E e;
  private E keyType;
  private long count;

  public Review2(KeyType keyType) { this.keyType = keyType; }

  public void put(E e)  {
    this.e = e;
  }

  public E get() {
    this.count++;
    switch (this.keyType) {
      case PADLOCK:
      if (count < 1024) return null;
      break;
      case BUTTON:
      if (count < 10000) return null;
      break;
      case DIAL:
      if (count < 30000) return null;
      break;
      case FINGER:
      if (count < 1000000) { return null; }
      this.count = 0;
      return this.keyType;
  }
}

}
