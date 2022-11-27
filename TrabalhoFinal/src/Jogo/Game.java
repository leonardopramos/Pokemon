package Jogo;

import java.util.List;

public class Game {
    public static final Game game = new Game();
    private int ptsjg1, ptsjg2;
    private Deck cardDeckJg1, cardDeckJg2;
    private int jogador;
    private List<GameListener> observers;

    public static Game getGame(){
        return game;
    }

    public Game(){
        ptsjg1 = 0;
        ptsjg2 = 0;
        cardDeckJg1 = new Deck();
        cardDeckJg2 = new Deck();
        jogador = 1;
    }

    public void proxJogador(){
        jogador++;
        if(jogador == 3){
            jogador = 1;
        }
    }

    public void play(Deck deckAcionado){
        GameEvent gameEvent = null;
        if(deckAcionado == cardDeckJg1){
            if (jogador != 1) {
				gameEvent = new GameEvent(this, GameEvent.Target.GWIN, GameEvent.Action.INVPLAY, "2");
				for (var observer : observers) {
					observer.notify(gameEvent);
				}
			}else {
                cardDeckJg1.

                proxJogador();
            }
        }
    }

}
