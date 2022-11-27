package Habilidades;

public class Habilidade {
    private int dano;
    private int quantidadeUsos;

    public Habilidade(int dano ,int quantidadeUsos){
        this.dano = dano;
        this.quantidadeUsos = quantidadeUsos;
    }

    public int getDano(){
        return dano;
    }


    public int getUsos(){
        return quantidadeUsos;
    }
}
