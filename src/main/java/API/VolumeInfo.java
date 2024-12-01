package API;

import java.util.List;
import java.util.stream.Collectors;

public class VolumeInfo {

  private String title;
  private List<String> authors;
  private String description;
  private ImageLinks imageLinks; // Đảm bảo imageLinks là kiểu ImageLinks

  // Getter và Setter

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setImageLinks(ImageLinks imageLinks) {
    this.imageLinks = imageLinks;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public ImageLinks getImageLinks() {
    return imageLinks;
  }

  public List<String> getAuthorNames() {
    if (authors == null) {
      return null;
    }
    return authors.stream().map(String::trim).filter(name -> !name.isEmpty()).collect(
        Collectors.toList());
  }

}
