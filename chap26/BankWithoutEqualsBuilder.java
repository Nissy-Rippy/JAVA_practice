package chap26;

import java.util.Objects;

public class BankWithoutEqualsBuilder {

  String name;
  String address;

  public boolean equals(Object o){
    if (o == this) { return true; }
    if (o == null) { return false; }
    if ( !(o instanceof BankWithoutEqualsBuilder)) { return false; }
    BankWithoutEqualsBuilder r = (BankWithoutEqualsBuilder)o;
    if (!(this.name.equals(r.name))) { return false; }
    if (!(this.address).equals(r.address)) { return false; }
    return true;
  }
  


  
  public String toString() {
    return "銀行の名前 " + this.name + "住所 " + this.address;
  }
  
  public int hashCode() {
    return Objects.hash(this.name, this.address);
  }
  public BankWithoutEqualsBuilder clone() {
    BankWithoutEqualsBuilder bank = new BankWithoutEqualsBuilder();
    bank.name = this.name;
    bank.address = this.address;
    return bank;
  }
}
