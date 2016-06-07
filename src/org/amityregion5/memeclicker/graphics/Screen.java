package org.amityregion5.memeclicker.graphics;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Screen {
	private static List<Component> components = new ArrayList<Component>();
	
	
	public static List<Component> getComponents() {
		return components;
	}


	public static void setComponents(List<Component> components) {
		Screen.components = components;
	}


	public static void drawComponents(Graphics2D g) {
		for (Component component : components) {
			component.draw(g);
		}
	}
}
