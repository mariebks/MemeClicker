package org.amityregion5.memeclicker.graphics;

import java.awt.Graphics2D;

public abstract class Component {
	int x;
	int y;
	int width;
	int height;
	
	public Component(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public abstract void draw(Graphics2D g);
}
