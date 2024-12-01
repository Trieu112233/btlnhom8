package GUI;

import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.io.IOException;

public class BackgroundPanel extends JPanel {
  private Image backgroundImage;

  public BackgroundPanel(String imagePath) {
    try {
      // Sử dụng ClassLoader để load ảnh từ resources
      backgroundImage = ImageIO.read(getClass().getResource(imagePath));
    } catch (IOException | NullPointerException e) {
      e.printStackTrace();
    }
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (backgroundImage != null) {
      g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
  }
}
