
public class BankTest {


  @Test public void setName() {
    Bank b = new Bank();
    b.setName("gorigori");
  }

  @Test public void setNameNull() {
    try {
      Bank b = new Bank();
      b.setName(null);
    } catch (NullPointerException e) {
      return;
    }
    fail();
  }
  
  @Test public void throwsExceptionWithTwoCharName() {
    Bank b = new Bank();
    assertThrows(IllegalArgumentException.class, () -> { b.setName("ミヤ"); } );
  }
}
