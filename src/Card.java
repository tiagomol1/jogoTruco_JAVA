// representa uma carta de baralho
public class Card {
    private final String face;  // valor de face da carta (As, dois, tres ...)
    private final String suit;  // naipe da carta (Ouros, Paus, ...)

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    // retorna a representação em String da Carta
    // "As de Ouros", "Tres de Copas"
    @Override
    public String toString() {
        return face + " de " + suit;
    }
}
