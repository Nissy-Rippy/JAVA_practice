package chap22;

import java.security.Key;
import java.util.Optional;

public class StrongBox<E> {
  
  private E e;
  private KeyType keyType;
  private long count = 0;

  public StrongBox(KeyType keyType) { this.keyType = keyType; }

  public void put(E e) { this.e = e; }

  public E get() {  
     count ++;
//列挙型をswitch文を扱って利用するとこうなる！

     switch (this.keyType) {

      case PADLOCK :
      if (count < 1024) { return null; }
      break;

      case BUTTON :
      if (count < 10000) { return null; }
      break;

      case DIAL :
      if (count < 30000) { return null; }
      break;

      case FINGER :
      if (count < 100000) { return null; }
      break;

     }

     //施錠できた場合には、カウントを０にして戻す
     this.count = 0;
     return this.e;
     }



  // public <E> Optional<E> save(Optional<E> e) { return e; }



}
