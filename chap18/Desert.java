package chap18;

public enum Desert {

  APPLE(100), ICE_CREAM(120), CAKE(145);
  private int price;
  private Desert(int price){ this.price = price; }
  public int getPrice() { return this.price; }

}
