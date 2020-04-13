package Pandemic;

import java.awt.Color;

public class InfectedAsymptomatic extends Human {

	public InfectedAsymptomatic(Location loc, World w) {
		super(loc, w);
		myColor = Color.yellow;
		myLifeSpan = 10;
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
