/**
 * ジャバドッククラス
 * このクラスでjavadocをいろいろ使っていく
 * @author toyoda
 * @deprecated 非推奨の時に使う！
 * @see このタグは参考に見て欲しいクラスなど表示するときに使う！
 */

public class Javadoc {
  /**やりかた */
  private String method;
  /**ユーザー */
  private String user;
  /**年齢 */
  public int age;

  /** 人物を特定するメソッド
   * ここでは、HTMLを使うこともできるので<b>大きい文字</b>を作った<h3>りすることもできる</h3>！
   * @param age =>年齢を表している。
   * @exception 発生しそうなエラーとエラーが起きるタイミングなどの解説を書く！
   */

   @SuppressWarnings("serial")
   @SuppressWarnings("cast")
   
   /**
    * @param   age 年齢
    * @return  おじいちゃんの名前
    */

    
  public static String searchHuman(int age) {
    switch(age) {
      case 49 -> System.out.println("おじいちゃん");
      case 20 -> System.out.println("せいねん");
      default -> System.out.println("よくわからない");
    }
    return "おじいちゃん";
  }
