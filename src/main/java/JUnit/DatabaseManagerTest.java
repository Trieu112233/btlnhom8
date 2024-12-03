package JUnit;

import main_class.Admin;
import main_class.Document;
import main_class.NormalUser;
import Database_connection.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DatabaseManagerTest {

  private DatabaseManager dbManager;

  @BeforeEach
  void setup() {
    dbManager = new DatabaseManager();
  }

  @Test
  public void testAddDocument() {
    Document doc = new Document("Test Title", "Test Author", 5, "Test description",
        "https://imageLink", "https://previewLink");
    dbManager.addDocument(doc);

    Document retrievedDoc = dbManager.findDocument("Test Title");
    assertNotNull(retrievedDoc);
    assertEquals("Test Author", retrievedDoc.getAuthor());
    assertEquals("Test description", retrievedDoc.getDescription());
    assertEquals("https://imageLink", retrievedDoc.getImage());
    assertEquals("https://previewLink", retrievedDoc.getPreviewLink());

    dbManager.removeDocument(retrievedDoc.getTitle());
  }

  @Test
  public void testRemoveDocument() {
    Document doc = new Document("Test Title", "Test Author", 5, "Test description",
        "https://imageLink", "https://previewLink");
    dbManager.addDocument(doc);
    dbManager.removeDocument("Test Title");

    Document retrievedDoc = dbManager.findDocument("Test Title");
    assertNull(retrievedDoc);
  }

  @Test
  public void testUpdateDocument() {
    Document doc = new Document("Test Title", "Test Author", 5, "Test description",
        "https://imageLink", "https://previewLink");
    dbManager.addDocument(doc);
    dbManager.updateDocument("Test Title", 10);

    Document updatedDoc = dbManager.findDocument("Test Title");
    assertEquals(10, updatedDoc.getCopiesAvailable());

    dbManager.removeDocument("Test Title");
  }

  @Test
  public void testFindDocument() {
    Document doc = new Document("Test Title", "Test Author", 5, "Test Description",
        "https://imageLink", "https://previewLink");
    dbManager.addDocument(doc);

    Document foundDoc = dbManager.findDocument("Test Title");

    assertNotNull(foundDoc);
    assertEquals("Test Title", foundDoc.getTitle());
    assertEquals("Test Author", foundDoc.getAuthor());
    assertEquals("Test Description", foundDoc.getDescription());
    assertEquals("https://imageLink", foundDoc.getImage());
    assertEquals("https://previewLink", foundDoc.getPreviewLink());

    dbManager.removeDocument("Test Title");
  }

  @Test
  public void testAddAdmin() {
    Admin admin = new Admin("Admin Name", "Admin password", "admin_id", "position");
    dbManager.addAdmin(admin);

    Admin foundAdmin = dbManager.findAdmin("admin_id");
    assertNotNull(foundAdmin);
    assertEquals("Admin Name", foundAdmin.getName());
    assertEquals("Admin password", foundAdmin.getPassword());
    assertEquals("position", foundAdmin.getPosition());

    dbManager.removeAdmin("admin_id");
  }

  @Test
  public void testRemoveAdmin() {
    Admin admin = new Admin("Admin Name", "password", "admin_id", "position");
    dbManager.addAdmin(admin);
    dbManager.removeAdmin("admin_id");

    Admin foundAdmin = dbManager.findAdmin("admin_id");
    assertNull(foundAdmin);
  }

  @Test
  public void testCheckPosition() {
    Admin admin1 = new Admin("Admin Name 1", "Admin password 1", "admin_id_1", "position");
    Admin admin2 = new Admin("Admin Name 2", "Admin password 2", "admin_id_2", "quan ly");

    dbManager.addAdmin(admin1);
    dbManager.addAdmin(admin2);

    boolean checkPos1 = dbManager.checkPosition("admin_id_1");
    boolean checkPos2 = dbManager.checkPosition("admin_id_2");

    assertFalse(checkPos1);
    assertTrue(checkPos2);

    dbManager.removeAdmin("admin_id_1");
    dbManager.removeAdmin("admin_id_2");
  }

  @Test
  public void testAuthenticateAdmin() {
    Admin admin = new Admin("Admin Name", "password", "Id", "position");
    dbManager.addAdmin(admin);

    assertTrue(dbManager.authenticateAdmin("Id", "password"));
    assertFalse(dbManager.authenticateAdmin("Id", "wrong_password"));

    dbManager.removeAdmin("Id");
  }

  @Test
  public void testAddNormalUser() {
    NormalUser user = new NormalUser("User Name", "password", "student_id", "Class 1", "Course 1");
    dbManager.addNormalUser(user);

    NormalUser foundUser = dbManager.findNormalUser("student_id");
    assertNotNull(foundUser);
    assertEquals("User Name", foundUser.getName());
    assertEquals("password", foundUser.getPassword());
    assertEquals("Class 1", foundUser.getClassName());
    assertEquals("Course 1", foundUser.getCourseName());

    dbManager.removeNormalUser(foundUser.getId());
  }

  @Test
  public void testRemoveNormalUser() {
    NormalUser user = new NormalUser("User Name", "password", "student_id", "Class 1", "Course 1");
    dbManager.addNormalUser(user);
    dbManager.removeNormalUser("student_id");

    NormalUser foundUser = dbManager.findNormalUser("student_id");
    assertNull(foundUser);
  }

  @Test
  public void testAuthenticateUser() {
    NormalUser user = new NormalUser("User Name", "password", "Id", "Class A", "Course A");
    dbManager.addNormalUser(user);

    assertTrue(dbManager.authenticateUser("Id", "password"));
    assertFalse(dbManager.authenticateUser("Id", "wrong_password"));

    dbManager.removeNormalUser("Id");
  }

  @Test
  public void testCheckBorrowedDocument() {
    NormalUser user = new NormalUser("User Name", "password", "student_id", "Class 1", "Course 1");
    dbManager.addNormalUser(user);

    assertFalse(dbManager.checkBorrowedDocument("student_id"));
    dbManager.addBorrowedDocument("student_id", "Test Title");
    assertTrue(dbManager.checkBorrowedDocument("student_id"));

    dbManager.removeBorrowedDocument("student_id", "Test Title");
    dbManager.removeNormalUser("student_id");
  }

  @Test
  public void testAddAndRemoveBorrowedDocument() {
    NormalUser user = new NormalUser("User Name", "password", "student_id", "Class 1", "Course 1");
    dbManager.addNormalUser(user);

    Document doc = new Document("Test Title", "Test Author", 5, "description", "https://imageLink",
        "https://previewLink");
    dbManager.addDocument(doc);

    dbManager.addBorrowedDocument("student_id", "Test Title");

    assertTrue(dbManager.checkDocumentBeingBorrowed("Test Title"));

    NormalUser updatedUser = dbManager.findNormalUser("student_id");
    assertEquals(1, updatedUser.getNumberOfBorrowedDocument());

    dbManager.removeBorrowedDocument("student_id", "Test Title");

    assertFalse(dbManager.checkDocumentBeingBorrowed("Test Title"));

    updatedUser = dbManager.findNormalUser("student_id");
    assertEquals(0, updatedUser.getNumberOfBorrowedDocument());

    dbManager.removeDocument("Test Title");
    dbManager.removeNormalUser("student_id");
  }
}
