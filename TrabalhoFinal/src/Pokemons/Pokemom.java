package Pokemons;

import Habilidades.HNormal;
import Habilidades.HPrincipal;
import Tipo.Tipo;

public class Pokemom {
    private Tipo tipoSecundario;
    private HNormal habilidadeBasica;
    private HPrincipal tHabilidade;
    private int vida; 
    
    public Pokemom(Tipo tipo2, int vida, HNormal basica, HPrincipal tHabilidade){
        this.tipoSecundario = tipo2;
        this.vida = vida;
        this.habilidadeBasica =  basica;
        this.tHabilidade = tHabilidade;
    }


    public Tipo getTipo2(){
        return tipoSecundario;
    }

    public int getVida(){
        return vida;
    }
}
