public class Admin extends User {

  /**
   * Chuc vu.
   */
  private String position;

  /**
   * Khoi tao.
   */
  public Admin() {

  }

  public Admin(String name, String adminId, String position) {
    super(name, adminId);
    this.position = position;
  }

  public Admin(String name, String password, String adminId, String position) {
    super(name, adminId, password);
    this.position = position;
  }

  /**
   * getter, setter.
   */
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  /**
   * in het ra.
   */
  @Override
  public void displayUserInfo() {
    System.out.println("Admin: " + getName());
    System.out.println("Id: " + getId());
    System.out.println("Position: " + getPosition());
  }

  /**
   * check admin.
   */
  @Override
  public boolean isAdmin() {
    return true;
  }

}
