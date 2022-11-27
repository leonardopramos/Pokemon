package Pokemons;

import Habilidades.HNormal;
import Habilidades.HPrincipal;
import Tipo.Tipo;
import Tipo.TipoPokemon;

public class PokemomAgua extends Pokemom {

    public enum Pok{
        SQUIRTLE, BLASTOISE
    };

    public static TipoPokemon tipoPrincipal = TipoPokemon.AGUA;;
    public PokemomAgua(Tipo tipo2, int vida, HNormal basica, HPrincipal tHabilidade) {
        super(tipo2, vida, basica, tHabilidade);

    }
    
}
