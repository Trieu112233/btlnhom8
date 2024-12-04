package GUI.Admin.User;

import main_class.Admin;

import GUI.Admin.MainViewAdmin;

import Database_connection.DatabaseManager;

import javax.swing.*;

public class DeleteAdminAdmin extends javax.swing.JFrame {

  private javax.swing.JLabel adminLabel;
  private javax.swing.JButton backButton;
  private javax.swing.JButton checkButton;
  private javax.swing.JButton deleteButton;
  private javax.swing.JLabel idAdminLabel;
  private javax.swing.JTextField idAdminTextField;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel nameAdminLabel;
  private javax.swing.JLabel positionLabel;

  private String idAdmin;

  public DeleteAdminAdmin(String idAdmin) {
    initComponents();
    this.idAdmin = idAdmin;
    setSize(750, 400);
    setLocationRelativeTo(null);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    adminLabel = new javax.swing.JLabel();
    idAdminLabel = new javax.swing.JLabel();
    idAdminTextField = new javax.swing.JTextField();
    checkButton = new javax.swing.JButton();
    positionLabel = new javax.swing.JLabel();
    nameAdminLabel = new javax.swing.JLabel();
    deleteButton = new javax.swing.JButton();
    backButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    adminLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 24)); // NOI18N
    adminLabel.setForeground(new java.awt.Color(255, 0, 51));
    adminLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    adminLabel.setText("Delete Administrator");

    idAdminLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    idAdminLabel.setText("ID");

    idAdminTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    idAdminTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        idAdminTextFieldActionPerformed(evt);
      }
    });

    checkButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    checkButton.setText("Check");
    checkButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        checkButtonActionPerformed(evt);
      }
    });

    positionLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    nameAdminLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(nameAdminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 482,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(positionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 210,
                    Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(adminLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(idAdminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(idAdminTextField)
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
                .addComponent(adminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idAdminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idAdminTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 50,
                            Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameAdminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(positionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56,
                    Short.MAX_VALUE)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
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
  }// </editor-fold>

  private void idAdminTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    checkButtonActionPerformed(null);
  }

  private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {
    String idAdmin = idAdminTextField.getText().trim();

    if (idAdmin.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Please enter ID!", "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    // Giả sử bạn có một lớp DatabaseManager để thực hiện truy vấn
    try {
      DatabaseManager dbManager = new DatabaseManager();
      Admin admin = dbManager.findAdmin(idAdmin); // Hàm này trả về thông tin người dùng

      if (admin != null) {
        nameAdminLabel.setText("Name: " + admin.getName());
        positionLabel.setText("Position: " + admin.getPosition());
      } else {
        JOptionPane.showMessageDialog(this, "Cannot find administrator with ID: " + idAdmin,
            "Notification", JOptionPane.INFORMATION_MESSAGE);
      }
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this, "Error checking Administrator!", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }

  private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
    String idAdminTemp = idAdminTextField.getText().trim();

    if (idAdminTemp.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Please enter administrator ID", "Error",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    try {
      DatabaseManager dbManager = new DatabaseManager();
      Admin admin = dbManager.findAdmin(idAdminTemp); // Lấy thông tin người dùng

      if (admin == null) {
        JOptionPane.showMessageDialog(this, "Cannot find administrator with ID: " + idAdminTemp,
            "Error",
            JOptionPane.ERROR_MESSAGE);
        return;
      }

      if (!dbManager.checkPosition(idAdmin)) {
        JOptionPane.showMessageDialog(this, "Insufficient Authority!", "Lỗi",
            JOptionPane.ERROR_MESSAGE);
        return;
      }

      // Xác nhận xóa người dùng
      int confirm = JOptionPane.showConfirmDialog(this,
          "Are you sure want to delete this administrator?", "Notification",
          JOptionPane.YES_NO_OPTION,
          JOptionPane.WARNING_MESSAGE);
      if (confirm != JOptionPane.YES_OPTION) {
        return;
      }

      // Thực hiện xóa admin
      dbManager.removeAdmin(idAdminTemp);
      JOptionPane.showMessageDialog(this, "Administrator Deleted Successfully!", "Notification",
          JOptionPane.INFORMATION_MESSAGE);
      idAdminTextField.setText("");
      nameAdminLabel.setText("");
      positionLabel.setText("");
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this, "Error deleting administrator!", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }


  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    this.dispose(); // Đóng cửa sổ hiện tại
    new MainViewAdmin(idAdmin).setVisible(true); // Nếu cần quay lại màn hình chính
  }

  public static void main(String args[]) {
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
      java.util.logging.Logger.getLogger(DeleteAdminAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(DeleteAdminAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(DeleteAdminAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(DeleteAdminAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new DeleteAdminAdmin("22022132").setVisible(true);
      }
    });
  }

}

