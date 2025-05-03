package driving_school;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;



public class main {
	
	
	
	
	public static void main (String arg[]) {
		
	
		BufferedImage appIcon;
		JFrame JF = new JFrame() {};
		Toolkit toolKit = Toolkit.getDefaultToolkit();
		
		commonData.screenHeigh = toolKit.getScreenSize().height;
		commonData.screenWidth = toolKit.getScreenSize().width;
		commonData.appWidth = commonData.screenWidth/2;
		commonData.appHeight = commonData.screenHeigh/2;
		
		//System.out.println("Ширина экрана "+commonData.screenWidth);	
		//System.out.println("Высота экрана "+commonData.screenHeigh);	
		
		JF.setVisible(true);
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JF.setBounds(commonData.screenWidth/2-commonData.appWidth/2, commonData.screenHeigh/2-commonData.appHeight/2, commonData.appWidth, commonData.appHeight);
		JF.setTitle("Driving school clinet");
		
		
		
		try {
			appIcon = ImageIO.read(new File("src/pictures/icon.png"));
			JF.setIconImage(appIcon);
		} catch (IOException e) {
			e.printStackTrace();
			
			//System.out.println(e.getLocalizedMessage());
			
		}
	}
	
	
}
