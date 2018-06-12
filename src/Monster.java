
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


	
	



	@Override
	public void ability() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public boolean isTraversable(Space currentSpace) {
		// TODO Auto-generated method stub
		return false;
	}
	public void battle(Player p) {
		attack(p);
	}
}
