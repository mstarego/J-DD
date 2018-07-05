import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class GameBoard {

private Die d25;
private Die d50;
public Monster m;
private Point2D point;

public static ArrayList<Space> spaces = new ArrayList<Space>();
	public GameBoard() {
		d25 = new Die(25);
		d50 = new Die(50);
		for(int x = 0; x < 600; x += 25) {
			for(int y = 0; y < 575; y += 25) {
				if(d50.roll() == 1) {
					spaces.add(new Village(x, y, 25, 25));
				}
				else {
				spaces.add(new Forest(x, y, 25, 25));
				}
			}
		}
		// This should be in main initialization
		// GameBoard and player should be in their own separate scope
		// ****
		 
//		System.out.println(spaces);
		
	

	
	
	
}
}
