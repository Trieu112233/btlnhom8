package main_class;

import java.util.ArrayList;
import java.util.List;

public class NormalUser extends User {

  /**
   * Khoi tao thuoc tinh.
   */
  private String className;
  private String courseName;
  private int numberOfBorrowedDocument;
  private List<Document> borrowedDocument;

  /**
   * Khoi tao.
   */
  public NormalUser() {
  }

  public NormalUser(String name, String studentId, String className, String courseName) {
    super(name, studentId);
    this.className = className;
    this.courseName = courseName;
    this.numberOfBorrowedDocument = 0;
    this.borrowedDocument = new ArrayList<>();
  }

  public NormalUser(String name, String studentId, String className, String courseName,
      int numberOfBorrowedDocument) {
    super(name, studentId);
    this.className = className;
    this.courseName = courseName;
    this.numberOfBorrowedDocument = numberOfBorrowedDocument;
    this.borrowedDocument = new ArrayList<>();
  }

  public NormalUser(String name, String password, String studentId, String className,
      String courseName) {
    super(name, studentId, password);
    this.className = className;
    this.courseName = courseName;
    this.numberOfBorrowedDocument = 0;
    this.borrowedDocument = new ArrayList<>();
  }

  public NormalUser(String name, String password, String studentId, String className,
      String courseName, List<Document> doc) {
    super(name, studentId, password);
    this.className = className;
    this.courseName = courseName;
    this.numberOfBorrowedDocument = doc.size();
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

  public List<Document> getBorrowedDocument() {
    return borrowedDocument;
  }


  public void setClassName(String className) {
    this.className = className;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public void setNumberOfBorrowedDocument(int numberOfBorrowedDocument) {
    this.numberOfBorrowedDocument = numberOfBorrowedDocument;
  }

  public int getNumberOfBorrowedDocument() {
    return numberOfBorrowedDocument;
  }

  public void addBorrowedDocument(Document borrowedDocument) {
    this.borrowedDocument.add(borrowedDocument);
    setNumberOfBorrowedDocument(this.numberOfBorrowedDocument + 1);
  }

  public void removeBorrowedDocument(Document borrowedDocument) {
    this.borrowedDocument.remove(borrowedDocument);
    setNumberOfBorrowedDocument(this.numberOfBorrowedDocument - 1);
  }

  public ArrayList<String> getAllDocumentsTitle() {
    ArrayList<String> title = new ArrayList<>();
    for (Document doc : this.borrowedDocument) {
      title.add(doc.getTitle());
    }
    return title;
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
    System.out.println("Number of borrowed document: " + numberOfBorrowedDocument);
    if (!borrowedDocument.isEmpty()) {
      System.out.println("Borrowed Document:" + "\n");
      for (Document doc : this.borrowedDocument) {
        System.out.println(doc.getTitle() + "\n");
      }
    }
  }

  /**
   * Kiem tra xem da muon sach nay chua.
   */
  public boolean checkBorrowedDocument(String title) {
    boolean check = false;
    for (Document doc1 : this.borrowedDocument) {
      if (doc1.getTitle().equalsIgnoreCase(title)) {
        check = true;
        break;
      }
    }
    return check;
  }

  /**
   * tra ve doi tuong document.
   */
  public Document findBorrowedDocument(String title) {
    Document doc = null;
    for (Document doc1 : this.borrowedDocument) {
      if (doc1.getTitle().equalsIgnoreCase(title)) {
        doc = doc1;
        break;
      }
    }
    return doc;
  }

  /**
   * check admin.
   */
  @Override
  public boolean isAdmin() {
    return false;
  }


}
