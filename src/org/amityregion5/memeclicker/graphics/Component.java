package org.amityregion5.memeclicker.graphics;

import java.awt.Graphics2D;

public abstract class Component {
	private int x;
	private int y;
	private int width;
	private int height;
	private String name;
	
	public Component(int x, int y, int width, int height, String name) {
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setHeight(height);
		this.setName(name);
	}
	
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}


	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}


	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}


	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}


	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}


	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}


	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}


	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}


	public abstract void draw(Graphics2D g);


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
