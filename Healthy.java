import java.awt.Color;

public class Healthy extends LifeForm {

	public Healthy(Location loc, World w) {
		super(loc, w);
		myColor = Color.green;
		myLifeSpan = 10;
	}
	
	public void reproduce () {
		int newX = (int)(Math.random()*5);
		int newY = (int)(Math.random()*5); 
		myWorld.getCreatureList().add(new Cow(new Location(newX,newY), myWorld));
	}
		
	public void move () {
		int newX = (int)(Math.random()*5);
		int newY = (int)(Math.random()*5); 
		setMyLocation (new Location(newX, newY));
	}
	
}
