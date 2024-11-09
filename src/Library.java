import java.util.ArrayList;
import java.util.Scanner;

public class Library {

  /**
   * Khoi tao thuoc tinh.
   */
  private DatabaseManager dbManager;

  /**
   * Khoi tao.
   */
  public Library() {
    this.dbManager = new DatabaseManager();
  }

  /**
   * Them sach (admin only).
   */
  public void addDocument(String title, String author, int copiesAvailable) {
    Document doc = new Document(title, author, copiesAvailable);
    dbManager.addDocument(doc);
    System.out.println("Document added: " + title);
  }

  /**
   * Xoa sach (admin only).
   */
  public void removeDocument(String title) {
    Document doc = findDocument(title);
    if (doc != null) {
      dbManager.removeDocument(title);
      System.out.println("Document removed: " + title);
    } else {
      System.out.println("Document not found.");
    }
  }

  /**
   * Cap nhat sach (admin only).
   */
  public void updateDocument(String title, int newCopies) {
    Document doc = findDocument(title);
    if (doc != null) {
      doc.setCopiesAvailable(newCopies);
      dbManager.updateDocument(title, newCopies);
      System.out.println("Updated document: " + title);
    } else {
      System.out.println("Document not found.");
    }
  }

  /**
   * Hien thong tin sach.
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
   * Tra cuu  sach.
   */
  public Document findDocument(String title) {
    return dbManager.findDocument(title);
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
  public void addUser(String name, boolean isAdmin) {
    Scanner scanner = new Scanner(System.in);
    if (isAdmin) {
      System.out.print("Enter admin ID: ");
      String adminId = scanner.nextLine();
      System.out.print("Enter admin position: ");
      String position = scanner.nextLine();
      System.out.print("Enter password: ");
      String password = scanner.nextLine();

      Admin admin = new Admin(name, password, adminId, position);

      dbManager.addAdmin(admin);

      System.out.println("Admin added: " + name + "\nID: " + adminId + "\nposition: " + position);
    } else {
      System.out.print("Enter student ID: ");
      String studentId = scanner.nextLine();
      System.out.print("Enter class name: ");
      String className = scanner.nextLine();
      System.out.print("Enter course name: ");
      String courseName = scanner.nextLine();
      System.out.print("Enter password: ");
      String password = scanner.nextLine();

      NormalUser student = new NormalUser(name, password, studentId, className, courseName);

      dbManager.addNormalUser(student);
      System.out.println("User added: " + name + " (Student ID: " + studentId + ")");
    }
  }


  /**
   * Tim nguoi dung (admin only).
   */
  public NormalUser findNormalUserById(String Id) {
    return dbManager.findNormalUser(Id);
  }

  public Admin findAdminById(String Id) {
    return dbManager.findAdmin(Id);
  }

  public boolean checkQuanLy(String id) {
    return dbManager.checkQuanLy(id);
  }

  /**
   * Hien thi tat ca hoc sinh(Admin only).
   */
  public void displayAllStudents() {
    ArrayList<NormalUser> students = dbManager.getAllNormalUsers();
    for (NormalUser student : students) {
      student.displayUserInfo();
      System.out.println("\n");
    }
  }

  /**
   * Hien thi tat ca admin(admin only).
   */
  public void displayAllAdmins() {
    ArrayList<Admin> admins = dbManager.getAllAdmins();
    for (Admin admin : admins) {
      admin.displayUserInfo();
      System.out.println("\n");
    }
  }

  /**
   * Xoa hoc sinh.
   */
  public void removeNormalUser(String id) {
    NormalUser remove_student = findNormalUserById(id);
    if (remove_student != null) {
      dbManager.removeNormalUser(id);
      System.out.println("Student removed.");
    } else {
      System.out.println("Student not found.");
    }
  }


  /**
   * Xoa admin.
   */
  public void removeAdmin(String remove_id) {
    Admin remove_admin = findAdminById(remove_id);
    if (remove_admin != null) {
      dbManager.removeAdmin(remove_id);
      System.out.println("Admin removed.");
    } else {
      System.out.println("Admin not found.");
    }
  }

  /**
   * muon sach: copiesAvailable - 1.
   */
  public void borrowDocument(String title, NormalUser student) {
    if (!student.checkBorrowedDocument(title)) {
      Document doc = findDocument(title);
      if (doc.getCopiesAvailable() > 0) {
        student.addBorrowedDocument(doc);
        dbManager.addBorrowedDocument(student.getId(), title);
        dbManager.updateDocument(title, doc.getCopiesAvailable() - 1);
        System.out.println(student.getName() + " borrowed " + title);
      } else {
        System.out.println("No copies available to borrow.");
      }
    } else {
      System.out.println(student.getName() + "has borrowed " + title + " before!");
    }
  }

  /**
   * tra sach: copiesAvailable + 1.
   */
  public void returnDocument(NormalUser student, String title) {
    if (student.getBorrowedDocument().isEmpty()) {
      System.out.println("No document to return.");
    } else {
      if (student.checkBorrowedDocument(title)) {
        Document doc = student.findBorrowedDocument(title);
        student.removeBorrowedDocument(doc);
        dbManager.removeBorrowedDocument(student.getId(), title);
        dbManager.updateDocument(title, dbManager.findDocument(title).getCopiesAvailable() + 1);
        System.out.println(student.getName() + " returned " + title);
      } else {
        System.out.println("Student has not borrowed " + title + " yet!");
      }
    }
  }

  /**
   * dang nhap.
   */
  public User login(String Id, String password) {
    // First check among admins
    ArrayList<Admin> admins = dbManager.getAllAdmins();
    for (Admin admin : admins) {
      if (admin.getId().equalsIgnoreCase(Id) && admin.getPassword()
          .equalsIgnoreCase(password)) {
        return admin;
      }
    }

    // Then check among normal users
    ArrayList<NormalUser> students = dbManager.getAllNormalUsers();
    for (NormalUser student : students) {
      if (student.getId().equalsIgnoreCase(Id) && student.getPassword()
          .equalsIgnoreCase(password)) {
        return student;
      }
    }
    return null;
  }

}
