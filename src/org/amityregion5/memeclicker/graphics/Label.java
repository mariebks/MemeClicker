package org.amityregion5.memeclicker.graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Label extends Component {
	
	/**
	 * @param x The x position of the label
	 * @param y The y position of the label
	 * @param width The width of the label
	 * @param height The height of the label
	 */
	public Label(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	
	@Override
	public void draw(Graphics2D g) {
		g.drawRect(getX(), getY(), getWidth(), getHeight());
	}
	
	
}
