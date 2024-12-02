package Database_connection;

import main_class.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;

public class DatabaseManager {

  private Connection connection;

  public DatabaseManager() {
    this.connection = DatabaseConnection.getConnection();
  }

  // Phương thức kiểm tra tính hợp lệ của URL
  private boolean isValidURL(String url) {
    try {
      new URL(url); // Nếu không có lỗi, URL hợp lệ
      return true;
    } catch (MalformedURLException e) {
      return false; // URL không hợp lệ
    }
  }

  /**
   * them sach.
   */
  public void addDocument(Document doc) {
    String sql = "INSERT INTO document (title, author, copies_available, description, image, previewLink) VALUES (?, ?, ?, ?, ?, ?)";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      // Kiểm tra độ dài title (giới hạn 50 ký tự hoặc giá trị trong cơ sở dữ liệu)
      String truncatedTitle =
          doc.getTitle().length() > 500 ? doc.getTitle().substring(0, 500) : doc.getTitle();

      // Kiểm tra image nếu không phải là null, nó phải là một URL hợp lệ
      String image = doc.getImage();
      if (image != null && !isValidURL(image)) {
        throw new IllegalArgumentException("Image must be a valid URL link if provided!");
      }

      // Nếu image là null, cơ sở dữ liệu sẽ lưu null
      stmt.setString(1, truncatedTitle);
      stmt.setString(2, doc.getAuthor());
      stmt.setInt(3, doc.getCopiesAvailable());
      stmt.setString(4, doc.getDescription());
      stmt.setString(5, image); // Nếu image là null, lưu null vào cơ sở dữ liệu
      stmt.setString(6, doc.getPreviewLink());
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } catch (IllegalArgumentException e) {
      System.err.println("Invalid input: " + e.getMessage());
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
  public void updateDocument(String name, int updatedCopies) {
    try {
      // Kiểm tra SQL Update
      String sql = "UPDATE document SET copies_available = ? WHERE title = ?";
      PreparedStatement stmt = connection.prepareStatement(sql);
      stmt.setInt(1, updatedCopies);
      stmt.setString(2, name);
      int rowsUpdated = stmt.executeUpdate();
      if (rowsUpdated == 0) {
        System.out.println("Không có bản ghi nào được cập nhật.");
      }
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
            rs.getInt("copies_available"),
            rs.getString("description"),
            rs.getString("image"),
            rs.getString("previewLink")
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
            rs.getInt("copies_available"),
            rs.getString("description"),
            rs.getString("image"),
            rs.getString("previewLink")
        ));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return documents;
  }

  /**
   * check xem co ai dang muon document khong.
   */
  public boolean checkDocumentBeingBorrowed(String title) {
    String sql = "SELECT * FROM borrow_management WHERE book_name = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, title);
      ResultSet rs = stmt.executeQuery();
      return rs.next(); // Returns true if a row exists, false otherwise
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false; // Return false if an exception occurs
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
  public boolean checkPosition(String id) {
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
   * Kiem tra xem hoc sinh co dang muon sach hay khong.
   */
  public boolean checkBorrowedDocument(String studentId) {
    String sql = "SELECT number_of_borrowed_document FROM normal_user WHERE student_id = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, studentId);
      ResultSet rs = stmt.executeQuery();

      if (rs.next()) {
        int borrowedCount = rs.getInt("number_of_borrowed_document");
        return borrowedCount > 0;
      }
      return false;
    } catch (SQLException e) {
      e.printStackTrace();
      return false; // Xảy ra lỗi truy vấn
    }
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
    // Step 1: Insert the new borrowed document into borrow_management table
    String sql = "INSERT INTO borrow_management (student_id, book_name) VALUES (?, ?)";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, studentId);
      stmt.setString(2, documentTitle);
      stmt.executeUpdate();  // Execute the insert query
    } catch (SQLException e) {
      e.printStackTrace();
      return; // Exit the method if there's an exception
    }

    // Step 2: Get current number of borrowed documents for the student and increment by 1
    String sql1 = "UPDATE normal_user SET number_of_borrowed_document = ? WHERE student_id = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql1)) {
      // Fetch current borrowed document count
      int currentBorrowedCount = findNormalUser(studentId).getNumberOfBorrowedDocument();

      // Increment the count by 1
      stmt.setInt(1, currentBorrowedCount + 1);
      stmt.setString(2, studentId);
      stmt.executeUpdate();  // Execute the update query
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

  public boolean authenticateAdmin(String adminId, String password) {
    String sql = "SELECT * FROM admin WHERE admin_id = ? AND PASSWORD = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, adminId);
      stmt.setString(2, password);
      ResultSet rs = stmt.executeQuery();
      return rs.next(); // Nếu có kết quả, admin hợp lệ
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false; // Nếu không có kết quả, admin không hợp lệ
  }

  public boolean authenticateUser(String userId, String password) {
    String sql = "SELECT * FROM normal_user WHERE student_id = ? AND PASSWORD = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, userId);
      stmt.setString(2, password);
      ResultSet rs = stmt.executeQuery();
      return rs.next(); // Nếu có kết quả, admin hợp lệ
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false; // Nếu không có kết quả, admin không hợp lệ
  }

  public boolean isAdminIdExists(String id) {
    String sql = "SELECT COUNT(*) FROM admin WHERE admin_id = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, id);
      ResultSet rs = stmt.executeQuery();
      if (rs.next()) {
        return rs.getInt(1) > 0; // Nếu COUNT > 0, ID đã tồn tại
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false; // Nếu xảy ra lỗi, giả định ID không tồn tại
  }

  public boolean deleteUserById(String id) throws SQLException {
    String sql = "DELETE FROM normal_user WHERE student_id = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, id);
      int rowsAffected = stmt.executeUpdate();
      return rowsAffected > 0;
    }
  }

}
