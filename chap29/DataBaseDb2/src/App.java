import java.sql.*;
//データベースの接続確立に必要
import java.sql.Connection;

public class App {
//Jarファイルをしっかりクラスパスに通った状態にしておくこと！

//Step0 事前準備をまず行うコード！
try {
    //ドライバーの名前は、sqlなど製品ごとに異なっている！
    Class.forName("org.h2.Driver");//クラス名はデータベース作った際に書いてあったものをかく！
} catch (ClassNotFoundException e) {
    throw  new IllegalStateException("ドライバーのロードに失敗しました。：ｗ：");//Jarファイルが見つからないときの処理を書いておく必要がある！
}
Connection con = null;
try {

//ステップ１データベースの接続を行う！

    con = DriverManager.getConnection("jdbc:h2~/mydb");//JDBCのＵRLをここで指定する（自分でconsoleコマンドラインで作ったもの）
    //con = DriverManager.getConnection("jdbcj:h2~/mydb", ID, PW)パスワードとIDが必要な場合は、このように指定してあげる良い！

//ステップ2は、後で学習のため今はこのままにしておく　　＝ Jarファイル内にあるドライバクラスをJVMに読み込ませ有効にする
} catch (SQLException e) {
    e.printStackTrace();
} finally {

//ステップ３データベースの切断！ここ忘れないように！
    if (con != null) {//もしまだ接続されているなら？という感じだと思う
        try {
            con.close();
        } catch(SQLException e) {
            e.printStackTrace(); //切断が失敗した時のエラー処理も忘れないように！
        }
    }
}
//これが基本パターン！

}
