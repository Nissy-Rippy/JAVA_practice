import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class Bank {

  private String name;

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    if (name.length() <= 3) {
      throw new IllegalArgumentException("名前の文字が不正です！！");
    }
    
    this.name = name;
  }
}
