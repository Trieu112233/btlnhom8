package GUI.Admin.User;

import main_class.Admin;

import GUI.Admin.MainViewAdmin;

import Database_connection.DatabaseManager;

import javax.swing.*;

public class AddAdminAdmin extends javax.swing.JFrame {

  private javax.swing.JButton backButton;
  private javax.swing.JLabel idLabel;
  private javax.swing.JTextField idTextField;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel nameLabel;
  private javax.swing.JTextField nameTextField;
  private javax.swing.JLabel passwordLabel;
  private javax.swing.JTextField passwordTextField;
  private javax.swing.JLabel positionLabel;
  private javax.swing.JTextField positionTextField;
  private javax.swing.JButton submitButton;
  private javax.swing.JLabel titleLabel;

  private String idAdmin;

  public AddAdminAdmin(String idAdmin) {
    initComponents();
    this.idAdmin = idAdmin;
    setSize(750, 400);
    setLocationRelativeTo(null);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    titleLabel = new javax.swing.JLabel();
    idLabel = new javax.swing.JLabel();
    idTextField = new javax.swing.JTextField();
    nameLabel = new javax.swing.JLabel();
    nameTextField = new javax.swing.JTextField();
    positionLabel = new javax.swing.JLabel();
    positionTextField = new javax.swing.JTextField();
    passwordLabel = new javax.swing.JLabel();
    passwordTextField = new javax.swing.JTextField();
    submitButton = new javax.swing.JButton();
    backButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    titleLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 24)); // NOI18N
    titleLabel.setForeground(new java.awt.Color(255, 0, 0));
    titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    titleLabel.setText("Tạo Tài Khoản Mới Cho Admin");

    idLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    idLabel.setText("ID");

    idTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    idTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        idTextFieldActionPerformed(evt);
      }
    });

    nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    nameLabel.setText("Tên");

    nameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    nameTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        nameTextFieldActionPerformed(evt);
      }
    });

    positionLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    positionLabel.setText("Vị trí");

    positionTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    positionTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        positionTextFieldActionPerformed(evt);
      }
    });

    passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    passwordLabel.setText("Mật khẩu");

    passwordTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    passwordTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        passwordTextFieldActionPerformed(evt);
      }
    });

    submitButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    submitButton.setText("Submit");
    submitButton.setActionCommand("");
    submitButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        submitButtonActionPerformed(evt);
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
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                            jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                    jPanel1Layout.createSequentialGroup()
                                        .addComponent(idLabel,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 65,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(idTextField))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(
                                            javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameLabel,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 107,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(positionLabel,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                                            javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(
                                            javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(positionTextField)
                                        .addComponent(nameTextField)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(passwordLabel,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 107,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(
                                            javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(submitButton,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 96,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                266, Short.MAX_VALUE)
                                            .addComponent(backButton,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(passwordTextField))))))
                .addGap(122, 122, 122))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(positionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(positionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
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

  private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    submitButtonActionPerformed(null);
  }

  private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    submitButtonActionPerformed(null);
  }

  private void positionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    submitButtonActionPerformed(null);
  }

  private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {
    String id = idTextField.getText().trim();
    String name = nameTextField.getText().trim();
    String position = positionTextField.getText().trim();
    String password = passwordTextField.getText().trim();

    // Kiểm tra nếu có trường nào bị bỏ trống
    if (id.isEmpty() || name.isEmpty() || position.isEmpty() || password.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Thông báo",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    try {
      DatabaseManager db = new DatabaseManager();

      // Kiểm tra quyền dựa trên idAdmin (id của admin đang đăng nhập)
      if (!db.checkPosition(idAdmin)) {
        JOptionPane.showMessageDialog(this, "Bạn không có quyền thêm admin!", "Thông báo",
            JOptionPane.ERROR_MESSAGE);
        return;
      }

      // Kiểm tra xem ID đã tồn tại chưa
      if (db.isAdminIdExists(id)) { // Hàm kiểm tra ID
        JOptionPane.showMessageDialog(this, "ID đã tồn tại. Vui lòng chọn ID khác!", "Thông báo",
            JOptionPane.ERROR_MESSAGE);
        return;
      }

      Admin admin = new Admin();
      admin.setId(id);
      admin.setName(name);
      admin.setPosition(position);
      admin.setPassword(password);

      db.addAdmin(admin);

      JOptionPane.showMessageDialog(this, "Thêm Admin thành công!", "Thông báo",
          JOptionPane.INFORMATION_MESSAGE);

      new MainViewAdmin(idAdmin).setVisible(true);
      this.dispose();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Thông báo",
          JOptionPane.ERROR_MESSAGE);
      e.printStackTrace();
    }
  }

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    new MainViewAdmin(idAdmin).setVisible(true); // Quay lại giao diện chính
    this.dispose(); // Đóng cửa sổ hiện tại
  }

  private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    submitButtonActionPerformed(null);
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
      java.util.logging.Logger.getLogger(AddAdminAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(AddAdminAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(AddAdminAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(AddAdminAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new AddAdminAdmin("22022132").setVisible(true);
      }
    });
  }

}

