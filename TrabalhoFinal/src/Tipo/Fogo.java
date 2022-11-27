package Tipo;

public class Fogo extends Tipo{
    public Fogo(){
        this.addFraquesa(TipoPokemon.AGUA);
        this.addVantagem(TipoPokemon.PLANTA);
        this.addImunidade(null);
    }
    
}
