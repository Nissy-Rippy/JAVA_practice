package mySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionTest {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/database01?user=user01&password=password01&useSSL=false";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try{
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw e;
		}

		try(Connection connection = DriverManager.getConnection(URL);
		    PreparedStatement statement = connection.prepareStatement("select * from user01"))
				{
			try(ResultSet resultSet = statement.executeQuery()){
				while (resultSet.next()) {
					System.out.println("--------------------");
					System.out.println(resultSet.getLong("id"));
					System.out.println(resultSet.getString("name"));
					System.out.println(resultSet.getString("email"));
				}
			}
			catch (SQLException e){
				e.printStackTrace();
			}
		}

	}
}
