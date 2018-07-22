import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Player.Direction;

public class DungeonsAndDragons extends JPanel implements KeyListener {
	private static final int WIDTH = 615;
	private static final int HEIGHT = 615;
	public static JFrame frame;
	private Player p1;
	private GameBoard board;
	
	
	
	public DungeonsAndDragons() {
		
		p1 = new Player(Player.Race.DWARF, Player.Class.BARBARIAN);
		board = new GameBoard();
		
	}

	public static void main (String[] args) {
		// I would put main in a class called DungeonsAndDragons
		// I would put the board class as separate from where main is, and 
		//   create it in its own scope.
		// Game initialization here
		frame = new JFrame("Dungeons and Dragons");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.black);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(true);
		frame.add(new DungeonsAndDragons());
		frame.setVisible(true);
		// Read saved character from disk storage
		// Read saved monsters and NPC's from disk storage
		// 
		// End game initialization
		
		// This is where the main game play scheduler loop would go.
		// while (1) {
		//   Loop through player loop looking for keystrokes
		//   foreach player in playerArray {
		//     if (keystroke == end game) {
		//       last;
		//     } else {
		//       handle other keystrokes
		//     }
		//     Now that all player keystrokes are handled, do random stuff
		//       like random interactions with monsters, weather things, etc.
		//   }
		//   Loop through Non player characters and do stuff
		//   foreach npc in npcArray {
		//     Do NPC stuff
		//   }
		//   foreach monster in monsterArray {
		//     Move monsters
		//     Check for interactions with monsters and other characters
		//     Do monster stuff
		//   }
		//   Increment time of day clock to keep track of daytime/nightime
		//   Other stuff
		//   Sleep for 1 second so loop doesn't go too fast.
		// }
		// end main gameplay while loop.
		//
		// Do end of game maitenance
        // Save state of all characters
		// Save location and state of all NPC's
		// Save location and state of all monsters and other characters.
		// exit;
	}
public void paint(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setBackground(Color.BLACK);
		for(Space space : GameBoard.spaces) {
			g2d.setPaint(space.getColor());
			g2d.fill(space);
			g2d.setPaint(Color.BLACK);
			g2d.draw(space);
		}
		g2d.setPaint(Color.BLACK);
		g2d.fillRect((int)(p1.getXPos() - 5), (int)(p1.getYPos() - 5), 10, 10);

		}

addActionListener(new KeyListener{
	public void keyTyped(KeyEvent e) {
	switch(e.getKeyCode()) {
	
	case KeyEvent.VK_UP:
		Player.move(Player.Direction.UP);
		
		break;
		
	case KeyEvent.VK_DOWN:
		Player.move(Player.Direction.DOWN);
		break;
		
	case KeyEvent.VK_LEFT:
		Player.move(Player.Direction.LEFT);
		System.out.println("u");
		break;
		
	case KeyEvent.VK_RIGHT:
		Player.move(Player.Direction.RIGHT);
		break;
	}
}



public void keyPressed(KeyEvent e) {}



public void keyReleased(KeyEvent e) {}

	
});
}
