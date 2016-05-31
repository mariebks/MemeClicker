package org.amityregion5.memeclicker.game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import org.amityregion5.memeclicker.graphics.TextButton;
import org.amityregion5.memeclicker.graphics.Component;
import org.amityregion5.memeclicker.graphics.Panel;
import org.amityregion5.memeclicker.graphics.Screen;

public class Main {
	
	public static BufferedImage img;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("MemeClicker");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		Panel panel = new Panel();
		Panel panel1 = new Panel();
		frame.add(panel);
		panel.addMouseListener(panel);
		TextButton button1 = new TextButton(100, 100, 100, 100);
		TextButton button2 = new TextButton(200, 200, 200, 200);
		TextButton button3 = new TextButton(300, 300, 300, 300);
		TextButton button4 = new TextButton(400, 400, 400, 400);
		List<Component> components = new ArrayList<Component>();
		components.add(button1);
		components.add(button2);
		components.add(button3);
		components.add(button4);
		Screen.components.add(button1);
		Screen.components.add(button2);
		Screen.components.add(button3);
		Screen.components.add(button4);
		
		try {
			img = ImageIO.read(Main.class.getResource("/brain.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
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
