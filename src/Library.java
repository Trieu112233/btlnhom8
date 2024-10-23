import java.util.ArrayList;
import java.util.Scanner;

public class Library {

  /**
   * Khoi tao thuoc tinh.
   */
  private ArrayList<Document> documents;
  private ArrayList<User> users;
  private ArrayList<NormalUser> students;
  private ArrayList<Admin> admins;

  /**
   * Khoi tao.
   */
  public Library() {
    documents = new ArrayList<>();
    users = new ArrayList<>();
    students = new ArrayList<>();
    admins = new ArrayList<>();
  }

  /**
   * Them sach (admin only).
   */
  public void addDocument(User user, String title, String author, int copiesAvailable) {
    if (user.isAdmin()) {
      Document doc = new Document(title, author, copiesAvailable);
      documents.add(doc);
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
        documents.remove(doc);
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
    for (Document doc : documents) {
      doc.printInfo();
      System.out.println();
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
        users.add(new Admin(name, adminId, position));
        admins.add(new Admin(name, adminId, position));
        System.out.println("Admin added: " + name + "\nID: " + adminId + "\nposition: " + position);
      } else {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter class name: ");
        String className = scanner.nextLine();
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();
        NormalUser student = new NormalUser(name, studentId, className, courseName);
        users.add(student);
        students.add(student);
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
    for (NormalUser student : students) {
      if (student.getStudentId().equalsIgnoreCase(id)) {
        return student;
      }
    }
    return null;
  }

  public void displayAllStudents() {
    for (NormalUser student : students) {
      student.displayUserInfo();
      System.out.println();
    }
  }

  public void displayAllAdmins() {
    for (Admin admin : admins) {
      admin.displayUserInfo();
      System.out.println();
    }
  }

  /**
   * dang nhap.
   */
  public User login(String username) {
    for (User user : users) {
      if (user.getName().equalsIgnoreCase(username)) {
        return user;
      }
    }
    return null;
  }

  /**
   * Tra sach.
   */
  public Document findDocument(String title) {
    for (Document doc : documents) {
      if (doc.getTitle().equalsIgnoreCase(title)) {
        return doc;
      }
    }
    return null;
  }

  public void addDefaultAdmin(Admin admin) {
    admins.add(admin);
    users.add(admin);
  }

  public void addDefaultStudent(NormalUser student) {
    students.add(student);
    users.add(student);
  }
}
