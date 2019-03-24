package SQL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbSQL {
	public Connection getConnection() {
		String user = "root";
		String password = "QueenPainIsSOCloseToPleasure1986";
		Connection connection = null;
		try {
			String serverName = "localhost";
			String portNumber = "3306";
			String configuration = "sys?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String url = "jdbc:mysql://" + serverName + ":" + portNumber + "/" + configuration;
			connection = DriverManager.getConnection(url, user, password);
		}	catch (SQLException e) {
			System.out.println("Disconnect: \n" + e.getMessage());
		}
		return connection;
	}
	
	public String getValueParam(String paramName, String paramId) {
		Statement statement;
		Connection connection;
		ResultSet resultSet;
		String result = null;
		String query = "select" + paramName + "dbpwt.mailru WHERE id ="+ paramId;
		try {
			connection = getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			System.out.println("From DataBase: ");
			while (resultSet.next()) {
				result = resultSet.getString(1);
				System.out.println(result);
			}
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error for db: \n" + e.getMessage());
		}
		return result;
		}
	

}
