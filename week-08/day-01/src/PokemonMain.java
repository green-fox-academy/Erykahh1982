import java.util.ArrayList;
import java.util.List;

public class PokemonMain {
  public static void main(String[] args) {
    List<Pokemon> pokemonOfAsh = initializePokemons();

    // Every pokemon has a name and a type.
    // Certain types are effective against others, e.g. water is effective against fire.
    // Ash has a few pokemon.
    // A wild pokemon appeared!

    Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

    // Which pokemon should Ash use?

    System.out.print("I choose you, " + selectingPokemon(pokemonOfAsh, wildPokemon));
  }

  private static List<Pokemon> initializePokemons() {
    List<Pokemon> pokemon = new ArrayList<>();

    pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
    pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
    pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
    pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
    pokemon.add(new Pokemon("Kingler", "water", "fire"));

    return pokemon;
  }

  public static String selectingPokemon(List<Pokemon> listOfPokemons, Pokemon wildPokemon) {
    for (int i = 0; i < listOfPokemons.size(); i++) {
      if (listOfPokemons.get(i).isEffectiveAgainst("leaf")) {
        return listOfPokemons.get(i).name;
      }
    }
    return null;
  }
}


