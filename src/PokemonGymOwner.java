import java.util.List;

public class PokemonGymOwner {
    String name;
    String town;
    List<Pokemon> pokemons;
    public PokemonGymOwner(String nameInput, String townInput, List<Pokemon> pokemonsInput){
        this.name = nameInput;
        this.town = townInput;
        this.pokemons = pokemonsInput;
    }
    public String getName(){
        return this.name;
    }
    public String getTown(){
        return this.town;
    }
    public List<Pokemon> getPokemons(){
        return pokemons;
    }
}
