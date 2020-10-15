public class Player {
    private Card[] hand; // mao do jogador (suas cartas)
    private final int HAND_SIZE = 3;
    private int currentCard;

    public Player() {
        hand = new Card[HAND_SIZE];
        currentCard = 0;
    }

    public void receiveCard(Card card) {
        if (currentCard < HAND_SIZE) { // se a mao ainda não esta cheia
            hand[currentCard++] = card;
        }
    }

    public Card playCard(int index) {
        Card temp = hand[index]; // recupero a carta escolhida
        hand[index] = null; // remove a carta da mao
        return temp; // retorna a carta escolhida
    }

    /*
    imprimir as tres cartas do jogador lado a lado com indice
    (0) As de Copas (1) Dois de Paus (2) Quatro de Ouros
     */
    @Override
    public String toString() {
        String player = "";
        for (int i = 0; i < hand.length; i++) {
            player += "(" + i + ") " + hand[i] + " ";
        }
        return player;
    }
}
