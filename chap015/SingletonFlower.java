

public final class SingletonFlower {

  private static SingletonFlower theInstance;
  private  SingletonFlower() { }


  /**
   * このメソッドによって、いんすたんかすることが許されており、
   * getInstance がｎullの場合のみ新しいインスタンスを作ることが出来るようになっている。
   * 既に、生成されている場合はそのインスタンスを戻り値としている。
   * 
   * @return  唯一無二のインスタンス getInstance
   */
  public static SingletonFlower getInstance() {
    if (theInstance == null) {
      theInstance = new SingletonFlower();
    }
    return theInstance;
  }
  public static void main(String[] args) {
    
  }
}
