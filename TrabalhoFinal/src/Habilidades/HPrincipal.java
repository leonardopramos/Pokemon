package Habilidades;
import Tipo.Tipo;

public class HPrincipal extends Habilidade{
    private Tipo tipo;
    public HPrincipal(int dano, int quantidadeUsos, Tipo tipo) {
        super(dano,  quantidadeUsos);
        this.tipo = tipo;
    }

    public Tipo getTipo(){
        return tipo;
    }
}
