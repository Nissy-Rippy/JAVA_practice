package javaWcp.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Test11 {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/database01?user=user01&password=password01&useSSL=false";


    public static void main(String[] args) throws ClassNotFoundException {

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw e;
        }

        // Connection（データベースとの接続を表す）、PreparedStatement（発行するSQLを表す）を、それぞれ生成します。
        try (Connection connection = DriverManager.getConnection(URL);
                PreparedStatement statement = connection.prepareStatement("select * from user");
								PreparedStatement statement1 = connection.prepareStatement("select * from user01 where id = ?");
								) {
            // StatementにSQLを文字列で与えて実行します。
            // 戻り値は、SQLの実行結果を表す、ResultSet（結果セット）です。
            try (ResultSet resultSet  = statement.executeQuery();
						    //  ResultSet resultSet1 = statement1.setLong(1, 1L))
								{

                while (resultSet.next()) {
                    System.out.println("----------------------");
                    System.out.println(resultSet.getLong("id"));
                    System.out.println(resultSet.getString("email"));
                    System.out.println(resultSet.getString("name"));
                    System.out.println(resultSet.getDate("created_at"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}