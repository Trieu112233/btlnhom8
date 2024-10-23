public class NormalUser extends User {

  /** Khoi tao thuoc tinh. */
  private String studentId;
  private String className;
  private String courseName;
  private Document borrowedDocument;

  /** Khoi tao. */
  public NormalUser(String name, String studentId, String className, String courseName) {
    super(name);
    this.studentId = studentId;
    this.className = className;
    this.courseName = courseName;
    this.borrowedDocument = null;
  }

  /** getter, setter. */
  public String getStudentId() {
    return studentId;
  }

  public String getClassName() {
    return className;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  /** in het ra. */
  @Override
  public void displayUserInfo() {
    System.out.println("User: " + getName());
    System.out.println("Student ID: " + studentId);
    System.out.println("Class: " + className);
    System.out.println("Course: " + courseName);
    if (borrowedDocument != null) {
      System.out.println("Borrowed Document: " + borrowedDocument.getTitle());
    } else {
      System.out.println("No borrowed document.");
    }
  }

  /** check admin. */
  @Override
  public boolean isAdmin() {
    return false;
  }

  /** muon sach: copiesAvailable - 1. */
  public void borrowDocument(Document doc) {
    if (borrowedDocument != null) {
      System.out.println("User already has a borrowed document.");
    } else if (doc.getCopiesAvailable() > 0) {
      borrowedDocument = doc;
      doc.setCopiesAvailable(doc.getCopiesAvailable() - 1);
      System.out.println(getName() + " borrowed " + doc.getTitle());
    } else {
      System.out.println("No copies available to borrow.");
    }
  }

  /** tra sach: copiesAvailable + 1. */
  public void returnDocument() {
    if (borrowedDocument == null) {
      System.out.println("No document to return.");
    } else {
      borrowedDocument.setCopiesAvailable(borrowedDocument.getCopiesAvailable() + 1);
      System.out.println(getName() + " returned " + borrowedDocument.getTitle());
      borrowedDocument = null;
    }
  }
}
