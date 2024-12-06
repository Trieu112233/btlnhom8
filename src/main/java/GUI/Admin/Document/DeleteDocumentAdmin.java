package GUI.Admin.Document;

import java.util.ArrayList;
import main_class.Document;

import GUI.Admin.MainViewAdmin;

import Database_connection.DatabaseManager;

import javax.swing.*;
import java.awt.*;

public class DeleteDocumentAdmin extends javax.swing.JFrame {

  private javax.swing.JButton backButton;
  private javax.swing.JButton checkButton;
  private javax.swing.JLabel copiesAvailableLabel;
  private javax.swing.JLabel deleteCopiesLabel;
  private javax.swing.JTextField deleteCopiesTextField;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel nameAuthorLabel;
  private javax.swing.JLabel nameDocumentLabel;
  private javax.swing.JTextField nameDocumentTextField;
  private javax.swing.JButton submitButton;
  private javax.swing.JLabel titleLabel;
  private javax.swing.JPopupMenu popupMenu;

  private String idAdmin;
  private DatabaseManager dbManager;

  public DeleteDocumentAdmin(String idAdmin) {
    initComponents();
    this.idAdmin = idAdmin;
    this.dbManager = new DatabaseManager();
    setLocationRelativeTo(null);
    jPanel1.setBackground(Color.WHITE);
  }

  @SuppressWarnings("unchecked")
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    titleLabel = new javax.swing.JLabel();
    nameDocumentLabel = new javax.swing.JLabel();
    nameDocumentTextField = new javax.swing.JTextField();
    checkButton = new javax.swing.JButton();
    copiesAvailableLabel = new javax.swing.JLabel();
    nameAuthorLabel = new javax.swing.JLabel();
    backButton = new javax.swing.JButton();
    submitButton = new javax.swing.JButton();
    deleteCopiesLabel = new javax.swing.JLabel();
    deleteCopiesTextField = new javax.swing.JTextField();
    popupMenu = new javax.swing.JPopupMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    titleLabel.setBackground(new java.awt.Color(255, 255, 255));
    titleLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 24)); // NOI18N
    titleLabel.setForeground(new java.awt.Color(255, 0, 0));
    titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    titleLabel.setText("Delete Document");

    nameDocumentLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    nameDocumentLabel.setText("Title");

    nameDocumentTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    nameDocumentTextField.addKeyListener(new java.awt.event.KeyAdapter() {
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

    copiesAvailableLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    nameAuthorLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    backButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    backButton.setText("Back");
    backButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backButtonActionPerformed(evt);
      }
    });

    submitButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    submitButton.setText("Submit");
    submitButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        submitButtonActionPerformed(evt);
      }
    });

    deleteCopiesLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    deleteCopiesLabel.setText("Quantity");

    deleteCopiesTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    deleteCopiesTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        deleteCopiesTextFieldActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                            jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameDocumentLabel,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteCopiesLabel,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameDocumentTextField,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                                    .addComponent(deleteCopiesTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                            jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                            jPanel1Layout.createSequentialGroup()
                                .addComponent(nameAuthorLabel,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 538,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(copiesAvailableLabel,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 319,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                            false)
                        .addGroup(jPanel1Layout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameDocumentLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameDocumentTextField,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(checkButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteCopiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteCopiesTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                            43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76,
                    Short.MAX_VALUE)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameAuthorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(copiesAvailableLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                            44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
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

  private void nameDocumentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    checkButtonActionPerformed(null);
  }

  private void deleteCopiesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    checkButtonActionPerformed(null);
    submitButtonActionPerformed(null);
  }

  private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {
    String nameDocument = nameDocumentTextField.getText().trim();

    if (nameDocument.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Please enter Document Name!", "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    // Giả sử bạn có một lớp DatabaseManager để thực hiện truy vấn
    try {
      DatabaseManager dbManager = new DatabaseManager();
      Document document = dbManager.findDocument(
          nameDocument); // Hàm này trả về thông tin người dùng

      if (nameDocument != null) {
        nameAuthorLabel.setText("Author: " + document.getAuthor());
        copiesAvailableLabel.setText("Copies Available: " + document.getCopiesAvailable());
      } else {
        JOptionPane.showMessageDialog(this, "Cannot find document: " + nameDocument, "Notification",
            JOptionPane.INFORMATION_MESSAGE);
      }
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this, "Error Checking Document !", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }

  private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {
    String nameDocument = nameDocumentTextField.getText().trim();
    String cop = deleteCopiesTextField.getText().trim();

    if (nameDocument.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Please enter document name!", "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    try {
      DatabaseManager dbManager = new DatabaseManager();
      Document document = dbManager.findDocument(nameDocument);

      if (document == null) {
        JOptionPane.showMessageDialog(this, "Cannot find document: " + nameDocument, "Error",
            JOptionPane.ERROR_MESSAGE);
        return;
      }

      int copiesToDelete = Integer.valueOf(cop);

      // Kiểm tra nếu số lượng bản sao muốn xóa lớn hơn số bản sao hiện có
      if (copiesToDelete > document.getCopiesAvailable() || copiesToDelete < 0) {
        JOptionPane.showMessageDialog(this, "invalid Number of Copies!", "Error",
            JOptionPane.ERROR_MESSAGE);
        return;
      }

      if (copiesToDelete == document.getCopiesAvailable() && !dbManager.checkDocumentBeingBorrowed(
          document.getTitle())) {
        int confirm = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to delete this book from the database?", "Notification",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE);
        if (confirm != JOptionPane.YES_OPTION) {
          return;
        }
        dbManager.removeDocument(document.getTitle());
        JOptionPane.showMessageDialog(this, "Deleted successfully from database!", "Notification",
            JOptionPane.INFORMATION_MESSAGE);
        nameAuthorLabel.setText("");
        copiesAvailableLabel.setText("");
        new DeleteDocumentAdmin(idAdmin).setVisible(true);
        this.dispose();
        return;
      }

      // Nếu chỉ giảm số lượng bản sao
      int remainingCopies = document.getCopiesAvailable() - copiesToDelete;
      int confirm = JOptionPane.showConfirmDialog(this,
          "Are you sure you want to delete this document?", "Notification",
          JOptionPane.YES_NO_OPTION,
          JOptionPane.WARNING_MESSAGE);
      if (confirm != JOptionPane.YES_OPTION) {
        new DeleteDocumentAdmin(idAdmin).setVisible(true);
        this.dispose();
        return;
      }

      // Cập nhật số lượng bản sao trong cơ sở dữ liệu
      dbManager.updateDocument(nameDocument, remainingCopies);
      JOptionPane.showMessageDialog(this, "Copies Available Updated Successfully!", "Notification",
          JOptionPane.INFORMATION_MESSAGE);
      nameAuthorLabel.setText("");
      copiesAvailableLabel.setText("");
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this, "Error Deleting Document!", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
    new DeleteDocumentAdmin(idAdmin).setVisible(true);
    this.dispose();
  }

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    dispose();
    new MainViewAdmin(idAdmin).setVisible(true);
  }

  private Timer typingTimer;
  private boolean isUpdating = false;

  private void updateSuggestions() {
    if (isUpdating) {
      return; // Không thực hiện nếu đang trong trạng thái cập nhật
    }

    String query = nameDocumentTextField.getText().trim();

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
                    nameDocumentTextField.setText(title); // Điền tên sách vào text field
                    popupMenu.setVisible(false); // Ẩn popup

                    // Cập nhật giao diện với thông tin tài liệu

                    isUpdating = false; // Hoàn tất cập nhật
                  });

                  popupMenu.add(item);
                }

                // Hiển thị popup bên dưới JTextField
                popupMenu.show(nameDocumentTextField, 0, nameDocumentTextField.getHeight());
                nameDocumentTextField.requestFocusInWindow(); // Đảm bảo focus vẫn ở JTextField
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
      java.util.logging.Logger.getLogger(DeleteDocumentAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(DeleteDocumentAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(DeleteDocumentAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(DeleteDocumentAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new DeleteDocumentAdmin("22022132").setVisible(true);
      }
    });
  }

}

