import java.util.*;
import java.sql.*;
import java.io.*;


public class DataBase {
  static { }
  public static void main(String[] args) throws Exception {
    try {
      Class.forName("org.h2.Driver");
    } catch (ClassNotFoundException e) {
      throw new IllegalStatementException("ドライバーの接続に失敗しました");
    }
    try {
      Connection connection = DriverManager.getConnection("jdbc:h2:~/mydb");
      connection.setAutoCommit(false);

      PreparedStatement pstmt = connection.prepareStatement(
        "SELECT * FROM MONSTERS WHERE HP <= ? OR NAME = ?"
      );
      pstmt.setInt(1, 20);
      pstmt.setString(2, "五里基地");
      int r = pstmt.executeUpdate();
      connection.commit();

      if(r != 0) {
        System.out.println(r + "件のデータを削除しました。");
        pstmt.close();
      }
    } catch(SQLException e) {
      try{
        connection.rollback();
      } catch(SQLException e2) {
      e2.printStack();
      }
    }
  }
}
