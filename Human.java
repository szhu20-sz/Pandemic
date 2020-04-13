package Pandemic;

import java.awt.Color;
import acm.util.RandomGenerator;


public class Human extends LifeForm {
	
	RandomGenerator rgen = new RandomGenerator ();
	boolean validPosition = false;

	public Human(Location loc, World w) {
		super(loc, w);
		myColor = Color.green;
		myLifeSpan = 10;
	}
	
		
	public void move() {

	}
	
	public void infect () {
		
	}
	
}
    
