package org.amityregion5.memeclicker.game;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import org.amityregion5.memeclicker.graphics.Component;
import org.amityregion5.memeclicker.graphics.ImageButton;
import org.amityregion5.memeclicker.graphics.Panel;
import org.amityregion5.memeclicker.graphics.Screen;
import org.amityregion5.memeclicker.graphics.Text;

public class Main {
	
	public static void main(String[] args) {
		Panel panel = new Panel();
		panel.loadObjects();
		JFrame frame = new JFrame("MemeClicker");
		frame.setSize(1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.add(panel);
		panel.addMouseListener(panel);
/*		TextButton button1 = new TextButton(100, 100, 100, 100);
		TextButton button2 = new TextButton(200, 200, 200, 200);
		TextButton button3 = new TextButton(300, 300, 300, 300);
		TextButton button4 = new TextButton(400, 400, 400, 400);*
		/*components.add(button1);
		components.add(button2);
		components.add(button3);
		components.add(button4);
		Screen.components.add(button1);
		Screen.components.add(button2);
		Screen.components.add(button3);
		Screen.components.add(button4);*/
		Thread render = new Thread(()-> {
		while (true) {

			try {

				Thread.sleep(1000/60);

			} catch (Exception e) {

				e.printStackTrace();

			}
			
			panel.repaint();
		}

		},"Render Thread");

		render.setDaemon(true);

		render.start();
	}
}
