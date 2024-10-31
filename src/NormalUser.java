public class NormalUser extends User {

  /**
   * Khoi tao thuoc tinh.
   */
  private String className;
  private String courseName;
  private Document borrowedDocument;

  /**
   * Khoi tao.
   */
  public NormalUser(String name, String studentId, String className, String courseName) {
    super(name, studentId);
    this.className = className;
    this.courseName = courseName;
    this.borrowedDocument = null;
  }

  public NormalUser(String name, String password, String studentId, String className,
      String courseName) {
    super(name, studentId, password);
    this.className = className;
    this.courseName = courseName;
    this.borrowedDocument = null;
  }

  public NormalUser(String name, String password, String studentId, String className,
      String courseName, Document doc) {
    super(name, studentId, password);
    this.className = className;
    this.courseName = courseName;
    this.borrowedDocument = doc;
  }

  /**
   * getter, setter.
   */

  public String getClassName() {
    return className;
  }

  public String getCourseName() {
    return courseName;
  }

  public Document getBorrowedDocument() {
    return borrowedDocument;
  }


  public void setClassName(String className) {
    this.className = className;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public void setBorrowedDocument(Document borrowedDocument) {
    this.borrowedDocument = borrowedDocument;
  }

  /**
   * in het ra.
   */
  @Override
  public void displayUserInfo() {
    System.out.println("User: " + getName());
    System.out.println("Student ID: " + getId());
    System.out.println("Class: " + className);
    System.out.println("Course: " + courseName);
    if (borrowedDocument != null) {
      System.out.println("Borrowed Document: " + borrowedDocument.getTitle());
    } else {
      System.out.println("No borrowed document.");
    }
  }

  /**
   * check admin.
   */
  @Override
  public boolean isAdmin() {
    return false;
  }


}
