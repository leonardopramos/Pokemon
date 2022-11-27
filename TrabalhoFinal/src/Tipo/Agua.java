package Tipo;

public class Agua extends Tipo{
    public Agua(){
        this.tipo = TipoPokemon.AGUA;
        this.addVantagem(TipoPokemon.FOGO);
        this.addFraquesa(TipoPokemon.ELETRICO);
        this.addFraquesa(TipoPokemon.PLANTA);
        this.addImunidade(null);
    }

    public TipoPokemon getTipo(){
        return tipo;
    }

}   
