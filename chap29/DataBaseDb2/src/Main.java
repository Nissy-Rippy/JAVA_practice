import java.sql.*;
//データベースの接続確立に必要
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    String name;

    //この記述は一度だけやっておけばいい処理なので静的初期化ブロック記述されることもある！
    // static {
    //     Class.forName("org.h2.Driver");
    // }

    public static void main(String[] args) throws Exception {
        // Jarファイルをしっかりクラスパスに通った状態にしておくこと！

        // Step0 事前準備をまず行うコード！
        try {
            // ドライバーの名前は、sqlなど製品ごとに異なっている！
            Class.forName("org.h2.Driver");// クラス名はデータベース作った際に書いてあったものをかく！
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("ドライバーのロードに失敗しました。：ｗ：");// Jarファイルが見つからないときの処理を書いておく必要がある！
        }
        Connection con = null;
        try {

            // ステップ１データベースの接続を行う！
            con = DriverManager.getConnection("jdbc:h2:~/mydb", "sa", "");// JDBCのＵRLをここで指定する（自分でconsoleコマンドラインで作ったもの）
            // con = DriverManager.getConnection("jdbcj:h2~/mydb(データベース名)", ID(User名), PW何も設定してないときは空白を入れてあげる)パスワードとIDが必要な場合は、このように指定してあげる良い！

            // ステップ2 1-1 まず、送信するべきSQL分のひな型を準備する
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM MONSTERS WHERE HP <= ? OR NAME = ?");//　?はパラメータ
            PreparedStatement pstmt2 = con.prepareStatement("DELETE FROM MONSTERS WHERE NAME <= ?");// ?はパラメータ

            // ステップ2 1-2 次に、ひながたに値を流し込む
            pstmt.setInt(1, 10);    //一番目の？に10を代入している　　　　パラメーターは0ではなくて1から始まるので注意
            pstmt.setString(2, "ゾンビ"); // 2つめの？にゾンビを代入しているString型

            //ステップ2  1-3組み立て終えたSQL文をDBMSに送信する

            //executeUpdate()メソッドは全ての更新系SQｌ分の送信に用いることが出来る便利！
            int r = pstmt.executeUpdate();//戻り値は、処理結果、実行件数！　送信

            //（　＾ω＾）・・・パラメーターの数をしっかり合わせて記載しないとエラーが起きるので注意かも！

            //ステップ2　1-4　処理結果を判定する

            if (r != 0) {
                System.out.println(r + "件のモンスターをさくじょしました^w^b");
            } else {
                System.out.println("該当するモンスターはありませんでした！ @w@bb");
            }
            pstmt.close();//忘れがちだが気を付けてしっかり閉じよう！


            pstmt2.setString(1, "カラス");
            pstmt2.executeUpdate();
            pstmt2.setString(1, "鶯");
            pstmt2.executeUpdate();
            pstmt2.setString(1, "すずめ");
            pstmt2.executeUpdate();
            pstmt2.close();













        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            // ステップ３データベースの切断！ここ忘れないように！
            if (con != null) {// もしまだ接続されているなら？という感じだと思う
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace(); // 切断が失敗した時のエラー処理も忘れないように！
                }
            }
        }
        // これが基本パターン！

    }
}