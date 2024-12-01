package main_class;

public abstract class User {

  /**
   * KHoi tao thuoc tinh.
   */
  private String name;
  private String password;
  private String Id;

  /**
   * Khoi tao.
   */
  public User() {
  }

  public User(String name, String id) {
    this.name = name;
    this.Id = id;
  }

  /**
   * aaaaaa.
   */

  public User(String name, String Id, String password) {
    this.name = name;
    this.Id = Id;
    this.password = password;
  }

  /**
   * getter, setter.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getId() {
    return Id;
  }

  public void setId(String id) {
    this.Id = id;
  }

  public boolean checkPassword(String password) {
    if (this.getPassword().equalsIgnoreCase(password)) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * phuong thuc mac dinh.
   */
  public abstract void displayUserInfo();

  public abstract boolean isAdmin();
}