package Pandemic;

import java.awt.Color;

public class InfectedSymptomatic extends Human {

	public InfectedSymptomatic(Location loc, World w) {
		super(loc, w);
		myColor = Color.red;
		myLifeSpan = 10;
	}

	
	public void move () {
		
	}
	

}
