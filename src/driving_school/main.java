package driving_school;

import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
public class main {
	
	
	
	
	public static void main (String arg[]) {
		
	
		
		JFrame JF = new JFrame() {};
		JF.setVisible(true);
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JF.setSize(720, 480);
		JF.setLocation(650,250);
		JF.setTitle("Driving school clinet");
		
		
		BufferedImage img;
		try {
			img = ImageIO.read(new File("src/pictures/icon.png"));
			JF.setIconImage(img);
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
	}
	
	
}
