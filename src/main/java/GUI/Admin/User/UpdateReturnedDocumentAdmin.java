package GUI.Admin.User;

import main_class.NormalUser;
import main_class.Document;

import GUI.Admin.MainViewAdmin;

import Database_connection.DatabaseManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class UpdateReturnedDocumentAdmin extends javax.swing.JFrame {

  private javax.swing.JButton CheckIdButton;
  private javax.swing.JButton backButton;
  private javax.swing.JLabel bookTitleLabel;
  private javax.swing.JTextField bookTitleTextField;
  private javax.swing.JTextArea borrowedDocumentTextArea;
  private javax.swing.JLabel idUserLabel;
  private javax.swing.JTextField idUserTitleTextField;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JButton returnButton;
  private javax.swing.JLabel returnLabel;

  DatabaseManager dbManager;
  private String idAdmin;

  public UpdateReturnedDocumentAdmin(String idAdmin) {
    initComponents();
    this.idAdmin = idAdmin;
    dbManager = new DatabaseManager();
    jPanel1.setBackground(Color.WHITE);
    setLocationRelativeTo(null);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    returnLabel = new javax.swing.JLabel();
    bookTitleLabel = new javax.swing.JLabel();
    bookTitleTextField = new javax.swing.JTextField();
    backButton = new javax.swing.JButton();
    returnButton = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    borrowedDocumentTextArea = new javax.swing.JTextArea();
    idUserLabel = new javax.swing.JLabel();
    idUserTitleTextField = new javax.swing.JTextField();
    CheckIdButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    returnLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
    returnLabel.setForeground(new java.awt.Color(255, 0, 0));
    returnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    returnLabel.setText("Trả Sách");

    bookTitleLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    bookTitleLabel.setText("Tên sách");

    bookTitleTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    bookTitleTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bookTitleTextFieldActionPerformed(evt);
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

    returnButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    returnButton.setText("Trả");
    returnButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        returnButtonActionPerformed(evt);
      }
    });

    borrowedDocumentTextArea.setEditable(false);
    borrowedDocumentTextArea.setColumns(20);
    borrowedDocumentTextArea.setRows(5);
    borrowedDocumentTextArea.addAncestorListener(new javax.swing.event.AncestorListener() {
      public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        borrowedDocumentTextAreaAncestorAdded(evt);
      }

      public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
      }

      public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
      }
    });
    jScrollPane1.setViewportView(borrowedDocumentTextArea);

    idUserLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    idUserLabel.setText("ID người dùng");

    idUserTitleTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    idUserTitleTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        idUserTitleTextFieldActionPerformed(evt);
      }
    });

    CheckIdButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    CheckIdButton.setText("Check ID");
    CheckIdButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        CheckIdButtonActionPerformed(evt);
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
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                            jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(returnLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bookTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                    170, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bookTitleTextField,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                                .addComponent(idUserTitleTextField))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CheckIdButton,
                                    javax.swing.GroupLayout.Alignment.TRAILING,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 104,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(returnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                            false)
                        .addComponent(idUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idUserTitleTextField,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckIdButton)))
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
                            .addComponent(returnButton)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224,
                    Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
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
  }

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    this.dispose(); // Đóng màn hình hiện tại
    new MainViewAdmin(idAdmin).setVisible(
        true); // Giả sử bạn có một màn hình dashboard tên AdminDashboard
  }


  private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {
    // Kiểm tra nếu ô nhập liệu bị rỗng
    if (bookTitleTextField.getText().isEmpty()) {
      JOptionPane.showMessageDialog(this, "Vui lòng nhập tiêu đề hoặc mã tài liệu", "Lỗi",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    // Tìm tài liệu
    Document document = dbManager.findDocument(bookTitleTextField.getText());

    NormalUser normalUser = new NormalUser();
    normalUser = dbManager.findNormalUser(idUserTitleTextField.getText());

    // Kiểm tra nếu tài liệu không tồn tại hoặc không phải là tài liệu người dùng đã mượn
    if (document == null || !normalUser.checkBorrowedDocument(bookTitleTextField.getText())) {
      JOptionPane.showMessageDialog(this, "Tài liệu không phải của bạn hoặc chưa mượn!", "Lỗi",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    // Trả tài liệu và cập nhật cơ sở dữ liệu
    dbManager.removeBorrowedDocument(idUserTitleTextField.getText(), bookTitleTextField.getText());

    // Cập nhật số lượng bản sao có sẵn
    document.setCopiesAvailable(document.getCopiesAvailable() + 1);
    dbManager.updateDocument(bookTitleTextField.getText(), document.getCopiesAvailable());

    // Thông báo trả sách thành công
    JOptionPane.showMessageDialog(this, "Trả tài liệu thành công!", "Thông báo",
        JOptionPane.INFORMATION_MESSAGE);
    borrowedDocumentTextAreaAncestorAdded(null);

  }


  private void borrowedDocumentTextAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {
    try {
      // Lấy danh sách tài liệu đã mượn
      ArrayList<Document> borrowedDocuments = dbManager.getAllBorrowedDocument(
          idUserTitleTextField.getText());

      // Kiểm tra nếu danh sách rỗng
      if (borrowedDocuments.isEmpty()) {
        borrowedDocumentTextArea.setText("Bạn chưa mượn tài liệu nào.");
        return;
      }

      // Tạo chuỗi để hiển thị
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Tài liệu đã mượn:\n\n");
      int count = 1;
      for (Document document : borrowedDocuments) {
        stringBuilder.append("Tài liệu ").append(count++).append(":\n")
            .append("- Tiêu đề: ").append(document.getTitle()).append("\n")
            .append("- Tác giả: ").append(document.getAuthor()).append("\n\n");
      }

      // Hiển thị danh sách tài liệu
      borrowedDocumentTextArea.setText(stringBuilder.toString());
    } catch (Exception e) {
      // Xử lý lỗi và thông báo
      JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi lấy danh sách tài liệu đã mượn!",
          "Lỗi", JOptionPane.ERROR_MESSAGE);
      e.printStackTrace(); // Debug
    }
  }

  private void idUserTitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
  }

  private void CheckIdButtonActionPerformed(java.awt.event.ActionEvent evt) {
    borrowedDocumentTextAreaAncestorAdded(null);
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
      java.util.logging.Logger.getLogger(UpdateReturnedDocumentAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(UpdateReturnedDocumentAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(UpdateReturnedDocumentAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(UpdateReturnedDocumentAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new UpdateReturnedDocumentAdmin("22022132").setVisible(true);
      }
    });
  }

}

