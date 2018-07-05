
public class Monster extends Character {

	public Monster(double startingXPos, double startingYPos) {
		super();
		setXPos(startingXPos);
		setYPos(startingYPos);
		setHealth(25);
		setStrength(15);
		setSpeed(5);
		setConstitution(10);
		setIntelligence(5);
		setDexterity(5);
		setGoldBalance(d25.roll());
	}


	
	// Retreat method, to try to escape
	// Attack method
	// Stand guard method, increased awareness of surroundings or maybe to 
	//   protect someone or something.
	
	// Note:  There could be a way where you can befriend a monster?  Maybe
	//        there could be a "disposition" or aggression attribute that determines
	//        how friendly they are.  It could be incorporated into whether it will
	//        attack or not.
	
	// Random note on monsters:  There should be a way to group them and do things
	// as a group, like move together, attack, retreat, stand guard, etc.



	@Override
	public void ability() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public boolean isTraversable(Space currentSpace) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
