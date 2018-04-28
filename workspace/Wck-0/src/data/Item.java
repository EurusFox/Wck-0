package data;

import java.util.ArrayList;

public class Item {
	private String name;
	
	private ArrayList<Effect> effects;

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected ArrayList<Effect> getEffects() {
		return effects;
	}

	protected void setEffects(ArrayList<Effect> effects) {
		this.effects = effects;
	}
	
}
