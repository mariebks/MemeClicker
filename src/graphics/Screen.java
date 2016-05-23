package graphics;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Screen {
	Graphics2D g;
	public static List<Component> components = new ArrayList<Component>();
	
	public Screen(List<Component> components) {
		this.components = components;
	}
	
	public static void drawComponents(Graphics2D g) {
		for (Component component : components) {
			component.draw(g);
		}
	}
}
