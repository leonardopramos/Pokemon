package Tipo;

import java.util.ArrayList;

public class Tipo {
    TipoPokemon tipo;
    ArrayList<TipoPokemon> vantagem;
    ArrayList<TipoPokemon> fraquesa;
    ArrayList<TipoPokemon> imunidade;

    public Tipo(){
        vantagem = new ArrayList<>();
        fraquesa = new ArrayList<>();
        imunidade = new ArrayList<>();
    }

    public void addFraquesa(TipoPokemon fraquesaTipo){
        fraquesa.add(fraquesaTipo);
    }

    public void addVantagem(TipoPokemon vantagemTipo){
        vantagem.add(vantagemTipo);
    }

    public void addImunidade(TipoPokemon imunidadeTipo){
        imunidade.add(imunidadeTipo);
    }

    public ArrayList<TipoPokemon> getFranquesa(){
        return fraquesa;
    }

    public ArrayList<TipoPokemon> getVantagem(){
        return vantagem;
    }

    public ArrayList<TipoPokemon> getImunidade(){
        return imunidade;
    }
}
