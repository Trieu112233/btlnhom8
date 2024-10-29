public class Admin extends User {

  /**
   * Chuc vu.
   */
  private String position;
  private String adminId;

  /**
   * Khoi tao.
   */
  public Admin(String name, String adminId, String position) {
    super(name);
    this.position = position;
    this.adminId = adminId;
  }

  public Admin(String name, String password, String adminId, String position) {
    super(name, password);
    this.position = position;
    this.adminId = adminId;
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

  public String getAdminId() {
    return adminId;
  }

  public void setAdminId(String adminId) {
    this.adminId = adminId;
  }

  /**
   * in het ra.
   */
  @Override
  public void displayUserInfo() {
    System.out.println("Admin: " + getName());
    System.out.println("Id: " + getAdminId());
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
