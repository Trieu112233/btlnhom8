package GUI.Admin.Document;

import static QR.QRCodeGenerator.generateQRCode;

import QR.QRCodeGenerator;
import main_class.Document;

import GUI.Admin.MainViewAdmin;

import Database_connection.DatabaseManager;

import API.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.imageio.ImageIO;
import javax.print.Doc;
import javax.swing.*;
import java.awt.*;
import com.google.gson.Gson;
import javax.swing.event.DocumentEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Quach Quang
 */
public class FindDocumentAdmin extends javax.swing.JFrame {

  Document document;
  private String idAdmin;

  /**
   * Creates new form FindDocumentUser
   */
  public FindDocumentAdmin(String idAdmin) {
    initComponents();
    this.idAdmin = idAdmin;
    document = new Document();
    jPanel1.setBackground(Color.WHITE);
    setLocationRelativeTo(null);
    //setSize(1100, 600);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
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
    numberOfCopiesAvailableLabel = new javax.swing.JLabel();
    authorLabel = new javax.swing.JLabel();
    bookTitleLabel2 = new javax.swing.JLabel();
    backButton = new javax.swing.JButton();
    describleLabel = new javax.swing.JLabel();
    imageLabel = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTextArea1 = new javax.swing.JTextArea();
    popupMenu = new javax.swing.JPopupMenu();
    qrLabel = new javax.swing.JLabel();
    qrButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    enterBookTitleTextField.setText("");
    enterBookTitleTextField.getDocument()
        .addDocumentListener(new javax.swing.event.DocumentListener() {
          @Override
          public void insertUpdate(DocumentEvent e) {
            updateSuggestions();
          }

          @Override
          public void removeUpdate(DocumentEvent e) {
            updateSuggestions();
          }

          @Override
          public void changedUpdate(DocumentEvent e) {
            updateSuggestions();
          }
        });

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
    enterBookTitleLabel.setText("Nhập tên sách");

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

    describleLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    describleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    describleLabel.setText("Mô tả");

    jTextArea1.setEditable(false);
    jTextArea1.setColumns(20);
    jTextArea1.setRows(5);
    jScrollPane1.setViewportView(jTextArea1);

    qrButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    qrButton.setText("QR");
    qrButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        qrButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(describleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGap(18, 18, 18)
                                                            .addComponent(jScrollPane1))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                    .addComponent(numberOfCopiesAvailableLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                    .addComponent(bookTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                                                                    .addComponent(authorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                    .addComponent(bookTitleLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                                                                                    .addComponent(authorLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                    .addComponent(numberOfCopiesAvailableLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                    .addComponent(enterBookTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(enterBookTitleTextField))
                                                                            .addComponent(findDocumentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addGap(18, 18, 18)
                                                            .addComponent(qrLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(qrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(findDocumentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(43, 43, 43)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(enterBookTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(enterBookTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(bookTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(bookTitleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(authorLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(numberOfCopiesAvailableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(numberOfCopiesAvailableLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(qrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(qrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(describleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    jTextArea1.setFont(new java.awt.Font("Time New Roman", java.awt.Font.PLAIN,
        16)); // Thay đổi 16 thành kích cỡ mong muốn

    // Giả sử descriptionTextArea là JTextArea mà bạn sử dụng để hiển thị mô tả

    pack();
  }// </editor-fold>

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    new MainViewAdmin(idAdmin).setVisible(true);
    this.dispose();
  }

  private void enterBookTitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
  }

  private void authorLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {
    // TODO add your handling code here:
  }

  private void numberOfCopiesAvailableLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {
    // TODO add your handling code here:
  }

  private void bookTitleLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {
    // TODO add your handling code here:
  }

  private void qrButtonActionPerformed(java.awt.event.ActionEvent evt) {
    // Tạo đường dẫn lưu QR Code
    String filePath = "src/main/java/image/qr/qr.png";

    // Tạo mã QR từ thông tin tài liệu
    try {
      QRCodeGenerator.generateQRCode(document, filePath);

      // Tải hình ảnh QR vừa tạo và setIcon cho qrLabel
      ImageIcon qrIcon = new ImageIcon(filePath);
      Image scaledImage = qrIcon.getImage().getScaledInstance(qrLabel.getWidth(), qrLabel.getHeight(), Image.SCALE_SMOOTH);
      qrLabel.setIcon(new ImageIcon(scaledImage));
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, "Lỗi khi tạo QR Code: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
      e.printStackTrace();
    }
  }


  private void updateUIWithDocument(Document document) {
    // Cập nhật thông tin sách lên các label và textArea
    bookTitleLabel2.setText(document.getTitle());
    authorLabel2.setText(document.getAuthor());
    numberOfCopiesAvailableLabel2.setText("" + document.getCopiesAvailable());

    jTextArea1.setText(document.getDescription());
    jTextArea1.setLineWrap(true); // Tự động xuống dòng
    jTextArea1.setWrapStyleWord(true); // Đảm bảo từ không bị cắt ngang

    // Tải hình ảnh sách (nếu có URL)
    if (document.getImage() != null && !document.getImage().isEmpty()) {
      try {
        // Tạo URL từ chuỗi URL của hình ảnh
        URL imageurl = new URL(document.getImage());
        ImageIcon imageIcon = new ImageIcon(imageurl);
        imageLabel.setIcon(imageIcon);
      } catch (Exception e) {
        e.printStackTrace();
      }
    } else {
      imageLabel.setIcon(null); // Xóa hình nếu không có URL
    }
  }


  private Timer typingTimer;
  private boolean isUpdating = false;

  private void updateSuggestions() {

    if (isUpdating) {
      return; // Không làm gì nếu đang trong trạng thái cập nhật
    }

    String query = enterBookTitleTextField.getText().trim();

    // Ẩn popup cũ trước khi bắt đầu cập nhật
    popupMenu.setVisible(false);

    if (!query.isEmpty()) {
      // Nếu đang có một timer đang chạy, hủy nó
      if (typingTimer != null) {
        typingTimer.stop();
      }

      // Khởi tạo một timer để trì hoãn việc gọi API
      typingTimer = new Timer(500, e -> { // 500ms là khoảng thời gian chờ trước khi gọi API
        new Thread(() -> {
          try {
            DatabaseManager databaseManager = new DatabaseManager();

            // Kiểm tra sách trong cơ sở dữ liệu
            Document existingDocument = databaseManager.getDocumentByTitle(query);
            if (existingDocument != null) {
              // Sách đã tồn tại trong CSDL, cập nhật giao diện với thông tin từ CSDL
              SwingUtilities.invokeLater(() -> {
                updateUIWithDocument(existingDocument);
              });
              return; // Kết thúc luồng nếu tìm thấy trong CSDL
            }

            // Nếu không có trong CSDL, gọi API Google Books
            String apiKey = "AIzaSyBewtkcMhBQ3umnqhukja-mElQLIqwaYRc";
            String urlString =
                "https://www.googleapis.com/books/v1/volumes?q=" + query.replace(" ", "%20")
                    + "&key=" + apiKey;

            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
              response.append(line);
            }
            reader.close();

            Gson gson = new Gson();
            GoogleBooksResponse booksResponse = gson.fromJson(response.toString(),
                GoogleBooksResponse.class);

            SwingUtilities.invokeLater(() -> {
              popupMenu.removeAll(); // Xóa các mục cũ trong popupMenu
              if (booksResponse.getItems() != null && booksResponse.getItems().length > 0) {
                for (Book book : booksResponse.getItems()) {
                  String title = book.getVolumeInfo().getTitle();
                  JMenuItem item = new JMenuItem(title);
                  item.addActionListener(e1 -> {
                    isUpdating = true; // Bắt đầu trạng thái cập nhật
                    enterBookTitleTextField.setText(item.getText());
                    popupMenu.setVisible(false); // Ẩn popup menu

                    // Cập nhật giao diện
                    document.setTitle(book.getVolumeInfo().getTitle());
                    document.setAuthor(book.getVolumeInfo().getAuthorNames() != null
                        ? String.join(", ", book.getVolumeInfo().getAuthorNames()) : "N/A");
                    document.setDescription(book.getVolumeInfo().getDescription() != null
                        ? book.getVolumeInfo().getDescription() : "No description available.");

                    String imageUrl = book.getVolumeInfo().getImageLinks() != null
                        ? book.getVolumeInfo().getImageLinks().getThumbnail() : "";
                    document.setImage(imageUrl);

                    updateUIWithDocument(document);
                    isUpdating = false; // Kết thúc trạng thái cập nhật
                  });
                  popupMenu.add(item);
                }

                // Hiển thị popup dưới JTextField và yêu cầu JTextField giữ focus
                popupMenu.show(enterBookTitleTextField, 0, enterBookTitleTextField.getHeight());
                enterBookTitleTextField.requestFocusInWindow(); // Đảm bảo focus vẫn ở JTextField
              }
            });
          } catch (Exception a) {
            a.printStackTrace();
          }
        }).start();
      });
      typingTimer.setRepeats(false); // Đảm bảo chỉ gọi một lần sau khoảng thời gian trễ
      typingTimer.start(); // Bắt đầu
    } else {
      popupMenu.setVisible(false); // Ẩn popup khi không có từ khóa tìm kiếm
    }
  }


  /**
   * @param args the command line arguments
   */
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
        new FindDocumentAdmin("22022132").setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify
  private javax.swing.JLabel authorLabel;
  private javax.swing.JLabel authorLabel2;
  private javax.swing.JButton backButton;
  private javax.swing.JLabel bookTitleLabel;
  private javax.swing.JLabel bookTitleLabel2;
  private javax.swing.JLabel describleLabel;
  private javax.swing.JLabel enterBookTitleLabel;
  private javax.swing.JTextField enterBookTitleTextField;
  private javax.swing.JLabel findDocumentLabel;
  private javax.swing.JLabel imageLabel;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea jTextArea1;
  private javax.swing.JLabel numberOfCopiesAvailableLabel;
  private javax.swing.JLabel numberOfCopiesAvailableLabel2;
  private javax.swing.JButton qrButton;
  private javax.swing.JLabel qrLabel;
  private javax.swing.JPopupMenu popupMenu;
  // End of variables declaration
}
