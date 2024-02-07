import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] deckOfCards = new String[4][13];
        String[] numbers = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack","queen", "king"};
        String[] suits = {"hearts", "diamonds", "clubs", "spades"};
        String[] hands = {"A", "B", "C", "D"};

        // shuffling number values
        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int randomIndexToSwap = r.nextInt(numbers.length);
            String n = numbers[randomIndexToSwap];
            numbers[randomIndexToSwap] = numbers[i];
            numbers[i] = String.valueOf(n);
        }
            // shuffling suits values
        for (int j = 0; j < suits.length; j++) {
            int randomIndexToSwap = r.nextInt(suits.length);
            String s = suits[randomIndexToSwap];
            suits[randomIndexToSwap] = suits[j];
            suits[j] = String.valueOf(s);
        }

        for (int l = 0; l <= 13; l++) {
            for (int j = 0; l <= 4; l++) {
                deckOfCards[j][l] = numbers[l] + " of " + suits[j];
            }
        }


    }



    }


