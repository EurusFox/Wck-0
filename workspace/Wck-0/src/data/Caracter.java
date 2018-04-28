package data;

public abstract class Caracter {
	protected float positionX;
	protected float positionY;
	
	protected String name;
	protected String spriteName;
	
	protected int health;
	protected int maxHealth;
	
	abstract void movementX();
	abstract void movementY();
	abstract void attack();
	abstract void dodge();
	
	protected float getPositionX() {
		return positionX;
	}
	protected void setPositionX(float positionX) {
		this.positionX = positionX;
	}
	protected float getPositionY() {
		return positionY;
	}
	protected void setPositionY(float positionY) {
		this.positionY = positionY;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getSpriteName() {
		return spriteName;
	}
	protected void setSpriteName(String spriteName) {
		this.spriteName = spriteName;
	}
	protected int getHealth() {
		return health;
	}
	protected void setHealth(int health) {
		this.health = health;
	}
	protected int getMaxHealth() {
		return maxHealth;
	}
	protected void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	
}
