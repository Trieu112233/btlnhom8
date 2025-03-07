package GUI.NormalUser;

import GUI.BackgroundPanel;
import main_class.NormalUser;

import GUI.Login.Login;

import Database_connection.DatabaseManager;

import java.awt.*;

public class MainViewUser extends javax.swing.JFrame {

  private javax.swing.JButton backButton;
  private javax.swing.JPanel backgroundPanel;
  private javax.swing.JButton borrowDocumentButton;
  private javax.swing.JButton findDocumentButton;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JButton returnDocumentButton;
  private javax.swing.JLabel titleUserLabel;
  private javax.swing.JTextArea userTextArea;

  private String idUser;

  public MainViewUser(String idUser) {
    this.idUser = idUser;
    initComponents();
    setSize(850, 550);
    setLocationRelativeTo(null);
    backgroundPanel.setBackground(Color.WHITE); // chinh mau background
  }

  @SuppressWarnings("unchecked")
  private void initComponents() {

    backgroundPanel = new BackgroundPanel("/image/backgroundUser2.jfif");
    titleUserLabel = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    userTextArea = new javax.swing.JTextArea();
    findDocumentButton = new javax.swing.JButton();
    borrowDocumentButton = new javax.swing.JButton();
    returnDocumentButton = new javax.swing.JButton();
    backButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    titleUserLabel.setFont(new java.awt.Font("Sitka Banner", 3, 24)); // NOI18N
    titleUserLabel.setForeground(new java.awt.Color(0, 32, 63));
    titleUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    titleUserLabel.setText("USER TASKS");

    userTextArea.setEditable(false);
    userTextArea.setColumns(20);
    userTextArea.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
    userTextArea.setRows(1);
    userTextArea.setTabSize(6);
    userTextArea.setCaretColor(Color.white);
    userTextArea.addAncestorListener(new javax.swing.event.AncestorListener() {
      public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        userTextAreaAncestorAdded(evt);
      }

      public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
      }

      public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
      }
    });
    jScrollPane1.setViewportView(userTextArea);

    findDocumentButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    findDocumentButton.setText("Search Document");
    findDocumentButton.setBackground(new Color(0, 32, 63));
    findDocumentButton.setForeground(Color.WHITE);
    findDocumentButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        findDocumentButtonActionPerformed(evt);
      }
    });

    borrowDocumentButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    borrowDocumentButton.setText("Borrow Document");
    borrowDocumentButton.setBackground(new Color(0, 32, 63));
    borrowDocumentButton.setForeground(Color.WHITE);
    borrowDocumentButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        borrowDocumentButtonActionPerformed(evt);
      }
    });

    returnDocumentButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    returnDocumentButton.setText("Return Document");
    returnDocumentButton.setBackground(new Color(0, 32, 63));
    returnDocumentButton.setForeground(Color.WHITE);
    returnDocumentButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        returnDocumentButtonActionPerformed(evt);
      }
    });

    backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    backButton.setText("Sign Out");
    backButton.setBackground(Color.red);
    backButton.setForeground(Color.WHITE);
    backButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
    backgroundPanel.setLayout(backgroundPanelLayout);
    backgroundPanelLayout.setHorizontalGroup(
        backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307,
                    Short.MAX_VALUE)
                .addGap(100, 100, 100)
                .addGroup(backgroundPanelLayout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(findDocumentButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrowDocumentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 157,
                        Short.MAX_VALUE)
                    .addComponent(returnDocumentButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(150, 150, 150))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                backgroundPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(backgroundPanelLayout.createParallelGroup(
                            javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(titleUserLabel, javax.swing.GroupLayout.Alignment.LEADING,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99,
                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(30, 30, 30))
    );
    backgroundPanelLayout.setVerticalGroup(
        backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(titleUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(backgroundPanelLayout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(findDocumentButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                            45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(borrowDocumentButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                            45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(returnDocumentButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                            45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34,
                            Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }

  private void userTextAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {
    // Khởi tạo đối tượng DatabaseManager
    DatabaseManager dbManager = new DatabaseManager();

    // Tìm thông tin người dùng dựa trên idUser
    NormalUser user = dbManager.findNormalUser(idUser);

    // Kiểm tra nếu tìm thấy người dùng
    if (user != null) {
      // Hiển thị thông tin người dùng lên userTextArea
      StringBuilder userInfo = new StringBuilder();
      userInfo.append("Student ID : ").append(user.getId()).append("\n\n")
          .append("Name        : ").append(user.getName()).append("\n\n")
          .append("Class         : ").append(user.getClassName()).append("\n\n")
          .append("Course      : ").append(user.getCourseName()).append("\n\n")
          .append("Borrowed Documents: ").append(user.getNumberOfBorrowedDocument());

      userTextArea.setText(userInfo.toString());
    } else {
      userTextArea.setText("User information not found!");
    }
  }

  private void findDocumentButtonActionPerformed(java.awt.event.ActionEvent evt) {
    // Mở giao diện tìm kiếm tài liệu
    new FindDocumentUser(idUser).setVisible(true);
    this.dispose(); // Đóng cửa sổ hiện tại nếu cần
  }

  private void borrowDocumentButtonActionPerformed(java.awt.event.ActionEvent evt) {
    new UpdateBorrowedDocumentUser(idUser).setVisible(true);
    this.dispose();
  }

  private void returnDocumentButtonActionPerformed(java.awt.event.ActionEvent evt) {
    new UpdateReturnedDocumentUser(idUser).setVisible(true);
    this.dispose();
  }

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    new Login().setVisible(true);
    this.dispose();
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
      java.util.logging.Logger.getLogger(MainViewUser.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainViewUser.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainViewUser.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainViewUser.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MainViewUser("24022294").setVisible(true);
      }
    });
  }

}

