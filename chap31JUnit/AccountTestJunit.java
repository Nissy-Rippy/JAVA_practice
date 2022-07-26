
//JUnitを扱う時のあ決まりのimport文の内容とりあえずこの二行書いとけばおｋ
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

//１つのテストクラスの中に複数のテストクラスを書くのが基本である！
public class AccountTestJunit {
  
  //main メソッドは記入しない！！
  //テストメソッドには@Testをつけるのが原則！！！！！これがないとテストだと認識あされない！
  @Test public void instantiate() {
    Account a = new Account("みなと", 30000);
    //assertEqualsなど専用のメソッドを扱って確かめる！
    assertEquals("みなと", a.owner);
    assertEquals(30000, a.zandaka);
  }


  //assertEquals
   //assertSame


//assertNull  　　実際ちがnullかどうか確かめる
//assertNotNull   実際ちがnull以外かどうかを確かめる！！！

//fail()          常に失敗し続ける！！

  @Test public transfer() {

  }
}
