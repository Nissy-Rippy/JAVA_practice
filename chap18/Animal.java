package chap18;

public enum Animal {
  CAY(1000) {
    @Override
    void advertise() {
      System.out.println("まっかなりんごがなんと！！！" + getPrice() + " 円です！");
    }
  },
   DOG(3990){
     @Override
     void advertise() {
       System.out.println("まっかな犬がナント！！" + getPrice() + "円です！");
     }
   } ,
    GORIRA(10003){
      @Override
      void advertise() {
        System.out.println("このゴリラは" + getPrice() + "円ですが売りものではありません！");
      }
    };



  private int price;
  private Animal(int price) { this.price = price; }

  public int getPrice(){ return this.price; }

  abstract void advertise();
}
