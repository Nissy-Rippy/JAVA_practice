package chap21;
import chap12.TimeAccount;
public class Override {
  private String accountNo;
  
  public String toString() {
    return "おやし";
  }

  public boolean equals(Object o) {
      if (o == this) return true;
      if (o == null) return false;
      // if (!(o instanceof Account)) return false;
       TimeAccount r = (TimeAccount)o;
    
      if(this.accountNo.trim().equals(r.accountNo.trim())) { return false; }
      return true;
    }

    public static void main(String[] args) {
  

  }

}