import java.util.Scanner;

public class LibraryManagementSystem {

  public static void main(String[] args) {
    Library library = new Library();
    Scanner scanner = new Scanner(System.in);
    User loggedInUser;

    /** Đăng nhập. */
    System.out.print("Enter your id: ");
    String userId = scanner.nextLine();

    User user = library.findAdminById(userId);

    if (user == null) {
      user = library.findNormalUserById(userId);
    }

    if (user == null) {
      System.out.println("Id not existing!");
      return;
    }

    System.out.println("Enter your password: ");
    String password = scanner.nextLine();

    if (!user.checkPassword(password)) {
      System.out.println("Incorrect password!! Please try again.");
      return;
    }

    loggedInUser = library.login(userId, password);

    boolean checkQuanLy = library.checkQuanLy(userId);
    /** Hiển thị menu theo loại người dùng. */
    if (loggedInUser.isAdmin()) {
      adminMenu(library, loggedInUser, scanner, checkQuanLy);
    } else {
      normalUserMenu(library, loggedInUser, scanner);
    }
  }

  /**
   * Admin menu.
   */
  private static void adminMenu(Library library, User loggedInUser, Scanner scanner,
      boolean checkQuanLy) {
    Admin loggedInAdmin = (Admin) loggedInUser;
    String option;
    do {
      System.out.println("\nWelcome Admin, " + loggedInUser.getName() + "!");
      System.out.println("[0] Exit");
      System.out.println("[1] Add Document");
      System.out.println("[2] Remove Document");
      System.out.println("[3] Update Document");
      System.out.println("[4] Find Document");
      System.out.println("[5] Display All Documents");
      System.out.println("[6] Add User");
      System.out.println("[7] Find User");
      System.out.println("[8] Display All Students");
      System.out.println("[9] Display All Admins");
      System.out.println("[10] Remove Student");
      System.out.println("[11] Remove Admin");
      System.out.print("Select an option: ");
      option = scanner.nextLine();

      switch (option) {
        case "0":
          System.out.println("Exiting system...");
          break;
        case "1":
          System.out.print("Enter title: ");
          String title = scanner.nextLine();
          System.out.print("Enter author: ");
          String author = scanner.nextLine();
          System.out.print("Enter number of copies: ");
          int copies = Integer.parseInt(scanner.nextLine());
          library.addDocument(loggedInUser, title, author, copies);
          break;
        case "2":
          System.out.print("Enter title: ");
          title = scanner.nextLine();
          library.removeDocument(loggedInUser, title);
          break;
        case "3":
          System.out.print("Enter title: ");
          title = scanner.nextLine();
          System.out.print("Enter new number of copies: ");
          copies = Integer.parseInt(scanner.nextLine());
          library.updateDocument(loggedInUser, title, copies);
          break;
        case "4":
          System.out.print("Enter title: ");
          title = scanner.nextLine();
          library.searchDocument(title);
          break;
        case "5":
          library.displayAllDocuments();
          break;
        case "6":
          System.out.print("Enter user's name: ");
          String name = scanner.nextLine();
          System.out.print("Is this an admin (true/false)? ");
          boolean isAdmin = Boolean.parseBoolean(scanner.nextLine());
          library.addUser(loggedInAdmin, name, isAdmin);
          break;
        case "7":
          System.out.print("Enter the user's ID to search: ");
          String searchId = scanner.nextLine();
          User foundUser = library.findAdminById(searchId);
          if (foundUser != null) {
            foundUser.displayUserInfo();
          } else {
            foundUser = library.findNormalUserById(searchId);
            if (foundUser != null) {
              foundUser.displayUserInfo();
            } else {
              System.out.println("User not found.");
            }
          }
          break;
        case "8":
          library.displayAllStudents();
          break;
        case "9":
          library.displayAllAdmins();
          break;
        case "10":
          System.out.print("Enter student's ID: ");
          String student_id = scanner.nextLine();
          library.removeNormalUser(loggedInAdmin, student_id);
          break;
        case "11":
          if (checkQuanLy) {
            System.out.print("Enter admin's ID: ");
            String remove_admin_id = scanner.nextLine();
            library.removeAdmin(remove_admin_id);
          } else {
            System.out.println("Permission denied! Only quan ly can remove admins.");
          }
          break;
        default:
          System.out.println("Invalid option! Please try again.");
      }
    } while (!option.equals("0"));
  }

  /**
   * Student menu.
   */
  private static void normalUserMenu(Library library, User loggedInUser, Scanner scanner) {
    String option;
    do {
      System.out.println("\nWelcome, " + loggedInUser.getName() + "!");
      System.out.println("[0] Exit");
      System.out.println("[1] Find Document");
      System.out.println("[2] Display All Documents");
      System.out.println("[3] Borrow Document");
      System.out.println("[4] Return Document");
      System.out.println("[5] Display User Info");
      System.out.print("Select an option: ");
      option = scanner.nextLine();

      switch (option) {
        case "0":
          System.out.println("Exiting system...");
          break;
        case "1":
          System.out.print("Enter title: ");
          String title = scanner.nextLine();
          library.searchDocument(title);
          break;
        case "2":
          library.displayAllDocuments();
          break;
        case "3":
          if (loggedInUser instanceof NormalUser) {
            System.out.print("Enter document title: ");
            String docTitle = scanner.nextLine();
            Document doc = library.findDocument(docTitle);
            if (doc != null) {
              library.borrowDocument(doc, (NormalUser) loggedInUser);
            }
          }
          break;
        case "4":
          if (loggedInUser instanceof NormalUser) {
            library.returnDocument((NormalUser) loggedInUser);
          }
          break;
        case "5":
          loggedInUser.displayUserInfo();
          break;
        default:
          System.out.println("Invalid option! Please try again.");
      }
    } while (!option.equals("0"));
  }
}
