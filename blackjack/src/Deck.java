import java.util.ArrayList;
import java.util.List;

public class Deck {

  List<Card> cardListFull;
  List<Card> deckCards;
  int number;


  public Deck(int number) {
    fullCardlist();
    deckCards = new ArrayList<>();
    this.number = number;

    if (number >= 4) {
      while (deckCards.size() != number) {
        int rand = (int) (Math.random() * cardListFull.size());
        for (int j = 0; j < cardListFull.size(); j++) {
          if ((cardListFull.get(j).cardColor == "Clubs") && (cardListFull.get(j).cardNumber == String.valueOf(rand))) {
            deckCards.add(cardListFull.get(j));
          }
          if ((cardListFull.get(j).cardColor == "Diamonds") && (cardListFull.get(j).cardNumber == String.valueOf(rand))) {
            deckCards.add(cardListFull.get(j));
          }
          if ((cardListFull.get(j).cardColor == "Hearts") && (cardListFull.get(j).cardNumber == String.valueOf(rand))) {
            deckCards.add(cardListFull.get(j));
          }
          if ((cardListFull.get(j).cardColor == "Spades") && (cardListFull.get(j).cardNumber == String.valueOf(rand))) {
            deckCards.add(cardListFull.get(j));
          }
        }
      }
      System.out.println("Cards " + deckCards.size() + "Spades " + String.valueOf(deckCards.contains("Spades"))
              + " Diamonds " + String.valueOf(deckCards.contains("Diamonds")) + " Hearts " + String.valueOf(deckCards.contains("Hearts"))
              + " Clubs " + String.valueOf(deckCards.contains("Clubs")));
    }


      if (number < 4) {
        while (deckCards.size() != number) {
          int rand = (int)(Math.random() * cardListFull.size());
          for (int j = 0; j < cardListFull.size(); j++) {
            if ((cardListFull.get(j).cardColor == "Clubs") && (cardListFull.get(j).cardNumber == String.valueOf(rand))) {
              deckCards.add(cardListFull.get(j));
            }
            if ((cardListFull.get(j).cardColor == "Diamonds") && (cardListFull.get(j).cardNumber == String.valueOf(rand))) {
              deckCards.add(cardListFull.get(j));
            }
            if ((cardListFull.get(j).cardColor == "Spades") && (cardListFull.get(j).cardNumber == String.valueOf(rand))) {
              deckCards.add(cardListFull.get(j));
            }
          }
        }
      }
    System.out.println("Cards "+deckCards.size() + "Spades " + String.valueOf(deckCards.contains("Spades"))
            + " Diamonds "+ String.valueOf(deckCards.contains("Diamonds")) + " Hearts " + String.valueOf(deckCards.contains("Hearts"))
            + " Clubs " + String.valueOf(deckCards.contains("Clubs")));

  }

  public List<Card> fullCardlist() {
    cardListFull = new ArrayList<>();
    List<String> cardNumbers = new ArrayList<>();
    for (int i = 0; i < 9; i++) {
      cardNumbers.add(String.valueOf(i));
    }

    List<String> cardNames = new ArrayList<>();
    cardNames.add("Jack");
    cardNames.add("Queen");
    cardNames.add("King");
    cardNames.add("Ace");

    for (int j = 0; j < cardNumbers.size(); j++) {
      cardListFull.add(new Card("Clubs", String.valueOf(cardNumbers.get(j))));
      cardListFull.add(new Card("Diamond", String.valueOf(cardNumbers.get(j))));
      cardListFull.add(new Card("Hearts", String.valueOf(cardNumbers.get(j))));
      cardListFull.add(new Card("Spades", String.valueOf(cardNumbers.get(j))));
    }
    for (int i = 0; i < cardNames.size(); i++) {
      cardListFull.add(new Card("Clubs", cardNames.get(i)));
      cardListFull.add(new Card("Diamond", cardNames.get(i)));
      cardListFull.add(new Card("Hearts", cardNames.get(i)));
      cardListFull.add(new Card("Spades", cardNames.get(i)));
    }
    return cardListFull;
  }
}
