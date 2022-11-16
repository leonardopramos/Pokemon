import java.util.Random;

import Pokemons.Pokemons;

public class App {
    
    public static void main(String[] args) {
        Random r = new Random();
        
        Pokemons p1 = new Pokemons("Pikachu" ,"Elétrico", 100, 250);
        Pokemons p2 = new Pokemons("Charmander","Fogo", 120, 300);

        //simulação batalha

        System.out.println(p1.getNome());
        System.out.println(p1.getTipoPokemon());
        System.out.println(p1.getPoderDeAtaque());
        System.out.println(p1.getVida());

        System.out.println("------------------------------------------------------");

        System.out.println(p2.getNome());
        System.out.println(p2.getTipoPokemon());
        System.out.println(p2.getPoderDeAtaque());
        System.out.println(p2.getVida());

        System.out.println("Ataque acontecendo" + "\n");
        
        p1.atacar(p2);

        System.out.println("Segundo ataque: " + "\n");

        p1.atacar(p2);


    }
}
