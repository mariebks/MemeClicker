package org.amityregion5.memeclicker.graphics;

import java.awt.Graphics2D;

import org.amityregion5.memeclicker.game.Main;

public class ImageButton extends Component {

	public ImageButton(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics2D g) {
		g.drawImage(Main.img, 400, 400, 400, 400, null);
	}
}
