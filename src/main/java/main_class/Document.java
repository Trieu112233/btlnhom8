package main_class;

public class Document {

  /**
   * Khoi tao thuoc tinh.
   */
  private String title;
  private String author;
  private int copiesAvailable;
  private String description;
  private String image;
  private String previewLink;

  /**
   * Khoi tao.
   */
  public Document() {
  }

  public Document(String title, String author, int copiesAvailable) {
    this.title = title;
    this.author = author;
    this.copiesAvailable = copiesAvailable;
  }

  public Document(String title, String author, int copiesAvailable, String descripition,
      String image) {
    this.title = title;
    this.author = author;
    this.copiesAvailable = copiesAvailable;
    this.description = descripition;
    this.image = image;
  }

  public Document(String title, String author, int copiesAvailable, String descripition,
      String image, String previewLink) {
    this.title = title;
    this.author = author;
    this.copiesAvailable = copiesAvailable;
    this.description = descripition;
    this.image = image;
    this.previewLink = previewLink;
  }

  /**
   * getter, setter.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getCopiesAvailable() {
    return copiesAvailable;
  }

  public void setCopiesAvailable(int copiesAvailable) {
    this.copiesAvailable = copiesAvailable;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getPreviewLink() {
    return previewLink;
  }

  public void setPreviewLink(String previewLink) {
    this.previewLink = previewLink;
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