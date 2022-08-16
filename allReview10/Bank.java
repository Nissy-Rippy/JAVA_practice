/**
 * これは、MeikaiJavaのallReview10にあるファイルである
 */

package allReview10;

/**
 * 口座クラス
 * このクラスはひとつの銀行口座を表します！
 * @author Nissy
 * @deprecated 代わりにNEW　Bankクラスを使ってください
 * @see NewBank
 * 
 */
public class Bank {
  /** 銀行名 */
  private String name;

  /** 残高 */
  private int zandaka;

  /**
   *  送金を行うメソッド 
   *  このメソッドにより、<b>友達の</b>口座に送金することができる。！
   * @param account 送金先銀行
   * @param dest 送金先口座
   * @param amount 送金先
   * @return 送金手数料
   * @exception java.lang.IllgalArgumentException  残高不足の時発生する。
  */

 public void transfer(Bank dest, int amount, Account account) {

 }


}
