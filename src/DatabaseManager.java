import java.sql.*;
import java.util.ArrayList;
import javax.print.Doc;

public class DatabaseManager {

  private Connection connection;

  public DatabaseManager() {
    this.connection = DatabaseConnection.getConnection();
  }

  /**
   * them sach.
   */
  public void addDocument(Document doc) {
    String sql = "INSERT INTO document (title, author, copies_available) VALUES (?, ?, ?)";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, doc.getTitle());
      stmt.setString(2, doc.getAuthor());
      stmt.setInt(3, doc.getCopiesAvailable());
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * xoa sach.
   */
  public void removeDocument(String title) {
    String sql = "DELETE FROM document WHERE title = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, title);
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * cap nhat sach.
   */
  public void updateDocument(String title, int newCopies) {
    String sql = "UPDATE document SET copies_available = ? WHERE title = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setInt(1, newCopies);
      stmt.setString(2, title);
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * tim sach.
   */
  public Document findDocument(String title) {
    String sql = "SELECT * FROM document WHERE title = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, title);
      ResultSet rs = stmt.executeQuery();
      if (rs.next()) {
        return new Document(
            rs.getString("title"),
            rs.getString("author"),
            rs.getInt("copies_available")
        );
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * tat ca sach.
   */
  public ArrayList<Document> getAllDocuments() {
    ArrayList<Document> documents = new ArrayList<>();
    String sql = "SELECT * FROM document";
    try (Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
      while (rs.next()) {
        documents.add(new Document(
            rs.getString("title"),
            rs.getString("author"),
            rs.getInt("copies_available")
        ));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return documents;
  }

  /**
   * them admmin.
   */
  public void addAdmin(Admin admin) {
    String sql = "INSERT INTO admin (admin_id, name, position, PASSWORD) VALUES (?, ?, ?, ?)";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, admin.getId());
      stmt.setString(2, admin.getName());
      stmt.setString(3, admin.getPosition());
      stmt.setString(4, admin.getPassword());
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * tim admin theo admin id.
   */
  public Admin findAdmin(String adminId) {
    String sql = "SELECT * FROM admin WHERE admin_id = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, adminId);
      ResultSet rs = stmt.executeQuery();
      if (rs.next()) {
        return new Admin(
            rs.getString("name"),
            rs.getString("PASSWORD"),
            rs.getString("admin_id"),
            rs.getString("position")
        );
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * checkQuanLy.
   */
  public boolean checkQuanLy(String id) {
    String sql = "SELECT position FROM admin WHERE admin_id = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, id);
      ResultSet rs = stmt.executeQuery();

      // Check if the result set has any rows
      if (rs.next()) {
        String position = rs.getString("position");
        // Use .equals() for string comparison
        return "quan ly".equals(position);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }

  /**
   * tat ca admin.
   */
  public ArrayList<Admin> getAllAdmins() {
    ArrayList<Admin> admins = new ArrayList<>();
    String sql = "SELECT * FROM admin";
    try (Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
      while (rs.next()) {
        admins.add(new Admin(
            rs.getString("name"),
            rs.getString("PASSWORD"),
            rs.getString("admin_id"),
            rs.getString("position")
        ));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return admins;
  }

  /**
   * them hoc sinh.
   */
  public void addNormalUser(NormalUser user) {
    String sql = "INSERT INTO normal_user (student_id, name, class_name, course_name, PASSWORD, number_of_borrowed_document) VALUES (?, ?, ?, ?, ?, ?)";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, user.getId());
      stmt.setString(2, user.getName());
      stmt.setString(3, user.getClassName());
      stmt.setString(4, user.getCourseName());
      stmt.setString(5, user.getPassword());
      stmt.setInt(6, 0);
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * Lấy danh sách tài liệu được mượn theo ID sinh viên.
   */
  public ArrayList<Document> getAllBorrowedDocument(String id) {
    ArrayList<Document> documents = new ArrayList<>();
    String sql = "SELECT book_name FROM borrow_management WHERE student_id = ?";

    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, id);
      ResultSet rs = stmt.executeQuery();

      while (rs.next()) {
        String title = rs.getString("book_name");
        Document document = findDocument(title);
        documents.add(document);
      }
      return documents;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return new ArrayList<>();
  }

  /**
   * Tim hoc sinh theo ID.
   */
  public NormalUser findNormalUser(String studentId) {
    String sql = "SELECT * FROM normal_user WHERE student_id = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, studentId);
      ResultSet rs = stmt.executeQuery();
      if (rs.next()) {
        return new NormalUser(
            rs.getString("name"),
            rs.getString("PASSWORD"),
            rs.getString("student_id"),
            rs.getString("class_name"),
            rs.getString("course_name"),
            getAllBorrowedDocument(studentId)
        );
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * Xoa hoc sinh.
   */
  public void removeNormalUser(String studentId) {
    String sql = "DELETE FROM normal_user WHERE student_id = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, studentId);
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * Xoa admin.
   */
  public void removeAdmin(String AdminId) {
    String sql = "DELETE FROM admin WHERE admin_id = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, AdminId);
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * them muon sach.
   */
  public void addBorrowedDocument(String studentId, String documentTitle) {
    String sql = "INSERT INTO borrow_management (student_id, book_name) VALUES (?, ?)";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, studentId);
      stmt.setString(2, documentTitle);
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }

    String sql1 = "UPDATE normal_user SET number_of_borrowed_document = ? where student_id = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql1)) {
      stmt.setInt(1, findNormalUser(studentId).getNumberOfBorrowedDocument());
      stmt.setString(2, studentId);
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * Xoa muon sach
   */
  public void removeBorrowedDocument(String studentId, String documentTitle) {
    String sql = "DELETE FROM borrow_management WHERE student_id = ? AND book_name = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, studentId);
      stmt.setString(2, documentTitle);
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }

    String sql1 = "UPDATE normal_user SET number_of_borrowed_document = ? where student_id = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql1)) {
      stmt.setInt(1, findNormalUser(studentId).getNumberOfBorrowedDocument());
      stmt.setString(2, studentId);
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * tat ca hoc sinh.
   */
  public ArrayList<NormalUser> getAllNormalUsers() {
    ArrayList<NormalUser> users = new ArrayList<>();
    String sql = "SELECT * FROM normal_user";
    try (Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
      while (rs.next()) {
        users.add(new NormalUser(
            rs.getString("name"),
            rs.getString("PASSWORD"),
            rs.getString("student_id"),
            rs.getString("class_name"),
            rs.getString("course_name"),
            getAllBorrowedDocument(rs.getString("student_id"))
        ));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return users;
  }


}