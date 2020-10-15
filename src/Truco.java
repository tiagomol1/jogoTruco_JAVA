/*
- na classe jogador (Player)
toString ->
imprimir as tres cartas do jogador lado a lado com indice
(0) As de Copas (1) Dois de Paus (2) Quatro de Ouros

- public void printTable()
- Imprime a mão dos dois jogadores e a carta virada

 */
public class Truco {
    private Player player1;
    private Player player2;
    private Card turnedCard;
    private TrucoDeck deck;

    public Truco() {
        player1 = new Player();
        player2 = new Player();
        deck = new TrucoDeck();
    }

    public void startGame() {
        deck.shuffle(); // embaralha as cartas
        // distribui 3 cartas por jogador
        for (int i = 0; i < 3; i++) {
            player1.receiveCard(deck.dealCard());
            player2.receiveCard(deck.dealCard());
        }
        // distribui a carta virada
        turnedCard = deck.dealCard();
    }

    public void printTable() {
        System.out.println("Carta Virada: " + turnedCard);
        System.out.println("Jogador 1: " + player1);
        System.out.println("Jogador 2: " + player2);
    }
}
