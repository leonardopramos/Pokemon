package Jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import Pokemons.Pokemom;

public class Deck {
    private List<Pokemom> mao;
    public static int NPOKEMONS = 3;
    private Pokemom selected;
    private List<GameListener> observers;
    
    public Deck(){
        mao = new ArrayList<>(NPOKEMONS);
        Random r = new Random();
        selected = null;
    }


    public List<Pokemom> getCards() {
		return Collections.unmodifiableList(mao);
	}

    public int getNumberOfCards() {
		return mao.size();
	}
    
    public void removeSel() {
		if (selected == null) {
			return;
		}
		mao.remove(selected);
		selected = null;
		GameEvent gameEvent = new GameEvent(this, GameEvent.Target.DECK, GameEvent.Action.REMOVESEL, "");
        for (var observer : observers) {
			observer.notify(gameEvent);
		}
	}

    public void setSelectedCard(Pokemom card) {
		selected = card;
	}

	public Pokemom getSelectedCard() {
		return selected;
	}

	public void addGameListener(GameListener listener) {
		observers.add(listener);
	}
}
