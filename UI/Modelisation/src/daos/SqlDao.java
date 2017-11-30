package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlDao {

	private static SqlDao instance = null;

	public static SqlDao getInstance() {
		if (instance == null) {
			instance = new SqlDao();
		}
		return instance;
	}

	private Connection connection;
	private static String url = "jdbc:sqlite:/home/zero/Programming/projet_oop/UI/Modelisation/agence.db";

	private SqlDao() {
		try {
			this.connection = DriverManager.getConnection(this.url);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public Connection getConnection() {
		return this.connection;
	}

}
