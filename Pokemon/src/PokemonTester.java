
public class PokemonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pokedex PD1 = new Pokedex();
		
		Pokemon PM1 = PD1.createPokemon("Apple", "Pickchu", 100);
		Pokemon PM2 = PD1.createPokemon("Orange", "Pudding", 100);
		Pokemon PM3 = PD1.createPokemon("Grapes", "Foxt", 100);
		PD1.listPokemon();
		PD1.pokemonInfo(PM1);
		PM1.attackPokemon(PM3);
		PD1.pokemonInfo(PM3);
		PM1.attackPokemon(PM1);
		PD1.pokemonInfo(PM1);

	}

}
