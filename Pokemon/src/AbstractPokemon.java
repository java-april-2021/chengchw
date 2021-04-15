
public abstract class AbstractPokemon implements PokemonInterface {

	@Override
	public Pokemon createPokemon(String name, String type, int health) {
		// TODO Auto-generated method stub
		
		Pokemon PK1 = new Pokemon(name,type,health);
		
		return PK1;
	}

	@Override
	public String pokemonInfo(Pokemon pokemon) {
		// TODO Auto-generated method stub
		
		
		String opStr = String.format("The Pokemon is %s, its name is %s which has %s health", pokemon.getType(), pokemon.getName(), pokemon.getHealth());
		System.out.println(opStr);
		return opStr;
	}
	
}
