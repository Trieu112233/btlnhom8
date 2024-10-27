public abstract class User {

  /**
   * KHoi tao thuoc tinh.
   */
  private String name;
  private String password;
  /**
   * Khoi tao.
   */
  public User(String name) {
    this.name = name;
  }

  public User(String name, String password) {
    this.name = name;
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

  public String getPassword(){
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean checkPassword(String password){
    if(this.getPassword().equalsIgnoreCase(password)){
      return true;
    }
    else return false;
  }
  /**
   * phuong thuc mac dinh.
   */
  public abstract void displayUserInfo();

  public abstract boolean isAdmin();
}
