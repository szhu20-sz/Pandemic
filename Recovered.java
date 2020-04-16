package Pandemic;

import java.awt.Color;

public class Recovered extends Human {

	public Recovered(Location loc, World w) {
		super(loc, w);
		myColor = Color.orange;
	}
	
	public Recovered(int myLifeSpan, Location myLocation, Color myColor, World myWorld) {
		super(myLifeSpan, myLocation, myColor, myWorld);
	}
	
	public void checkInfection() {
		
	}
		
	public void move () {
        int newX = this.getMyLocation().getX() + rgen.nextInt(-2,2);
        int newY = this.getMyLocation().getY() +  rgen.nextInt(-2,2);
        if (newX >= 0 && newX < 20 && newY >= 0 && newY < 20) {
              validPosition = true;
              for (LifeForm c: myWorld.getCreatureList()){
                    if (c.getMyLocation().getX() == newX && c.getMyLocation().getY() == newY) {
                             validPosition = false;
                     }
                }
          }
         
       if (validPosition = true) {
   			myLocation.setX(newX);
   			myLocation.setY(newY);
        }
     }  
	
}

