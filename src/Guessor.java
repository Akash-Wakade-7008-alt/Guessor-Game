import java.util.*;
/**
 * Represents the Guessor in the game.
 *
 * <p>The Guessor is responsible for choosing a number that players
 * attempt to predict.</p>
 */
 public class Guessor
{
    /**
     * The number guessed by the Guessor.
     */
    int gnum;

    /**
     * Prompts the Guessor to input a number.
     *
     * <p>This value is later used by the {@link Umpire} to compare
     * against player predictions.</p>
     */
    void guessTheNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guessor! Kindly guess the number:");
        gnum = sc.nextInt();
    }
}