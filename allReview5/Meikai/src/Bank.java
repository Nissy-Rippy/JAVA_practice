import org.apache.commons.lang3.builder.*;


public class Bank implements Comparable<Bank>, Cloneable {
  String name;
  String address;

  
  /** 
   * 比較するためのメソッドです
   * @param o 比較対象の物
   * @return  boolean
   */


  // public boolean equals(Object o) {
  //   if ( o == this) { return ture; }
  //   if ( o == null) { return false; }
  //   if ( !(o instanceof Bank)) { return false; }
  //   Bank r = (Bank)o;
  //   if (!(this.name.equals(r.name))) { return false; }
  //   if (!(this.address.equals(r.address))) { return false; }
  //   return true;
  // }


  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  public int compareTo(Bank o) {
    return CompareToBuilder.reflectionCompare(
      this, o, "comment", "title");
  }

  }
