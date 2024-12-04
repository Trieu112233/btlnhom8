package GUI.Admin.User;

import main_class.Document;
import main_class.NormalUser;

import GUI.Admin.MainViewAdmin;
import GUI.NormalUser.*;

import Database_connection.DatabaseManager;

import javax.swing.*;
import java.awt.*;

public class UpdateBorrowedDocumentAdmin extends javax.swing.JFrame {

  private javax.swing.JLabel authorLabel2;
  private javax.swing.JButton backButton;
  private javax.swing.JLabel bookTitleLabel;
  private javax.swing.JTextField bookTitleTextField;
  private javax.swing.JButton borrowButton;
  private javax.swing.JButton checkButton;
  private javax.swing.JLabel idUserLabel;
  private javax.swing.JTextField idUserTextField;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel numberOfCopiesAvailableLabel2;

  Document document;
  DatabaseManager dbManager = new DatabaseManager();
  private String idAdmin;

  public UpdateBorrowedDocumentAdmin(String idAdmin) {
    initComponents();
    this.idAdmin = idAdmin;
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
    idUserLabel = new javax.swing.JLabel();
    idUserTextField = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 0, 0));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Borrow Document");

    bookTitleLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    bookTitleLabel.setText("Title");

    bookTitleTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    bookTitleTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bookTitleTextFieldActionPerformed(evt);
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
    numberOfCopiesAvailableLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
      public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        numberOfCopiesAvailableLabel2AncestorAdded(evt);
      }

      public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
      }

      public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
      }
    });

    authorLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    authorLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
      public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        authorLabel2AncestorAdded(evt);
      }

      public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
      }

      public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
      }
    });

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

    idUserLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    idUserLabel.setText("ID User");

    idUserTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    idUserTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        idUserTextFieldActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(authorLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(numberOfCopiesAvailableLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(borrowButton,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(backButton,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 102,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(idUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idUserTextField,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 448,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bookTitleLabel,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 102,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bookTitleTextField,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 448,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                            false)
                        .addComponent(idUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                            false)
                        .addComponent(bookTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookTitleTextField,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(authorLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(numberOfCopiesAvailableLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                    43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                            false)
                        .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40,
                            Short.MAX_VALUE)
                        .addComponent(borrowButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
  }// </editor-fold>

  private void bookTitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    checkButtonActionPerformed(null);
    borrowButtonActionPerformed(null);
  }

  private void numberOfCopiesAvailableLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {
  }

  private void authorLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {
  }

  private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {
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
      numberOfCopiesAvailableLabel2.setText("Copies Available: " + document.getCopiesAvailable());
    } else {
      JOptionPane.showMessageDialog(this, "Cannot find document.",
          "Error", JOptionPane.ERROR_MESSAGE);
    }
  }

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    MainViewAdmin mainViewAdmin = new MainViewAdmin(idAdmin);
    mainViewAdmin.setVisible(true);
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
    NormalUser user = dbManager.findNormalUser(idUserTextField.getText());
    if (user == null) {
      JOptionPane.showMessageDialog(this, "Cannot find user!", "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    // Kiểm tra nếu người dùng đã mượn tài liệu này
    if (user.checkBorrowedDocument(document.getTitle())) {
      JOptionPane.showMessageDialog(this, "User is borrowing this document!", "Notification",
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
      dbManager.addBorrowedDocument(idUserTextField.getText(), bookTitle);

      JOptionPane.showMessageDialog(this, "Borrow successfully!", "Notification",
          JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, "Error updating database!", "Error",
          JOptionPane.ERROR_MESSAGE);
      e.printStackTrace(); // In lỗi ra console để debug
    }
  }

  private void idUserTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    borrowButtonActionPerformed(null);
  }

  public static void main(String args[]) {
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

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new UpdateBorrowedDocumentAdmin("22022132").setVisible(true);
      }
    });
  }

}
