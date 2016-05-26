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
	
	@Override
	public void paint(Graphics g1) {
		Graphics2D g = (Graphics2D) g1;
		g.clearRect(0, 0, getWidth(), getHeight());
		//Screen.drawComponents(g);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
		g.drawString("Hello", (int) (getWidth() * .3), (int) (getHeight() * .3));
		Rectangle2D rect = new Rectangle2D.Double(200,200,400,200);
		
		g.drawRect((int) rect.getX(), (int) rect.getY(), (int) rect.getWidth(), (int) rect.getHeight());
		
		rect.setRect(210, 210, 380, 180);
		
		String str = "Hello";
		
		g.setFont(Text.scaleFont(str, rect, g));
		Text.drawString(g, str, CenterMode.CENTER, (int)rect.getCenterX(), (int)rect.getCenterY());
		g.drawImage(Main.img, 1000, 1000, 1000, 1000, null);
		
		//Text.scaleFont("hello", rect, g, 1000);
		//Text.drawString(g, "hello", CenterMode.RIGHT, 100, 100);
		//g.drawOval(x, 200, 300, 200);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getPoint());
		int x = e.getX();
		int y = e.getY();
		if (x > 200 && x < 600 && y > 200 && y < 400) {
			System.out.println("Button pressed");
		}
	}
	

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}
