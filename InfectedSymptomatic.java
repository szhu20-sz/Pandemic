import java.awt.Color;

public class InfectedSymptomatic extends LifeForm {

	public InfectedSymptomatic(Location loc, World w) {
		super(loc, w);
		myColor = Color.red;
		myLifeSpan = 10;
	}
	
	public void reproduce() {
		
	}
	
	public void move () {
		setMyLocation (myLocation);
	}
	

}
