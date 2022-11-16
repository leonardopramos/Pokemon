package Pokemons;

public class Pokemons extends TiposPokemons{

    private int poderDeAtaque;
    private int vida;
    private String nome;

    public Pokemons(String nome, String tipoPokemon, int poderDeAtaque, int vida) {
        super(tipoPokemon);
        this.nome = nome;
        this.poderDeAtaque = poderDeAtaque;
        this.vida = vida;
    }

    public void atacar(Pokemons p2){
        //primeiro pokemon ataca o segundo
        int aux = p2.getVida() - this.getPoderDeAtaque();
        p2.setVida(aux);
        System.out.println("Vida do pokemon atacado: " + p2.getVida());
    }

    public int getPoderDeAtaque() {
        return poderDeAtaque;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getNome() {
        return nome;
    }
    
}
