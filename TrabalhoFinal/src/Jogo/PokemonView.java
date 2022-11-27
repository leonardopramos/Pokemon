package Jogo;
import Pokemons.Pokemom;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javafx.scene.control.Button;

public class PokemonView extends Button implements PropertyChangeListener{
    private Pokemom pokemon;
    private PokemonView thisCardView;
    private PokemonViewListener observer;

    public PokemonView(Pokemom aCard) {
		super("", ImageFactory.getInstance().createImage("imgBck"));

		pokemon = aCard;
		pokemon.addPropertyChangeListener(this);
		thisCardView = this;

		this.setOnAction(e -> {
			if (observer != null) {
				observer.handle(new CardViewEvent(thisCardView));
			}
		});
	}

	public void setCardViewObserver(PokemonViewListener obs) {
		observer = obs;
	}

	public Pokemom getCard() {
		return pokemon;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (pokemon.isFacedUp()) {
			this.setGraphic(ImageFactory.getInstance().createImage(card.getImageId()));
		}	
	}
}
