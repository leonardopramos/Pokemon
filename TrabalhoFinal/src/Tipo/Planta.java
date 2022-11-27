package Tipo;

public class Planta extends Tipo{
    public Planta(){
        this.addFraquesa(TipoPokemon.FOGO);
        this.addVantagem(TipoPokemon.AGUA);
        this.addImunidade(TipoPokemon.ELETRICO);

    }
}
