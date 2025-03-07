package GUI.Admin.User;

import main_class.NormalUser;

import GUI.Admin.MainViewAdmin;

import Database_connection.DatabaseManager;

import javax.swing.*;
import java.sql.SQLException;

public class DeleteUserAdmin extends javax.swing.JFrame {

  private javax.swing.JButton backButton;
  private javax.swing.JButton checkButton;
  private javax.swing.JLabel classLabel;
  private javax.swing.JLabel courseLabel;
  private javax.swing.JButton deleteButton;
  private javax.swing.JLabel idUserLabel;
  private javax.swing.JTextField idUserTextField;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel nameUserLabel;
  private javax.swing.JLabel numberOfBorrowedDocumentLabel;
  private javax.swing.JLabel titleLabel;

  private String idAdmin;

  public DeleteUserAdmin(String idAdmin) {
    initComponents();
    this.idAdmin = idAdmin;
    setSize(750, 400);
    setLocationRelativeTo(null);
  }

  @SuppressWarnings("unchecked")
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    titleLabel = new javax.swing.JLabel();
    idUserLabel = new javax.swing.JLabel();
    idUserTextField = new javax.swing.JTextField();
    checkButton = new javax.swing.JButton();
    classLabel = new javax.swing.JLabel();
    nameUserLabel = new javax.swing.JLabel();
    courseLabel = new javax.swing.JLabel();
    deleteButton = new javax.swing.JButton();
    backButton = new javax.swing.JButton();
    numberOfBorrowedDocumentLabel = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    titleLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 24)); // NOI18N
    titleLabel.setForeground(new java.awt.Color(255, 0, 51));
    titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    titleLabel.setText("Delete User");

    idUserLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    idUserLabel.setText("ID");

    idUserTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    idUserTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        idUserTextFieldActionPerformed(evt);
      }
    });

    checkButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    checkButton.setText("Check");
    checkButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        checkButtonActionPerformed(evt);
      }
    });

    classLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    nameUserLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    courseLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    deleteButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    deleteButton.setText("Delete");
    deleteButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        deleteButtonActionPerformed(evt);
      }
    });

    backButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    backButton.setText("Back");
    backButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backButtonActionPerformed(evt);
      }
    });

    numberOfBorrowedDocumentLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                            false)
                        .addComponent(nameUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(courseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 482,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(classLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                            jPanel1Layout.createSequentialGroup()
                                .addComponent(numberOfBorrowedDocumentLabel,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(idUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(idUserTextField)
                            .addGap(18, 18, 18)
                            .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                            jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(
                                    javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
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
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idUserTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 50,
                            Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(classLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(courseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(numberOfBorrowedDocumentLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 26, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    32, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

  private void idUserTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    checkButtonActionPerformed(null);
  }

  private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {
    String idUser = idUserTextField.getText().trim();

    if (idUser.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Please inter ID!", "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    // Giả sử bạn có một lớp DatabaseManager để thực hiện truy vấn
    try {
      DatabaseManager dbManager = new DatabaseManager();
      NormalUser user = dbManager.findNormalUser(idUser); // Hàm này trả về thông tin người dùng

      if (user != null) {
        nameUserLabel.setText("Name: " + user.getName());
        classLabel.setText("Class: " + user.getClassName());
        courseLabel.setText("Course: " + user.getCourseName());
        numberOfBorrowedDocumentLabel.setText(
            "Number of borrowed document: " + user.getNumberOfBorrowedDocument());
      } else {
        JOptionPane.showMessageDialog(this, "Cannot find user with ID: " + idUser,
            "Notification", JOptionPane.INFORMATION_MESSAGE);
      }
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this, "Error checking user!", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    this.dispose(); // Đóng cửa sổ hiện tại
    new MainViewAdmin(idAdmin).setVisible(true); // Nếu cần quay lại màn hình chính
  }

  private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
    String idUser = idUserTextField.getText().trim();

    if (idUser.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Please enter ID!", "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    try {
      DatabaseManager dbManager = new DatabaseManager();
      NormalUser user = dbManager.findNormalUser(idUser); // Lấy thông tin người dùng

      if (user == null) {
        JOptionPane.showMessageDialog(this, "Cannot find user with ID: " + idUser, "Error",
            JOptionPane.ERROR_MESSAGE);
        return;
      }

      // Kiểm tra xem người dùng có tài liệu mượn chưa trả không
      if (user.getNumberOfBorrowedDocument() > 0) {
        JOptionPane.showMessageDialog(this, "User is borrowing some document. Cannot delete!",
            "Notification", JOptionPane.ERROR_MESSAGE);
        return;
      }

      // Xác nhận xóa người dùng
      int confirm = JOptionPane.showConfirmDialog(this,
          "Are you sure want to delete this user?", "Notification", JOptionPane.YES_NO_OPTION,
          JOptionPane.WARNING_MESSAGE);
      if (confirm != JOptionPane.YES_OPTION) {
        return;
      }

      // Xóa người dùng
      boolean isDeleted = dbManager.checkDeletedUserById(idUser);
      if (isDeleted) {
        JOptionPane.showMessageDialog(this,
            "User with ID: " + idUser + " deleted successfully!", "Notification",
            JOptionPane.INFORMATION_MESSAGE);

        // Xóa thông tin người dùng trên giao diện
        idUserTextField.setText("");
        nameUserLabel.setText("");
        classLabel.setText("");
        courseLabel.setText("");
        numberOfBorrowedDocumentLabel.setText("");
      } else {
        JOptionPane.showMessageDialog(this, "Cannot delete user!. Please check again!", "Error",
            JOptionPane.ERROR_MESSAGE);
      }
    } catch (SQLException e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this, "Error deleting user!", "Error",
          JOptionPane.ERROR_MESSAGE);
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
      java.util.logging.Logger.getLogger(DeleteUserAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(DeleteUserAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(DeleteUserAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(DeleteUserAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new DeleteUserAdmin("22022132").setVisible(true);
      }
    });
  }

}
