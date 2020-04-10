import java.awt.Color;

public class Healthy extends LifeForm {

	public Healthy(Location loc, World w) {
		super(loc, w);
		myColor = Color.green;
		myLifeSpan = 10;
	}
	
	public void reproduce () {
	}
		
	public void move () {
		int newX = (int)(Math.random()*100);
		int newY = (int)(Math.random()*100); 
		setMyLocation (new Location(newX, newY));
	}
	
}
