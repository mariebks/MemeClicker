package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Panel extends JPanel implements MouseListener {
	
	public List<Component> components = new ArrayList();
	public int x = 0;
	
	@Override
	public void paint(Graphics g1) {
		Graphics2D g = (Graphics2D) g1;
		g.clearRect(0, 0, getWidth(), getHeight());
		//Screen.drawComponents(g);
		g.drawRect(200, 200, 400, 200);
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
