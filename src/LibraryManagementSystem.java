import java.util.Scanner;

public class LibraryManagementSystem {
  public static void main(String[] args) {
    Library library = new Library();
    Scanner scanner = new Scanner(System.in);
    User loggedInUser;

    Admin trieu = new Admin("Trieu", "01", "Quan ly");
    library.addDefaultAdmin(trieu);


    // Đăng nhập
    System.out.print("Enter your username: ");
    String username = scanner.nextLine();
    loggedInUser = library.login(username);

    if (loggedInUser == null) {
      System.out.println("User not found! Exiting...");
      return;
    }

    // Hiển thị menu theo loại người dùng
    if (loggedInUser.isAdmin()) {
      adminMenu(library, loggedInUser, scanner);
    } else {
      normalUserMenu(library, loggedInUser, scanner);
    }
  }

  private static void adminMenu(Library library, User loggedInUser, Scanner scanner) {
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
          System.out.print("Enter user name: ");
          String name = scanner.nextLine();
          System.out.print("Is this an admin (true/false)? ");
          boolean isAdmin = Boolean.parseBoolean(scanner.nextLine());
          library.addUser(loggedInUser, name, isAdmin);
          break;
        case "7":
          System.out.print("Enter the user name to search: ");
          String searchId = scanner.nextLine();
          User foundUser = library.findUserById(searchId);
          if (foundUser != null) {
            foundUser.displayUserInfo();
          } else {
            System.out.println("User not found.");
          }
          break;
        case "8":
          library.displayAllStudents();
          break;
        case "9":
          library.displayAllAdmins();
          break;
        default:
          System.out.println("Invalid option! Please try again.");
      }
    } while (!option.equals("0"));
  }

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
              ((NormalUser) loggedInUser).borrowDocument(doc);
            } else {
              System.out.println("Document not found.");
            }
          }
          break;
        case "4":
          if (loggedInUser instanceof NormalUser) {
            ((NormalUser) loggedInUser).returnDocument();
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
