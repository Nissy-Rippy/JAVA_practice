import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.sql.*;

public class ItemsDAO {
  
  public static ArrayList<Item> findByMinimumPrice(int i) {

    try {
      Class.forName("org.h2.Driver");//どの種類のデータベース使ってるの？
    } catch (ClassNotFoundException e) {
      throw new IllegalStateException("ドライバーがうまく接続できていません！");
    }
    Connection con = null;
    try{
      con = DriverManager.getConnection("jdbc:h2:~/rbgdb", "sa", " ");//データベースの名前とuserとpwを教える！
      // con.setAutoCommit(false);
      // PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ITEMS WHERE 1 < price");

      PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ITEMS WHERE ? < price");
      pstmt.setInt(1, i);
      ResultSet rs = pstmt.executeQuery();

      ArrayList<Item> items = new ArrayList<>();
      while (rs.next()) {
        Item item = new Item();
        item.setName(rs.getString("NAME"));
        item.setPrice(rs.getInt("PRICE"));
        item.setWeight(rs.getInt("WEIGHT"));
        items.add(item);

      }
      rs.close(l);
      pstmt.close();

      return items;   //閉じた後に最後にreturnで戻り値を返す！
    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    } finally {
      try{
        if (con != null) {
          con.close();//しっかり接続が切れているかどうか確認すること！！
        }
      } catch (SQLException e2) {
        e2.printStackTrace();
      } 
    }
  //   ITEMS.stream()
  //        .filter(item -> item >= price)
  //        .collect(Collectors.toList());
  // }
  // public static void main(String[] args) {

  }
}
