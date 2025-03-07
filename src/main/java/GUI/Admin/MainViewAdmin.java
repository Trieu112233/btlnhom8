package GUI.Admin;

import GUI.Admin.Document.*;
import GUI.Admin.User.*;
import GUI.BackgroundPanel;
import GUI.Login.Login;
import Database_connection.DatabaseManager;
import main_class.Admin;

import java.awt.*;

public class MainViewAdmin extends javax.swing.JFrame {

  private javax.swing.JButton addAdminButton;
  private javax.swing.JButton addDocumentButton;
  private javax.swing.JButton addUserButton;
  private javax.swing.JTextArea adminTextArea;
  private javax.swing.JButton backButton;
  private javax.swing.JPanel backgroundPanel;
  private javax.swing.JButton borrowDocumentButton;
  private javax.swing.JButton deleteAdminButton;
  private javax.swing.JButton deleteDocumentButton;
  private javax.swing.JButton deleteUserButton;
  private javax.swing.JButton findDocumentButton;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JButton returnDocumentButton;
  private javax.swing.JLabel titleAdminLabel;

  String idAdmin;

  public MainViewAdmin(String idAdmin) {
    this.idAdmin = idAdmin;
    initComponents();
    setSize(1050, 550);
    setLocationRelativeTo(null);
    backgroundPanel.setBackground(Color.WHITE);
  }

  @SuppressWarnings("unchecked")
  private void initComponents() {

    backgroundPanel = new BackgroundPanel("/image/backgroundAdmin.png");

    titleAdminLabel = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    adminTextArea = new javax.swing.JTextArea();
    findDocumentButton = new javax.swing.JButton();
    borrowDocumentButton = new javax.swing.JButton();
    returnDocumentButton = new javax.swing.JButton();
    backButton = new javax.swing.JButton();
    addUserButton = new javax.swing.JButton();
    addAdminButton = new javax.swing.JButton();
    addDocumentButton = new javax.swing.JButton();
    deleteUserButton = new javax.swing.JButton();
    deleteAdminButton = new javax.swing.JButton();
    deleteDocumentButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    titleAdminLabel.setFont(new java.awt.Font("Sitka Banner", 3, 24)); // NOI18N
    titleAdminLabel.setForeground(new java.awt.Color(13, 112, 106));
    titleAdminLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    titleAdminLabel.setText("ADMINISTRATOR TASKS");

    adminTextArea.setEditable(false);
    adminTextArea.setColumns(20);
    adminTextArea.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
    adminTextArea.setRows(1);
    adminTextArea.setTabSize(6);
    adminTextArea.setCaretColor(Color.white);
    adminTextArea.addAncestorListener(new javax.swing.event.AncestorListener() {
      public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        adminTextAreaAncestorAdded(evt);
      }

      public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
      }

      public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
      }
    });
    jScrollPane1.setViewportView(adminTextArea);

    findDocumentButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    findDocumentButton.setText("Search Document");
    findDocumentButton.setBackground(new java.awt.Color(34, 139, 34)); // Đặt màu nền của nút
    findDocumentButton.setForeground(java.awt.Color.WHITE); // Đặt màu chữ của nút thành trắng
    findDocumentButton.setBorderPainted(false); // Tắt viền nếu muốn nút trông mượt mà hơn
    findDocumentButton.setFocusPainted(false); // Tắt hiệu ứng viền khi nút được chọn
    findDocumentButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        findDocumentButtonActionPerformed(evt);
      }
    });

    addDocumentButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    addDocumentButton.setText("Add Document");
    addDocumentButton.setBackground(new java.awt.Color(34, 139, 34)); // Đặt màu nền của nút
    addDocumentButton.setForeground(java.awt.Color.WHITE); // Đặt màu chữ của nút thành trắng
    addDocumentButton.setBorderPainted(false); // Tắt viền nếu muốn nút trông mượt mà hơn
    addDocumentButton.setFocusPainted(false); // Tắt hiệu ứng viền khi nút được chọn
    addDocumentButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        addDocumentButtonActionPerformed(evt);
      }
    });

    borrowDocumentButton.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD,
        12)); // Đặt font chữ với kiểu in đậm và kích thước 12
    borrowDocumentButton.setText("Borrow Document"); // Đặt văn bản cho nút
    borrowDocumentButton.setBackground(new java.awt.Color(34, 139, 34)); // Đặt màu nền của nút
    borrowDocumentButton.setForeground(java.awt.Color.WHITE); // Đặt màu chữ của nút thành trắng
    borrowDocumentButton.setBorderPainted(false); // Tắt viền nếu muốn nút trông mượt mà hơn
    borrowDocumentButton.setFocusPainted(false); // Tắt hiệu ứng viền khi nút được chọn
    borrowDocumentButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        borrowDocumentButtonActionPerformed(evt);
      }
    });

    returnDocumentButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    returnDocumentButton.setText("Return Document");
    returnDocumentButton.setBackground(new java.awt.Color(34, 139, 34)); // Đặt màu nền của nút
    returnDocumentButton.setForeground(java.awt.Color.WHITE); // Đặt màu chữ của nút thành trắng
    returnDocumentButton.setBorderPainted(false); // Tắt viền nếu muốn nút trông mượt mà hơn
    returnDocumentButton.setFocusPainted(false); // Tắt hiệu ứng viền khi nút được chọn
    returnDocumentButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        returnDocumentButtonActionPerformed(evt);
      }
    });

    backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    backButton.setText("Sign Out");
    backButton.setBackground(Color.RED);
    backButton.setForeground(Color.WHITE);
    backButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backButtonActionPerformed(evt);
      }
    });

    addUserButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    addUserButton.setText("Add User");
    addUserButton.setBackground(new java.awt.Color(30, 58, 95)); // Đặt màu nền của nút
    addUserButton.setForeground(Color.WHITE); // Đặt màu chữ của nút thành trắng
    addUserButton.setBorderPainted(false); // Tắt viền nếu muốn nút trông mượt mà hơn
    addUserButton.setFocusPainted(false); // Tắt hiệu ứng viền khi nút được chọn
    addUserButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        addUserButtonActionPerformed(evt);
      }
    });

    addAdminButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    addAdminButton.setText("Add Admin");
    addAdminButton.setBackground(new java.awt.Color(30, 58, 95)); // Đặt màu nền của nút
    addAdminButton.setForeground(Color.WHITE); // Đặt màu chữ của nút thành trắng
    addAdminButton.setBorderPainted(false); // Tắt viền nếu muốn nút trông mượt mà hơn
    addAdminButton.setFocusPainted(false); // Tắt hiệu ứng viền khi nút được chọn
    addAdminButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        addAdminButtonActionPerformed(evt);
      }
    });

    deleteUserButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    deleteUserButton.setText("Delete User");
    deleteUserButton.setBackground(new java.awt.Color(169, 169, 169)); // Đặt màu nền của nút
    deleteUserButton.setForeground(Color.BLACK); // Đặt màu chữ của nút thành trắng
    deleteUserButton.setBorderPainted(false); // Tắt viền nếu muốn nút trông mượt mà hơn
    deleteUserButton.setFocusPainted(false); // Tắt hiệu ứng viền khi nút được chọn
    deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        deleteUserButtonActionPerformed(evt);
      }
    });

    deleteAdminButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    deleteAdminButton.setText("Delete Admin");
    deleteAdminButton.setBackground(new java.awt.Color(169, 169, 169)); // Đặt màu nền của nút
    deleteAdminButton.setForeground(Color.BLACK); // Đặt màu chữ của nút thành trắng
    deleteAdminButton.setBorderPainted(false); // Tắt viền nếu muốn nút trông mượt mà hơn
    deleteAdminButton.setFocusPainted(false); // Tắt hiệu ứng viền khi nút được chọn
    deleteAdminButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        deleteAdminButtonActionPerformed(evt);
      }
    });

    deleteDocumentButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    deleteDocumentButton.setText("Delete Document");
    deleteDocumentButton.setBackground(new java.awt.Color(169, 169, 169)); // Đặt màu nền của nút
    deleteDocumentButton.setForeground(Color.BLACK); // Đặt màu chữ của nút thành trắng
    deleteDocumentButton.setBorderPainted(false); // Tắt viền nếu muốn nút trông mượt mà hơn
    deleteDocumentButton.setFocusPainted(false); // Tắt hiệu ứng viền khi nút được chọn
    deleteDocumentButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        deleteDocumentButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
    backgroundPanel.setLayout(backgroundPanelLayout);
    backgroundPanelLayout.setHorizontalGroup(
        backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(backgroundPanelLayout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleAdminLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342,
                            Short.MAX_VALUE)
                        .addGroup(backgroundPanelLayout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(backgroundPanelLayout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(findDocumentButton,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(borrowDocumentButton,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addDocumentButton,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(returnDocumentButton,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                backgroundPanelLayout.createSequentialGroup()
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(deleteDocumentButton,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 147,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(backgroundPanelLayout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(backgroundPanelLayout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addAdminButton,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteUserButton,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addUserButton,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(deleteAdminButton,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                backgroundPanelLayout.createSequentialGroup()
                                    .addGap(130, 130, 130)
                                    .addComponent(backButton,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 104,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(23, 23, 23))))))
    );

    backgroundPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
        new java.awt.Component[]{addAdminButton, addUserButton, deleteAdminButton,
            deleteUserButton});

    backgroundPanelLayout.setVerticalGroup(
        backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titleAdminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(findDocumentButton,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(backgroundPanelLayout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addDocumentButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(backgroundPanelLayout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(borrowDocumentButton,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(backgroundPanelLayout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnDocumentButton,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(backgroundPanelLayout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(deleteDocumentButton,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(31, Short.MAX_VALUE))))))
    );

    backgroundPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL,
        new java.awt.Component[]{addAdminButton, addUserButton, deleteAdminButton,
            deleteUserButton});

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

  private void addDocumentButtonActionPerformed(java.awt.event.ActionEvent evt) {
    new AddDocumentAdmin(idAdmin).setVisible(true);
    this.dispose();
  }

  private void addAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {
    new AddAdminAdmin(idAdmin).setVisible(true);
    this.dispose();
  }

  private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {
    new AddUserAdmin(idAdmin).setVisible(true);
    this.dispose();
  }

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    new Login().setVisible(true);
    this.dispose();
  }

  private void returnDocumentButtonActionPerformed(java.awt.event.ActionEvent evt) {
    new UpdateReturnedDocumentAdmin(idAdmin).setVisible(true);
    this.dispose();
  }

  private void borrowDocumentButtonActionPerformed(java.awt.event.ActionEvent evt) {
    new UpdateBorrowedDocumentAdmin(idAdmin).setVisible(true);
    this.dispose(); // Đóng cửa sổ hiện tại nếu cần
  }

  private void findDocumentButtonActionPerformed(java.awt.event.ActionEvent evt) {
    new FindDocumentAdmin(idAdmin).setVisible(true);
    this.dispose(); // Đóng cửa sổ hiện tại nếu cần
  }

  private void adminTextAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {
    // Khởi tạo đối tượng DatabaseManager
    DatabaseManager dbManager = new DatabaseManager();

    // Tìm thông tin người dùng dựa trên idUser
    Admin admin = dbManager.findAdmin(idAdmin);

    // Kiểm tra nếu tìm thấy người dùng
    if (admin != null) {
      // Hiển thị thông tin người dùng lên userTextArea
      StringBuilder adminInfo = new StringBuilder();
      adminInfo
          .append("Admin ID:    ").append(admin.getId()).append("\n\n")
          .append("Name     :    ").append(admin.getName()).append("\n\n")
          .append("Position  :    ").append(admin.getPosition());
      adminTextArea.setText(adminInfo.toString().trim());
    } else {
      adminTextArea.setText("Administrator information not found!");
    }
  }

  private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {
    new DeleteUserAdmin(idAdmin).setVisible(true);
    this.dispose(); // Đóng cửa sổ hiện tại nếu cần
  }

  private void deleteAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {
    new DeleteAdminAdmin(idAdmin).setVisible(true);
    this.dispose();
  }

  private void deleteDocumentButtonActionPerformed(java.awt.event.ActionEvent evt) {
    new DeleteDocumentAdmin(idAdmin).setVisible(true);
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
      java.util.logging.Logger.getLogger(MainViewAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainViewAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainViewAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainViewAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MainViewAdmin("22022132").setVisible(true);
      }
    });
  }

}

