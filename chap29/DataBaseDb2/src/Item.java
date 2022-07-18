// public record Item(String name, int price, int weight) {}


public class Item {

  private String name;
  private int price;
  private int weight;

  public int getweight() { return this.weight; }
  
  public int getPrice() { return this.price; }
  
  public String getName() { return this.name; }
  
  public void setWeight(int weight) { this.weight = weight; }
  
  public void setPrice(int price) { this.price = price; }

  public void setName(String name) { this.name = name; }


}
