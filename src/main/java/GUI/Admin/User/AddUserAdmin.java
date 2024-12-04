package GUI.Admin.User;

import main_class.NormalUser;

import GUI.Admin.MainViewAdmin;

import Database_connection.DatabaseManager;

import javax.swing.*;
import java.awt.*;

public class AddUserAdmin extends javax.swing.JFrame {

  private javax.swing.JButton backButton;
  private javax.swing.JLabel classLabel;
  private javax.swing.JTextField classTextField;
  private javax.swing.JLabel courseLabel;
  private javax.swing.JTextField courseTextField;
  private javax.swing.JLabel idLabel;
  private javax.swing.JTextField idTextField;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel nameLabel;
  private javax.swing.JTextField nameTextField;
  private javax.swing.JLabel passwordLabel;
  private javax.swing.JTextField passwordTextField;
  private javax.swing.JButton submitButton;
  private javax.swing.JLabel titleLabel;

  private String idAdmin;

  public AddUserAdmin(String idAdmin) {
    initComponents();
    this.idAdmin = idAdmin;
    setSize(750, 500);
    setLocationRelativeTo(null);
    jPanel1.setBackground(Color.WHITE);
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
    classLabel = new javax.swing.JLabel();
    classTextField = new javax.swing.JTextField();
    courseLabel = new javax.swing.JLabel();
    courseTextField = new javax.swing.JTextField();
    passwordLabel = new javax.swing.JLabel();
    passwordTextField = new javax.swing.JTextField();
    submitButton = new javax.swing.JButton();
    backButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    titleLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 24)); // NOI18N
    titleLabel.setForeground(new java.awt.Color(255, 0, 0));
    titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    titleLabel.setText("Add New Normal User");

    idLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    idLabel.setText("ID");

    idTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    idTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        idTextFieldActionPerformed(evt);
      }
    });

    nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    nameLabel.setText("Name");

    nameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    nameTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        nameTextFieldActionPerformed(evt);
      }
    });

    classLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    classLabel.setText("Class");

    classTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    classTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        classTextFieldActionPerformed(evt);
      }
    });

    courseLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    courseLabel.setText("Course");

    courseTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    courseTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        courseTextFieldActionPerformed(evt);
      }
    });

    passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    passwordLabel.setText("Password");

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
                                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 570,
                                    Short.MAX_VALUE))
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
                                        .addComponent(classLabel,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(courseLabel,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 107,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordLabel,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 107,
                                            javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                            .addComponent(backButton,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(classTextField)
                                        .addComponent(nameTextField)
                                        .addComponent(courseTextField,
                                            javax.swing.GroupLayout.Alignment.TRAILING)
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
                        .addComponent(classLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(classTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(courseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(courseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>

  private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    submitButtonActionPerformed(null);
  }

  private void classTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    submitButtonActionPerformed(null);
  }

  private void courseTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    submitButtonActionPerformed(null);
  }

  private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    submitButtonActionPerformed(null);
  }

  private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    submitButtonActionPerformed(null);
  }

  private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {
    String id = idTextField.getText().trim();
    String name = nameTextField.getText().trim();
    String className = classTextField.getText().trim();
    String courseName = courseTextField.getText().trim();
    String password = passwordTextField.getText().trim();

    // Kiểm tra nếu có trường nào bị bỏ trống
    if (id.isEmpty() || name.isEmpty() || className.isEmpty() || courseName.isEmpty()
        || password.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Please enter complete information!", "Notification",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    try {
      // Tạo đối tượng người dùng
      NormalUser user = new NormalUser();
      user.setId(id);
      user.setName(name);
      user.setClassName(className);
      user.setCourseName(courseName);
      user.setPassword(password);

      DatabaseManager dbManager = new DatabaseManager();
      dbManager.addNormalUser(user);

      JOptionPane.showMessageDialog(this, "Normal User Added Successfully!", "Notification",
          JOptionPane.INFORMATION_MESSAGE);
      new MainViewAdmin(idAdmin).setVisible(true); // Quay lại giao diện chính
      this.dispose();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Notification",
          JOptionPane.ERROR_MESSAGE);
      e.printStackTrace();
    }
  }

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    new MainViewAdmin(idAdmin).setVisible(true); // Quay lại giao diện chính
    this.dispose(); // Đóng cửa sổ hiện tại
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
      java.util.logging.Logger.getLogger(AddUserAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(AddUserAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(AddUserAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(AddUserAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new AddUserAdmin("22022132").setVisible(true);
      }
    });
  }

}

