import java.util.ArrayList;
import java.util.Scanner;

public class Library {

  /**
   * Khoi tao thuoc tinh.
   */
  public DatabaseManager dbManager;

  /**
   * Khoi tao.
   */
  public Library() {
    this.dbManager = new DatabaseManager();
  }

  /**
   * Them sach (admin only).
   */
  public void addDocument(User user, String title, String author, int copiesAvailable) {
    if (user.isAdmin()) {
      Document doc = new Document(title, author, copiesAvailable);
      dbManager.addDocument(doc);
      System.out.println("Document added: " + title);
    } else {
      System.out.println("Permission denied! Only admins can add documents.");
    }
  }

  /**
   * Xoa sach (admin only).
   */
  public void removeDocument(User user, String title) {
    if (user.isAdmin()) {
      Document doc = findDocument(title);
      if (doc != null) {
        dbManager.removeDocument(title);
        System.out.println("Document removed: " + title);
      } else {
        System.out.println("Document not found.");
      }
    } else {
      System.out.println("Permission denied! Only admins can remove documents.");
    }
  }

  /**
   * Cap nhat sach (admin only).
   */
  public void updateDocument(User user, String title, int newCopies) {
    if (user.isAdmin()) {
      Document doc = findDocument(title);
      if (doc != null) {
        doc.setCopiesAvailable(newCopies);
        dbManager.updateDocument(title, newCopies);
        System.out.println("Updated document: " + title);
      } else {
        System.out.println("Document not found.");
      }
    } else {
      System.out.println("Permission denied! Only admins can update documents.");
    }
  }

  /**
   * Tim sach.
   */
  public void searchDocument(String title) {
    Document doc = findDocument(title);
    if (doc != null) {
      doc.printInfo();

    } else {
      System.out.println("Document not found.");
    }
  }

  /**
   * In het sach ra.
   */
  public void displayAllDocuments() {
    ArrayList<Document> documents = dbManager.getAllDocuments();
    for (Document doc : documents) {
      doc.printInfo();
      System.out.println("\n");
    }
  }

  /**
   * Them nguoi dung (admin only).
   */
  public void addUser(User user, String name, boolean isAdmin) {
    if (user.isAdmin()) {
      Scanner scanner = new Scanner(System.in);
      if (isAdmin) {
        System.out.print("Enter admin ID: ");
        String adminId = scanner.nextLine();
        System.out.print("Enter admin position: ");
        String position = scanner.nextLine();

        Admin admin = new Admin(name, adminId, position);

        dbManager.addAdmin(admin);

        System.out.println("Admin added: " + name + "\nID: " + adminId + "\nposition: " + position);
      } else {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter class name: ");
        String className = scanner.nextLine();
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();

        NormalUser student = new NormalUser(name, studentId, className, courseName);

        dbManager.addNormalUser(student);
        System.out.println("User added: " + name + " (Student ID: " + studentId + ")");
      }
    } else {
      System.out.println("Permission denied! Only admins can add users.");
    }
  }

  /**
   * Tim nguoi dung.
   */
  public NormalUser findUserById(String id) {
    return dbManager.findNormalUser(id);
  }

  public void displayAllStudents() {
    ArrayList<NormalUser> students = dbManager.getAllNormalUsers();
    for(NormalUser student: students){
      student.displayUserInfo();
      System.out.println("\n");
    }
  }

  public void displayAllAdmins() {
    ArrayList<Admin> admins = dbManager.getAllAdmins();
    for(Admin admin: admins){
      admin.displayUserInfo();
      System.out.println("\n");
    }
  }

  /**
   * Tra sach.
   */
  public Document findDocument(String title) {
    return dbManager.findDocument(title);
  }

  /**
   * muon sach: copiesAvailable - 1.
   */
  public void borrowDocument(Document doc, NormalUser student) {
    if (student.getBorrowedDocument() != null) {
      System.out.println("User already has a borrowed document.");
    } else if (doc.getCopiesAvailable() > 0) {
      student.setBorrowedDocument(doc);
      dbManager.updateBorrowedDocument(student.getStudentId(), doc.getTitle());
      doc.setCopiesAvailable(doc.getCopiesAvailable() - 1);
      System.out.println(student.getName() + " borrowed " + doc.getTitle());
    } else {
      System.out.println("No copies available to borrow.");
    }
  }

  /**
   * tra sach: copiesAvailable + 1.
   */
  public void returnDocument(NormalUser student) {
    if (student.getBorrowedDocument() == null) {
      System.out.println("No document to return.");
    } else {
      student.getBorrowedDocument().setCopiesAvailable(student.getBorrowedDocument().getCopiesAvailable() + 1);
      System.out.println(student.getName() + " returned " + student.getBorrowedDocument().getTitle());
      dbManager.updateBorrowedDocument(student.getStudentId(), "");
      student.setBorrowedDocument(null);
    }
  }

  /**
   * dang nhap.
   */
  public User login(String username) {
    // First check among admins
    ArrayList<Admin> admins = dbManager.getAllAdmins();
    for (Admin admin : admins) {
      if (admin.getName().equalsIgnoreCase(username)) {
        return admin;
      }
    }

    // Then check among normal users
    ArrayList<NormalUser> students = dbManager.getAllNormalUsers();
    for (NormalUser student : students) {
      if (student.getName().equalsIgnoreCase(username)) {
        return student;
      }
    }

    return null;
  }


}
