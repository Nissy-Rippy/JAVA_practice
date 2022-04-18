package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class lesson1 {
  private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
  private static String url = "jdbc:mysql://localhost:3306/database01?user=user01&password=password01&useSSL=false";
   
 public static void main(String[] args) throws ClassNotFoundException {
  try{
      Class.forName(DRIVER);
  } catch (ClassNotFoundException e) {
      e.printStackTrace();
      throw e;
  }

       Connection connection = DriverManager.getConnection(url);
        PreparedStatement statement = connection.prepareStatement("insert into user (email, name) values (?, ?)");
        statement.setString(1, "bbb@bbb.bbb");
        statement.setString(2, "山田三郎");
        statement.execute();

        // データを更新するときはこういう感じえ記述する
        Connection connection1 = DriverManager.getConnection(url);
        PreparedStatement statement1 = connection1.prepareStatement("update set email = ?, name = ? where id = ?");
          statement.setString(1, "bbb@bbb.bbb");
          statement.setString(2, "山田三郎");
          statement.setLong(3, 1L);
          statement.execute();
         try{

         }
  }
}
