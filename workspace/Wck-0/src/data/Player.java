package data;

public class Player extends Caracter{
	private double speed = 0.5;
	
	@Override
	void movementX() {
		positionX += speed;
		
	}
	@Override
	void movementY() {
		positionY += speed;
		
	}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void dodge() {
		// TODO Auto-generated method stub
		
	}

}
