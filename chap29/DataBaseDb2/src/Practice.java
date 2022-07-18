import java.sql.*;


public class Practice {
  final static String URL = "org.h2.Driver";
  public static void main(String[] args) throws Exception {
    try {
      Class.forName(URL);
    } catch (ClassNotFoundException e) {
      throw new IllegalStateException("どらーバーの接続に失敗しました；ｗ；", e); //jarファイルが見つからないときの対応！
    }
    Connection con = null;
    try {
      con = DriverManager.getConnection("jdbc:h2:~/mydb", "sa", " "); //データベースのURLを指定！
      con.setAutoCommit(false); //手動コミットに切り替える!このタイミング！

      //以下に適当なＳＱＬ分を作成し送信する

      con.commit();
    } catch (SQLException e) {
      try {
        con.rollback();//エラーが起きたらロールバックさせる！
      } catch (SQLException e2) {
        e2.printStackTrace();  // ここのｷｬｯﾁは、接続やＳＱＬ処理の失敗時の処理！
      } finally {
        if (con != null) {
          try {
            con.close();
          } catch (SQLException e3) {
            e.printStackTrace(); //接続失敗時の処理がここでキャッチ！
          }
        }
      }
    }
  }
}
