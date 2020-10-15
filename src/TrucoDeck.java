import java.security.SecureRandom;

// representa um baralho de truco
public class TrucoDeck {
    private Card[] deck; // vetor de cartas - o baralho em si
    private int currentCard; // posicao da carta a ser distribuda
    private final int NUMBER_OF_CARDS = 40; // número de cartas

    public TrucoDeck() {
        String[] faces = { "As", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete",
                            "Valete", "Dama", "Rei" };
        String[] suits = { "Ouros", "Espadas", "Copas", "Paus" };

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        // preenche o baralho com as cartas
        int cardIndex = 0;
        for (int i = 0; i < suits.length; i++) { // para cada naipe
            for (int j = 0; j < faces.length; j++) { // para cada valor
                deck[cardIndex++] = new Card(faces[j], suits[i]);
            }
        }
    }

    // distribui carta
    public Card dealCard() {
        // se ainda houver alguma carta para distribuir
        if (currentCard < deck.length) {
            return deck[currentCard++]; // retorna carta e incrementa o contador de cartas
        }

        return null;
    }

    // embaralha as cartas com uma passagem
    public void shuffle() {
        currentCard = 0;
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < deck.length; i++) {
            // trocar a carta em questão por uma carta aleatória
            int j = random.nextInt(NUMBER_OF_CARDS); // num. aleatório

            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }
}
