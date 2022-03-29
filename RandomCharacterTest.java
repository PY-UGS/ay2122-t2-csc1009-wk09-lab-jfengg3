import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import static org.junit.Assert.*;

public class RandomCharacterTest {

    RandomCharacter rc = new RandomCharacter();

    // Test lower case
    @Test
    public void getRandomLowerCaseLetter() {
        char c = rc.getRandomLowerCaseLetter();
        assertTrue(Character.isLowerCase(c));
    }

    // Test upper case
    @Test
    public void getRandomUpperCase() {
        char c = rc.getRandomUpperCaseLetter();
        assertTrue(Character.isUpperCase(c));
    }

    // Test if digit
    @Test
    public void getRandomDigitCharacter() {
        char c = rc.getRandomDigitCharacter();
        assertTrue(Character.isDigit(c));
    }

    // Test for all characters (letters, digit)
    @Test
    public void getRandomCharacter() {
        char c = rc.getRandomCharacter();
        assertTrue(Character.isLetterOrDigit(c));
    }

    // Test if it's prime
    @Test
    public void checkPrime() {

        boolean prime = false;
        int n = rc.getPrime();

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = true;
                break;
            }
        }

        assertTrue(!prime);

    }

}
