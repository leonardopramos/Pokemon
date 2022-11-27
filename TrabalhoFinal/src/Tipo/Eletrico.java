package Tipo;

public class Eletrico extends Tipo{
    public Eletrico(){
        this.addFraquesa(TipoPokemon.PLANTA);
        this.addVantagem(TipoPokemon.AGUA);
        this.addImunidade(null);
    }
}
