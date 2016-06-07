package org.amityregion5.memeclicker.graphics;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Screen {
	private List<Component> components = new ArrayList<Component>();
	
	public Screen(List<Component> components) {
		this.components = components;
	}
	
	public List<Component> getComponents() {
		return components;
	}

	public void drawComponents(Graphics2D g) {
		for (Component component : components) {
			component.draw(g);
		}
	}
}
