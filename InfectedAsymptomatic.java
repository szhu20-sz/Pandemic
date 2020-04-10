import java.awt.Color;

public class InfectedAsymptomatic extends LifeForm {

	public InfectedAsymptomatic(Location loc, World w) {
		super(loc, w);
		myColor = Color.yellow;
		myLifeSpan = 10;
	}
	
	public void reproduce () {
		
	}
		
	public void move () {
		int newX = (int)(Math.random()*5);
		int newY = (int)(Math.random()*5); 
		setMyLocation (new Location(newX, newY));
	}
	
}
