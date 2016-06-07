package org.amityregion5.memeclicker.graphics;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import org.amityregion5.memeclicker.game.Main;

public class Panel extends JPanel implements MouseListener {
	
	public List<Component> components = new ArrayList();
	public int x = 0;
	public int screenNumber = 0;
	public boolean isPressed = false;
	
	@Override
	public void paint(Graphics g1) {
		Graphics2D g = (Graphics2D) g1;
		g.clearRect(0, 0, getWidth(), getHeight());
		MenuScreen.drawComponents(g);
		//Screen.drawComponents(g);
		//g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
		//g.drawString("Hello", (int) (getWidth() * .3), (int) (getHeight() * .3));
		// u got rekt boi
		
		//Rectangle2D rekt;
		
/*		if (isPressed == true) {
			rekt = new Rectangle2D.Double(210, 210, 380, 180);
			g.drawRect((int) rekt.getX(), (int) rekt.getY(), (int) rekt.getWidth(), (int) rekt.getHeight());
			rekt.setRect(210, 210, 380, 180);
			String str = "Hello";
			g.setFont(Text.scaleFont(str, rekt, g));
			Text.drawString(g, str, CenterMode.CENTER, (int) rekt.getCenterX(), (int) rekt.getCenterY());
		} else {
			rekt = new Rectangle2D.Double(200,200,400,200);
			g.drawRect((int) rekt.getX(), (int) rekt.getY(), (int) rekt.getWidth(), (int) rekt.getHeight());
			rekt.setRect(210, 210, 380, 180);
			String str = "Hello";
			g.setFont(Text.scaleFont(str, rekt, g));
			Text.drawString(g, str, CenterMode.CENTER, (int) rekt.getCenterX(), (int) rekt.getCenterY());
		}*/
/*		g.drawRect((int) rekt.getX(), (int) rekt.getY(), (int) rekt.getWidth(), (int) rekt.getHeight());
		
		rekt.setRect(210, 210, 380, 180);
		
		String str = "Hello";
		
		g.setFont(Text.scaleFont(str, rekt, g));
		Text.drawString(g, str, CenterMode.CENTER, (int) rekt.getCenterX(), (int) rekt.getCenterY());*/
		
		//g.drawImage(Main.img, 1000, 1000, 1000, 1000, null);
		
		//Text.scaleFont("hello", rect, g, 1000);
		//Text.drawString(g, "hello", CenterMode.RIGHT, 100, 100);
		//g.drawOval(x, 200, 300, 200);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
/*		System.out.println(e.getPoint());
		int x = e.getX();
		int y = e.getY();
		if (x > 200 && x < 600 && y > 200 && y < 400) {
			System.out.println("Button pressed");
		}*/
	}
	

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
/*		int x = e.getX();
		int y = e.getY();
		if (screenNumber == 0) {
			for (Component component : MenuScreen.components) {
				if (x > component.getX() && x < component.getX() + component.getWidth() && y > component.getY() && y < component.getY() + component.getHeight()) {
					graphics.clearRect(component.getX(), component.getY(), component.getWidth(), component.getHeight());
					graphics.drawRect(component.getX() - 100, component.getY() - 100, component.getWidth() - 100, component.getHeight() - 100);
					System.out.println(component.toString());
				}
			}
		} else if (screenNumber == 1) {
			
		} else {
			
		}
		isPressed = true;*/
		
		int x = e.getX();
		int y = e.getY();
		System.out.println(x);
		System.out.println(y);
		for (Component component : MenuScreen.getComponents()) {
			if (x > component.getX() && x < component.getX() + component.getWidth() && y > component.getY() && y < component.getY() + component.getHeight()) {
					System.out.println("1");
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		isPressed = false;
	}
}
