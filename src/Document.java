public class Document {

  /**
   * Khoi tao thuoc tinh.
   */
  private String title;
  private String author;
  private int copiesAvailable;

  /**
   * Khoi tao.
   */
  public Document(String title, String author, int copiesAvailable) {
    this.title = title;
    this.author = author;
    this.copiesAvailable = copiesAvailable;
  }

  /**
   * getter, setter.
   */
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getCopiesAvailable() {
    return copiesAvailable;
  }

  public void setCopiesAvailable(int copiesAvailable) {
    this.copiesAvailable = copiesAvailable;
  }

  /**
   * In het ra.
   */
  public void printInfo() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Copies Available: " + copiesAvailable);
  }
}
