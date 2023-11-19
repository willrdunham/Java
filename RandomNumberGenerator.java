import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate a random integer
        int randomNumber = random.nextInt();

        System.out.println("Random Number: " + randomNumber);
    }
}
