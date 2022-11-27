package Jogo;

import javafx.event.Event;

public class PokemonViewEvent extends Event{
    private static final long serialVersionUID = 1138616432432038288L;

	public PokemonViewEvent(PokemonView source) {
		super(source, null, ANY);
	}
	
	public PokemonView getCardView() {
		return (PokemonView) getSource();
    }
    
}
