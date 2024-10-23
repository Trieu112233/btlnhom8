public abstract class User {

  /**
   * KHoi tao thuoc tinh.
   */
  private String name;

  /**
   * Khoi tao.
   */
  public User(String name) {
    this.name = name;
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

  /**
   * phuong thuc mac dinh.
   */
  public abstract void displayUserInfo();

  public abstract boolean isAdmin();
}
