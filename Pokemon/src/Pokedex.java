import java.util.*;
public class Pokedex extends AbstractPokemon {
	
	private ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();
	
	public Pokemon createPokemon(String inputName, String inputType, int inputhealth) {
		
		Pokemon mon = super.createPokemon(inputName, inputType, inputhealth);
		myPokemons.add(mon);
		
		return mon;
		
	}
	public void listPokemon() {
		
		for(int i = 0; i < this.myPokemons.size(); i++) {
			
			System.out.println(myPokemons.get(i).getName());
		}
	}
}
