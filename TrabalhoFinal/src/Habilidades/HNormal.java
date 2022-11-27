package Habilidades;

import Tipo.Tipo;

public class HNormal extends Habilidade{
    
    private Tipo tipo;

    public HNormal(int dano, int quantidadeUsos) {
        super(dano, quantidadeUsos);
        this.tipo = null;
    }

    public Tipo getTipo(){
        return tipo;
    }
}
