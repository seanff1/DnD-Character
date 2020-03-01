package dndCharacter;

public class RogueClass extends Character{
	
	public void level2(){
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		RogueClass me = new RogueClass();
		me.getCoreStats();
		me.rollDice(1, 20);
		me.rollAttack();
		
	}

}
