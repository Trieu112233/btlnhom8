import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

  // Thông tin kết nối
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost:3306/thuvien";

  static final String USER = "root";
  static final String PASS = "";

  public static Connection getConnection() {
    Connection connection = null;
    try {
      // Tạo kết nối
      connection = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Kết nối thành công!");
    } catch (SQLException e) {
      System.out.println("Kết nối thất bại!");
      e.printStackTrace();
    }
    return connection;
  }

  public static void main(String[] args) {
    getConnection();
  }
}


