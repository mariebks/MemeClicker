package org.amityregion5.memeclicker.graphics;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class ImageButton extends Component {
	BufferedImage img;
	public ImageButton(int x, int y, int width, int height, String name, BufferedImage img) {
		super(x, y, width, height, name);
		this.img = img;
	}

	@Override
	public void draw(Graphics2D g) {
		g.drawImage(img, getX(), getY(), getWidth(), getHeight(), null);
		g.drawRect(getX(), getY(), getWidth(), getHeight());
	}
}
