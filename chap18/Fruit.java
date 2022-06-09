package chap18;

import java.math.BigDecimal;
//Fruit型の
public abstract class Fruit {
  String name;
  BigDecimal price;

  public Fruit(String name, BigDecimal price) { this.name = name; this.price = price; }
  
  abstract protected String getName();
  abstract protected BigDecimal getPrice();

}

class Apple12 extends Fruit {

  Apple12(String name, BigDecimal price) { super(name, price); }

  @Override
  protected String getName() { return this.name; }

  @Override
  protected BigDecimal getPrice() { return this.price; }
}

class Peach12 extends Fruit {

  Peach12(String name, BigDecimal price) { super(name, price); }
  
  @Override
  protected String getName() { return this.name; }
  
  @Override
  protected BigDecimal getPrice() { return this.price; };

}