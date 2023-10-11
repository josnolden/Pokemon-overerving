import java.util.List;

public class PokemonTrainer {
    String name;
    List<Pokemon> pokemons;
    public PokemonTrainer(String nameInput, List<Pokemon> pokemonsInput){
        this.name = nameInput;
        this.pokemons = pokemonsInput;
    }
    public String getName(){
        return name;
    }
    public List<Pokemon> getPokemons(){
        return pokemons;
    }
}
