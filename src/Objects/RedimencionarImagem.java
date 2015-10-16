package Objects;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class RedimencionarImagem {
	public RedimencionarImagem(int width, int heigth, File fileOriginal,
			File fileNova) throws IOException {
		BufferedImage imagem = ImageIO.read(fileOriginal);
		BufferedImage new_img = new BufferedImage(width, heigth,
				BufferedImage.TYPE_INT_RGB);
		Graphics2D g = new_img.createGraphics();
		g.drawImage(imagem, 0, 0, width, heigth, null);
		ImageIO.write(new_img, "JPG", fileNova);
	}

	public static void main(String[] args) throws IOException {
		new RedimencionarImagem(235, 
								235, 
								new File("C:\\Users\\DES-Logus\\Pictures\\Giovanetti512.jpg"), 
								new File("C:\\Users\\DES-Logus\\Pictures\\Giovanetti.jpg"));
	}
}
