package GUI.NormalUser;

import main_class.Document;

import GUI.Admin.Document.FindDocumentAdmin;

import Database_connection.DatabaseManager;

import javax.swing.*;
import java.awt.*;

public class FindDocumentUser extends javax.swing.JFrame {

  private javax.swing.JLabel authorLabel;
  private javax.swing.JLabel authorLabel2;
  private javax.swing.JButton backButton;
  private javax.swing.JLabel bookTitleLabel;
  private javax.swing.JLabel bookTitleLabel2;
  private javax.swing.JLabel enterBookTitleLabel;
  private javax.swing.JTextField enterBookTitleTextField;
  private javax.swing.JButton findButton;
  private javax.swing.JLabel findDocumentLabel;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel numberOfCopiesAvailableLabel;
  private javax.swing.JLabel numberOfCopiesAvailableLabel2;

  DatabaseManager dbManager;
  Document document;
  private String idUser;

  public FindDocumentUser(String idUser) {
    initComponents();
    this.idUser = idUser;
    dbManager = new DatabaseManager();
    document = new Document();
    jPanel1.setBackground(Color.WHITE);
    setLocationRelativeTo(null);
    setSize(750, 450);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    findDocumentLabel = new javax.swing.JLabel();
    bookTitleLabel = new javax.swing.JLabel();
    authorLabel2 = new javax.swing.JLabel();
    enterBookTitleLabel = new javax.swing.JLabel();
    numberOfCopiesAvailableLabel2 = new javax.swing.JLabel();
    enterBookTitleTextField = new javax.swing.JTextField();
    findButton = new javax.swing.JButton();
    numberOfCopiesAvailableLabel = new javax.swing.JLabel();
    authorLabel = new javax.swing.JLabel();
    bookTitleLabel2 = new javax.swing.JLabel();
    backButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    findDocumentLabel.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
    findDocumentLabel.setForeground(new java.awt.Color(255, 0, 0));
    findDocumentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    findDocumentLabel.setText("Tra Cứu Sách");

    bookTitleLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    bookTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    bookTitleLabel.setText("Tên sách");

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

    enterBookTitleLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    enterBookTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    enterBookTitleLabel.setText("Nhâp tên sách");

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

    enterBookTitleTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    enterBookTitleTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        enterBookTitleTextFieldActionPerformed(evt);
      }
    });

    findButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
    findButton.setText("Tìm");
    findButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        findButtonActionPerformed(evt);
      }
    });

    numberOfCopiesAvailableLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    numberOfCopiesAvailableLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    numberOfCopiesAvailableLabel.setText("Số bản hiện có");

    authorLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    authorLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    authorLabel.setText("Tác giả");

    bookTitleLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    bookTitleLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
      public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        bookTitleLabel2AncestorAdded(evt);
      }

      public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
      }

      public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(
                            javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(findDocumentLabel, javax.swing.GroupLayout.Alignment.LEADING,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                            jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(numberOfCopiesAvailableLabel,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 129,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(
                                            javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numberOfCopiesAvailableLabel2,
                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(authorLabel,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 129,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(
                                            javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(authorLabel2,
                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bookTitleLabel,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 129,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(
                                            javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bookTitleLabel2,
                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                        jPanel1Layout.createSequentialGroup()
                                            .addComponent(enterBookTitleLabel,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 129,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(enterBookTitleTextField,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 421,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                    31, Short.MAX_VALUE)
                                .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(findDocumentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enterBookTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                            43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(enterBookTitleTextField,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(findButton))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bookTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bookTitleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(authorLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numberOfCopiesAvailableLabel,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numberOfCopiesAvailableLabel2,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73,
                    Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

  private void enterBookTitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    // Kiểm tra nếu ô nhập liệu bị rỗng
    if (enterBookTitleTextField.getText().isEmpty()) {
      JOptionPane.showMessageDialog(this, "Vui lòng nhập tiêu đề hoặc mã tài liệu", "Lỗi",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    Document document = dbManager.findDocument(enterBookTitleTextField.getText());

    // Hiển thị thông tin tài liệu hoặc thông báo lỗi
    if (document != null) {
      bookTitleLabel2.setText(document.getTitle());
      authorLabel2.setText(document.getAuthor());
      numberOfCopiesAvailableLabel2.setText(String.valueOf(document.getCopiesAvailable()));
    } else {
      JOptionPane.showMessageDialog(this, "Không tìm thấy tài liệu với tiêu đề hoặc mã đã nhập.",
          "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
  }

  private void bookTitleLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {
  }

  private void authorLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {
  }

  private void numberOfCopiesAvailableLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {
  }

  private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {
    // Kiểm tra nếu ô nhập liệu bị rỗng
    if (enterBookTitleTextField.getText().isEmpty()) {
      JOptionPane.showMessageDialog(this, "Vui lòng nhập tiêu đề hoặc mã tài liệu", "Lỗi",
          JOptionPane.ERROR_MESSAGE);
      return;
    }

    Document document = dbManager.findDocument(enterBookTitleTextField.getText());

    // Hiển thị thông tin tài liệu hoặc thông báo lỗi
    if (document != null) {
      bookTitleLabel2.setText(document.getTitle());
      authorLabel2.setText(document.getAuthor());
      numberOfCopiesAvailableLabel2.setText(String.valueOf(document.getCopiesAvailable()));
    } else {
      JOptionPane.showMessageDialog(this, "Không tìm thấy tài liệu với tiêu đề hoặc mã đã nhập.",
          "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
  }

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    MainViewUser mainViewUser = new MainViewUser(idUser);
    mainViewUser.setVisible(true);
    this.dispose();
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
      java.util.logging.Logger.getLogger(FindDocumentAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FindDocumentAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FindDocumentAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FindDocumentAdmin.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FindDocumentAdmin("24022294").setVisible(true);
      }
    });
  }

}
