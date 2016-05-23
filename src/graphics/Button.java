package graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Button extends Component {

	/**
	 * @param x The x position of the button
	 * @param y The y position of the button
	 * @param width The width of the button
	 * @param height The height of the button
	 */
	public Button(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	
	
	/**
	 * @param g The graphics object on which the drawRect method will be called on
	 */
	@Override
	public void draw(Graphics2D g) {
		g.drawRect(x, y, width, height);
	}
}
