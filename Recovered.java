import java.awt.Color;

public class Recovered extends LifeForm {

	public Recovered(Location loc, World w) {
		super(loc, w);
		myColor = Color.yellow;
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
