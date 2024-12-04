package GUI.Admin.Document;

public class ShowQRAddDoc extends javax.swing.JFrame {

  private javax.swing.JButton BackButtonQR;
  public javax.swing.JLabel QRLabel;

  public ShowQRAddDoc() {
    initComponents();
    setLocationRelativeTo(null);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    QRLabel = new javax.swing.JLabel();
    BackButtonQR = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    QRLabel.setIcon(
        new javax.swing.ImageIcon(getClass().getResource("/image/qr/qr.png"))); // NOI18N
    QRLabel.setToolTipText("");
    QRLabel.setPreferredSize(new java.awt.Dimension(300, 300));

    BackButtonQR.setBackground(new java.awt.Color(255, 0, 0));
    BackButtonQR.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
    BackButtonQR.setForeground(new java.awt.Color(255, 255, 255));
    BackButtonQR.setText("Back");
    BackButtonQR.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BackButtonQRActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(QRLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButtonQR, javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(QRLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BackButtonQR, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void BackButtonQRActionPerformed(java.awt.event.ActionEvent evt) {
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
      java.util.logging.Logger.getLogger(ShowQRAddDoc.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ShowQRAddDoc.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ShowQRAddDoc.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ShowQRAddDoc.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ShowQRAddDoc().setVisible(true);
      }
    });
  }

}
