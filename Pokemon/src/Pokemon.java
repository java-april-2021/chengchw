
public class Pokemon {

	
	protected String name;
	protected String type;
	protected int health;
	
	public static int count = 0;
	
	public Pokemon(String ipname, String iptype, int iphealth) {
		
		this.name = ipname;
		this.type = iptype;
		this.health = iphealth;
		
		count += 1;
	}	
	
	public String getName() {
		
		return this.name;
	}
	
	public String getType() {
		
		return this.type;
	}
	
	public int getHealth() {
		
		return this.health;
	}
	
	public void setHealth(int inputHealth) {
		
		this.health = inputHealth;
	}
	
	public void attackPokemon(Pokemon otherpokemon) {
		
		if (otherpokemon == this) {
			
			System.out.println("Can not attack self");
			return;
		}
		otherpokemon.setHealth(otherpokemon.getHealth()-10);
		
		
	}
}
