package GUI.NormalUser;

import java.util.ArrayList;
import main_class.Document;
import main_class.NormalUser;

import Database_connection.DatabaseManager;

import javax.swing.*;
import java.awt.*;

public class UpdateBorrowedDocumentUser extends javax.swing.JFrame {

  private javax.swing.JLabel authorLabel2;
  private javax.swing.JButton backButton;
  private javax.swing.JLabel bookTitleLabel;
  private javax.swing.JTextField bookTitleTextField;
  private javax.swing.JButton borrowButton;
  private javax.swing.JButton checkButton;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel numberOfCopiesAvailableLabel2;
  private javax.swing.JPopupMenu popupMenu;

  Document document;
  DatabaseManager dbManager = new DatabaseManager();
  private String idUser;

  public UpdateBorrowedDocumentUser(String idUser) {
    initComponents();
    this.idUser = idUser;
    dbManager = new DatabaseManager();
    jPanel1.setBackground(Color.WHITE);
    setLocationRelativeTo(null);
    setSize(750, 450);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    bookTitleLabel = new javax.swing.JLabel();
    bookTitleTextField = new javax.swing.JTextField();
    checkButton = new javax.swing.JButton();
    numberOfCopiesAvailableLabel2 = new javax.swing.JLabel();
    authorLabel2 = new javax.swing.JLabel();
    backButton = new javax.swing.JButton();
    borrowButton = new javax.swing.JButton();
    popupMenu = new javax.swing.JPopupMenu(); // Thêm JPopupMenu

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 0, 0));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Borrow Document");

    bookTitleLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    bookTitleLabel.setText("Title");

    bookTitleTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    bookTitleTextField.addKeyListener(new java.awt.event.KeyAdapter() {
      @Override
      public void keyReleased(java.awt.event.KeyEvent evt) {
        updateSuggestions(); // Gọi hàm cập nhật gợi ý khi người dùng gõ
      }
    });

    checkButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    checkButton.setText("Check");
    checkButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        checkButtonActionPerformed(evt);
      }
    });

    numberOfCopiesAvailableLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

    authorLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

    backButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    backButton.setMnemonic('B');
    backButton.setText("Back");
    backButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backButtonActionPerformed(evt);
      }
    });

    borrowButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    borrowButton.setText("Borrow");
    borrowButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        borrowButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(borrowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(authorLabel2, javax.swing.GroupLayout.Alignment.LEADING,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                            jPanel1Layout.createSequentialGroup()
                                .addComponent(bookTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bookTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 448,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(checkButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                            jPanel1Layout.createSequentialGroup()
                                .addComponent(numberOfCopiesAvailableLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 697,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE)))
                    .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bookTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkButton, javax.swing.GroupLayout.Alignment.TRAILING,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(authorLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(numberOfCopiesAvailableLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                    43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(borrowButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }

  private void bookTitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    // Kiểm tra nếu ô nhập liệu bị rỗng
    if (bookTitleTextField.getText().isEmpty()) {
      JOptionPane.showMessageDialog(this, "Please enter document title", "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    Document document = dbManager.findDocument(bookTitleTextField.getText());

    // Hiển thị thông tin tài liệu hoặc thông báo lỗi
    if (document != null) {
      authorLabel2.setText("Author: " + document.getAuthor());
      numberOfCopiesAvailableLabel2.setText("Copies available: " + document.getCopiesAvailable());
    } else {
      JOptionPane.showMessageDialog(this, "Cannot find document.",
          "Error", JOptionPane.ERROR_MESSAGE);
    }
  }

  private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {
    bookTitleTextFieldActionPerformed(evt);
  }

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    MainViewUser mainViewUser = new MainViewUser(idUser);
    mainViewUser.setVisible(true);
    this.dispose();
  }

  private void borrowButtonActionPerformed(java.awt.event.ActionEvent evt) {
    // Lấy tiêu đề sách từ trường nhập liệu
    String bookTitle = bookTitleTextField.getText();

    // Kiểm tra nếu người dùng không nhập gì
    if (bookTitle.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Please enter document title!", "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    // Tìm tài liệu dựa trên tiêu đề
    document = dbManager.findDocument(bookTitle);

    // Kiểm tra nếu tài liệu không tồn tại
    if (document == null) {
      JOptionPane.showMessageDialog(this, "Cannot find document!", "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    // Kiểm tra nếu số lượng bản sao khả dụng là 0
    if (document.getCopiesAvailable() <= 0) {
      JOptionPane.showMessageDialog(this, "Document is out of available copies!", "Notification",
          JOptionPane.WARNING_MESSAGE);
      return;
    }

    // Tìm thông tin người dùng
    NormalUser user = dbManager.findNormalUser(idUser);
    if (user == null) {
      JOptionPane.showMessageDialog(this, "Cannot find user!", "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    // Kiểm tra nếu người dùng đã mượn tài liệu này
    if (user.checkBorrowedDocument(document.getTitle())) {
      JOptionPane.showMessageDialog(this, "You are borrowing this document!", "Notification",
          JOptionPane.INFORMATION_MESSAGE);
      return;
    }

    // Giảm số lượng bản sao khả dụng
    int newCopiesAvailable = document.getCopiesAvailable() - 1;

    // Cập nhật thông tin mượn tài liệu
    try {
      // Thêm tài liệu vào danh sách mượn
      user.addBorrowedDocument(document);

      // Cập nhật số lượng bản sao trong cơ sở dữ liệu
      dbManager.updateDocument(bookTitle, newCopiesAvailable);
      dbManager.addBorrowedDocument(idUser, bookTitle);

      JOptionPane.showMessageDialog(this, "Borrow successfully!", "Notification",
          JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, "Error updating database!", "Error",
          JOptionPane.ERROR_MESSAGE);
      e.printStackTrace(); // In lỗi ra console để debug
    }
  }

  private Timer typingTimer;
  private boolean isUpdating = false;

  private void updateSuggestions() {
    if (isUpdating) {
      return; // Không thực hiện nếu đang trong trạng thái cập nhật
    }

    String query = bookTitleTextField.getText().trim();

    // Ẩn popup cũ nếu không có input
    popupMenu.setVisible(false);

    if (!query.isEmpty()) {
      // Hủy timer trước đó nếu tồn tại
      if (typingTimer != null) {
        typingTimer.stop();
      }

      // Tạo một timer để trì hoãn việc xử lý
      typingTimer = new Timer(250, e -> {
        new Thread(() -> {
          try {
            // Truy vấn danh sách các tiêu đề sách từ cơ sở dữ liệu
            ArrayList<Document> matchingDocuments = dbManager.findDocumentsByPrefix(query);

            // Cập nhật giao diện gợi ý
            SwingUtilities.invokeLater(() -> {
              popupMenu.removeAll(); // Xóa các mục cũ trong popup

              if (!matchingDocuments.isEmpty()) {
                for (Document doc : matchingDocuments) {
                  String title = doc.getTitle();
                  JMenuItem item = new JMenuItem(title);

                  // Xử lý khi chọn một mục gợi ý
                  item.addActionListener(e1 -> {
                    isUpdating = true; // Đánh dấu đang cập nhật
                    bookTitleTextField.setText(title); // Điền tên sách vào text field
                    popupMenu.setVisible(false); // Ẩn popup

                    // Cập nhật giao diện với thông tin tài liệu

                    isUpdating = false; // Hoàn tất cập nhật
                  });

                  popupMenu.add(item);
                }

                // Hiển thị popup bên dưới JTextField
                popupMenu.show(bookTitleTextField, 0, bookTitleTextField.getHeight());
                bookTitleTextField.requestFocusInWindow(); // Đảm bảo focus vẫn ở JTextField
              }
            });
          } catch (Exception ex) {
            ex.printStackTrace(); // Xử lý ngoại lệ nếu cần
          }
        }).start();
      });

      typingTimer.setRepeats(false); // Đảm bảo chỉ gọi một lần sau khoảng thời gian trễ
      typingTimer.start(); // Bắt đầu
    } else {
      popupMenu.setVisible(false); // Ẩn popup khi không có từ khóa tìm kiếm
    }
  }

  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(UpdateBorrowedDocumentUser.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(UpdateBorrowedDocumentUser.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(UpdateBorrowedDocumentUser.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(UpdateBorrowedDocumentUser.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new UpdateBorrowedDocumentUser("24022294").setVisible(true);
      }
    });
  }

}
