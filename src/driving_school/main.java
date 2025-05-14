package driving_school;

import MyExeptions.*;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;


public class main {
	
	
	public static JFrame JF;
	
	public static void main (String arg[]) {
		
		
		JF = GetAuthWindow();
		
		
		
	}
	public static JFrame GetAuthWindow() {
		
		JFrame JF = new JFrame() {};
		BufferedImage appIcon;
		
		try {
		
			try {
				appIcon = ImageIO.read(new File("src/pictures/icon.png"));
				JF.setIconImage(appIcon);
			} catch (IOException e) {
				e.printStackTrace();
				LogWriter.WriteLog(DefaultErrors.PICTURE_LOAD_ERROR+" icon.png : \n "+e.getMessage());
			}
				
			JLabel loginLabel = new JLabel();
			loginLabel.setText("Логин:");
			loginLabel.setBounds(40, 100, 100, 15);
			
			JTextField loginField = new JTextField(15);
			loginField.setBounds(40, 115, 220, 20);
			
			JPasswordField passwdField = new JPasswordField();
			passwdField.setBounds(40, 150, 220, 20);
			
			JLabel passwdLabel = new JLabel();
			passwdLabel.setText("Пароль:");
			passwdLabel.setBounds(40, 135, 100, 15);
			
			JButton authBTN = new JButton();
			
			authBTN.setBounds(90, 180, 120, 20);
			authBTN.setText("Войти");
			authBTN.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					
					
				}
			});
			
			
			
			JPanel authPanel = new JPanel();
			authPanel.setLayout(null);
			
			authPanel.add(loginLabel);
			authPanel.add(loginField);
			authPanel.add(passwdLabel);
			authPanel.add(passwdField);
			authPanel.add(authBTN);
			
			JF.add(authPanel);
			
			
			
			JF.setVisible(true);
			JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JF.setTitle("Driving school clinet: Authorization");
			
			JF.setBounds(commonData.maxScreenWidtn/2-commonData.AUTH_WINDOW_WIGTH/2,commonData.maxScreenHeigt/2-commonData.AUTH_WINDOW_HEIGHT/2
					,commonData.AUTH_WINDOW_WIGTH,commonData.AUTH_WINDOW_HEIGHT );
			JF.setMinimumSize(new Dimension(commonData.AUTH_WINDOW_WIGTH,commonData.AUTH_WINDOW_HEIGHT));
			JF.setMaximumSize(new Dimension(commonData.AUTH_WINDOW_WIGTH,commonData.AUTH_WINDOW_HEIGHT));
			
			
			} catch (Exception e) {
				System.exit(DefaultErrors.AUTH_WINDOW_ERROR_KODE);
			}
		
		
		return  JF;
	}
	
	
	public static JFrame GetMainJFrame() {
		JF = new JFrame() {};
		BufferedImage appIcon;
		try {
		JF = screenSettings.SetScreenSizeForMainWindow(JF);
			
		JF.setVisible(true);
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JF.setTitle("Driving school clinet");
		JF.addComponentListener(commonFunctions.createResizeAdapterForDefWindows(JF));
		
		try {
			appIcon = ImageIO.read(new File("src/pictures/icon.png"));
			JF.setIconImage(appIcon);
		} catch (IOException e) {
			e.printStackTrace();
			LogWriter.WriteLog(DefaultErrors.PICTURE_LOAD_ERROR+" icon.png : \n "+e.getMessage());
		}
		
		} catch (Exception e) {
			System.exit(DefaultErrors.MAIN_WINDOW_ERROR_KODE);
		}
		
		
		return JF;
		
	}
	
}
