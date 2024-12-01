package GUI.Login;

import GUI.NormalUser.MainViewUser;
import GUI.Admin.MainViewAdmin;

import Database_connection.DatabaseManager;

import javax.swing.*;

public class Login extends javax.swing.JFrame {

  private javax.swing.JLabel adminImageLabel;
  private javax.swing.JLabel adminLoginLabel;
  private javax.swing.JPasswordField adminPasswordField;
  private javax.swing.JLabel adminPasswordLabel;
  private javax.swing.JLabel backgroundLabel;
  private javax.swing.JFormattedTextField idAdminFormattedTextField;
  private javax.swing.JLabel idAdminLabel;
  private javax.swing.JFormattedTextField idUserFormattedTextField;
  private javax.swing.JLabel idUserLabel;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JButton signInAdminButton;
  private javax.swing.JButton signInUserButton;
  private javax.swing.JLabel userImageLabel;
  private javax.swing.JLabel userLoginLabel;
  private javax.swing.JPasswordField userPasswordField;
  private javax.swing.JLabel userPasswordLabel;

  public Login() {
    initComponents();
    setSize(1200, 700);
    setLocationRelativeTo(null);
    setResizable(false);
    DatabaseManager dbManager = new DatabaseManager();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel3 = new javax.swing.JPanel();
    adminImageLabel = new javax.swing.JLabel();
    jPanel4 = new javax.swing.JPanel();
    idAdminLabel = new javax.swing.JLabel();
    adminPasswordLabel = new javax.swing.JLabel();
    idAdminFormattedTextField = new javax.swing.JFormattedTextField();
    adminPasswordField = new javax.swing.JPasswordField();
    signInAdminButton = new javax.swing.JButton();
    adminLoginLabel = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jPanel5 = new javax.swing.JPanel();
    idUserLabel = new javax.swing.JLabel();
    userPasswordLabel = new javax.swing.JLabel();
    idUserFormattedTextField = new javax.swing.JFormattedTextField();
    userPasswordField = new javax.swing.JPasswordField();
    signInUserButton = new javax.swing.JButton();
    userLoginLabel = new javax.swing.JLabel();
    userImageLabel = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    backgroundLabel = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setLayout(null);

    jPanel3.setLayout(null);

    adminImageLabel.setIcon(
        new javax.swing.ImageIcon(getClass().getResource("/image/adminImage.jpg"))); // NOI18N
    jPanel3.add(adminImageLabel);
    adminImageLabel.setBounds(120, 120, 200, 190);

    idAdminLabel.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
    idAdminLabel.setText("ID");

    adminPasswordLabel.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
    adminPasswordLabel.setText("Password");

    idAdminFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        idAdminFormattedTextFieldActionPerformed(evt);
      }
    });

    adminPasswordField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        adminPasswordFieldActionPerformed(evt);
      }
    });

    signInAdminButton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
    signInAdminButton.setText("Sign in");
    signInAdminButton.setBorder(
        new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
            java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray,
            java.awt.Color.darkGray));
    signInAdminButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        signInAdminButtonActionPerformed(evt);
      }
    });

    adminLoginLabel.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
    adminLoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    adminLoginLabel.setText("Admin Login");

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(idAdminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(adminPasswordField))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(signInAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60,
                    Short.MAX_VALUE)
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(idAdminFormattedTextField)
                    .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(adminPasswordLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 96,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addComponent(adminLoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(adminLoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(idAdminLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idAdminFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(adminPasswordLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(adminPasswordField,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(131, 225, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(signInAdminButton,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(116, 116, 116))))
    );

    jPanel3.add(jPanel4);
    jPanel4.setBounds(470, 0, 450, 460);
    jPanel4.setBackground(new java.awt.Color(0xFFCB77)); // Đặt màu nền cho jPanel4 thành #FFCB77

    jLabel5.setBackground(new java.awt.Color(0xFFFFFF)); // Đặt màu nền cho jLabel5 thành trắng
    jLabel5.setOpaque(true); // Bật chế độ opaque để màu nền hiển thị
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); // Căn giữa nội dung
    jPanel3.add(jLabel5); // Thêm jLabel5 vào jPanel3
    jLabel5.setBounds(0, 0, 470, 460); // Đặt vị trí và kích thước cho jLabel5

    jTabbedPane1.addTab("Admin", jPanel3);

    jPanel2.setLayout(null);

    idUserLabel.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
    idUserLabel.setText("ID");

    userPasswordLabel.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
    userPasswordLabel.setText("Password");

    idUserFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        idUserFormattedTextFieldActionPerformed(evt);
      }
    });

    userPasswordField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        userPasswordFieldActionPerformed(evt);
      }
    });

    signInUserButton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
    signInUserButton.setText("Sign in");
    signInUserButton.setBorder(
        new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
            java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray,
            java.awt.Color.darkGray));
    signInUserButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        signInUserButtonActionPerformed(evt);
      }
    });

    userLoginLabel.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
    userLoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    userLoginLabel.setText("User Login");

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(
                    jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(idUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(userPasswordField))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(signInUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80,
                    Short.MAX_VALUE)
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(idUserFormattedTextField)
                    .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(
                    jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(userPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addComponent(userLoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(userLoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(idUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idUserFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(
                    jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(userPasswordLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(userPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(131, 225, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(signInUserButton,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(116, 116, 116))))
    );

    jPanel2.add(jPanel5);
    jPanel5.setBounds(0, 0, 470, 460);
    jPanel5.setBackground(new java.awt.Color(0xFFCB77)); // Đặt màu nền cho jPanel4 thành #FFCB77

    userImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    userImageLabel.setIcon(
        new javax.swing.ImageIcon(getClass().getResource("/image/userImage.jpg"))); // NOI18N
    jPanel2.add(userImageLabel);
    userImageLabel.setBounds(620, 120, 180, 190);
    jPanel2.add(jLabel1);
    jLabel1.setBounds(470, 0, 450, 460);
    jLabel1.setBackground(new java.awt.Color(0xFFFFFF)); // Đặt màu nền thành trắng
    jLabel1.setOpaque(true); // Bật opaque để màu nền hiển thị

    jTabbedPane1.addTab("User", jPanel2);

    jPanel1.add(jTabbedPane1);
    jTabbedPane1.setBounds(130, 50, 920, 491);

    backgroundLabel.setIcon(
        new javax.swing.ImageIcon(getClass().getResource("/image/SS_a12ACXgiPCpj.png"))); // NOI18N
    jPanel1.add(backgroundLabel);
    backgroundLabel.setBounds(-10, -10, 1200, 680);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1203, Short.MAX_VALUE)
                .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                .addContainerGap())
    );

    pack();
  }// </editor-fold>

  private void signInAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {
    // Lấy thông tin từ các trường nhập liệu
    String adminId = idAdminFormattedTextField.getText();
    String password = String.valueOf(adminPasswordField.getPassword());

    // Kiểm tra nếu bất kỳ trường nào bị bỏ trống
    if (adminId.isEmpty() || password.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ ID và Password", "Lỗi",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    // Sử dụng DatabaseManager để xác thực
    DatabaseManager dbManager = new DatabaseManager();
    boolean isAuthenticated = dbManager.authenticateAdmin(adminId, password);

    if (isAuthenticated) {
      // Đăng nhập thành công
      JOptionPane.showMessageDialog(this, "Đăng nhập thành công!", "Thông báo",
          JOptionPane.INFORMATION_MESSAGE);
      // Mở MainView và đóng giao diện hiện tại
      new MainViewAdmin(adminId).setVisible(true);
      this.dispose();
    } else {
      // Đăng nhập thất bại
      JOptionPane.showMessageDialog(this, "ID hoặc Password không chính xác", "Lỗi",
          JOptionPane.ERROR_MESSAGE);
    }
  }

  private void signInUserButtonActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    // Lấy thông tin từ các trường nhập liệu
    String userId = idUserFormattedTextField.getText();
    String password = String.valueOf(userPasswordField.getPassword());

    // Kiểm tra nếu bất kỳ trường nào bị bỏ trống
    if (userId.isEmpty() || password.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ ID và Password", "Lỗi",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    // Sử dụng DatabaseManager để xác thực
    DatabaseManager dbManager = new DatabaseManager();
    boolean isAuthenticated = dbManager.authenticateUser(userId, password);

    if (isAuthenticated) {
      // Đăng nhập thành công
      JOptionPane.showMessageDialog(this, "Đăng nhập thành công!", "Thông báo",
          JOptionPane.INFORMATION_MESSAGE);
      // Mở MainView và đóng giao diện hiện tại
      new MainViewUser(userId).setVisible(true);
      this.dispose();
    } else {
      // Đăng nhập thất bại
      JOptionPane.showMessageDialog(this, "ID hoặc Password không chính xác", "Lỗi",
          JOptionPane.ERROR_MESSAGE);
    }
  }

  private void adminPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    signInAdminButtonActionPerformed(null);

  }

  private void idAdminFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    signInAdminButtonActionPerformed(null);
  }

  private void idUserFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    signInUserButtonActionPerformed(null);
  }

  private void userPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    signInUserButtonActionPerformed(null);
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Login().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify

  // End of variables declaration
}

