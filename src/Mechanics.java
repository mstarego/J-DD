
public class Mechanics {
	private boolean battleInProgress;
	Die d6 = new Die(6);
	private Monster monster;
	public Mechanics() {
		
	}
	public void attack(Player player, Monster enemy) {
		if(player.getDexterity() >= enemy.getDexterity()) {
		damage(player, enemy);
		damage(enemy, player);

		}
		else {
			damage(enemy, player);
			damage(player, enemy);

		}
	}	
	public void damage(Character attacker, Character defender) {
		double realDamage = attacker.getStrength() - defender.getConstitution() / 3.0;
		defender.decreaseHealth(realDamage);
	}
	
	public void battle(Player player, Monster enemy) {
		battleInProgress = true;
		System.out.println(player.getHealth() + "-" + enemy.getHealth() + "-" + player.getStrength() + "-" + enemy.getStrength());
		attack(player, enemy);
		System.out.println("Your Health: " + player.getHealth());
		System.out.println("Enemy Health: " + enemy.getHealth());
		if(player.getHealth() <= 0) {
			battleInProgress = false;
			DungeonsAndDragons.frame.dispose();
			System.out.println("You died:(");
		}
		else if(enemy.getHealth() <= 0) {
			battleInProgress = false;
			System.out.println("You defeated the monster");
			System.out.println("The monster dropped " + enemy.getGoldBalance() + " gold");
			player.increaseGoldBalance(enemy.getGoldBalance());
			System.out.println(player.getGoldBalance());
		}
	}
	
	public void newSpace(Player player) {
		if(d6.roll() == 1) {
			System.out.println("A monster spotted you");
			monster = new Monster(player.getXPos(), player.getYPos());
			do {
				battle(player, monster);
			}while(battleInProgress);
		}
	}
}
