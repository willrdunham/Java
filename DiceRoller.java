import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Roll the dice (generate a random number between 1 and 6)
        int diceRoll = random.nextInt(6) + 1;

        // Print the result
        System.out.println("You rolled a " + diceRoll);
    }
}
