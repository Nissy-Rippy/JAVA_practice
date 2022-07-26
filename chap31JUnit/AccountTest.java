public class AccountTest {
  public static void main(String[] args) {
    testInstantiate();//インスタンスのテスト化
    // testTransfer();   //送金テスト

  }

  //ここでしっかり動くかのメソッドを作りｍainメソッドで実際に動くか試す
  private static void testInstantiate() {
    System.out.println("AccountをNEW出来るかテストします！！");
    Account a = new Account("みなと", 30000);
    if (!("みなと".equals(a.owner))) {
      System.out.println("失敗名義人がおかしい！");
    }
    if (30000 != a.zandaka) {
      System.out.println("残高おかしい！！");
    }
  System.out.println("テストを終了します！！");
  }
  private static void tranfer() {

  }
}
