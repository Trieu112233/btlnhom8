package QR;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class QRCodeGenerator {

  public static void generateQRCode(String previewLink, String filePath) {
    // Concatenate book details into a single formatted string

    int width = 300;  // Width of the QR code
    int height = 300; // Height of the QR code

    try {
      // Create a QR code writer
      QRCodeWriter qrCodeWriter = new QRCodeWriter();

      // Encode the book data into a QR code
      BitMatrix bitMatrix = qrCodeWriter.encode(previewLink, BarcodeFormat.QR_CODE, width, height);

      // Define the file path for the QR code image
      Path path = FileSystems.getDefault().getPath(filePath);

      // Write the QR code to the file
      MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);

    } catch (WriterException | IOException e) {
      System.err.println("Error generating QR code: " + e.getMessage());
    }
  }

}