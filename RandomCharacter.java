import java.util.Random;

public class RandomCharacter {

    public static void main(String[] args) {

        int i = 0;
        String ans = "";

        RandomCharacter rc = new RandomCharacter();

        while (i < 15) {
            ans += rc.getRandomCharacter();
            i++;
        }

        System.out.println(ans);

    }

    // Generates a random lower case letter
    public char getRandomLowerCaseLetter() {

        Random rand = new Random();
        char c = (char) (rand.nextInt(26) + 'a');

        return c;

    }

    // Generates a random upper case letter
    public char getRandomUpperCaseLetter() {

        return Character.toUpperCase(getRandomLowerCaseLetter());
    }

    // Generates a random digit character
    public char getRandomDigitCharacter() {

        Random rand = new Random();

        int randDigit = rand.nextInt(10);
        // Check if generated number is a prime number
        while (checkPrime(randDigit) != true) {
            randDigit = rand.nextInt(10);
        }

        return Character.forDigit(randDigit, 10);

    }

    // Generates a character
    public char getRandomCharacter() {
        Random rand = new Random();
        int n = rand.nextInt(3 - 1 + 1) + 1;

        if (n == 1) {
            return getRandomLowerCaseLetter();
        } else if (n == 2) {
            return getRandomUpperCaseLetter();
        } else {
            return getRandomDigitCharacter();
        }

    }

    // Checks if it's prime number
    public static boolean checkPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }

    // Generate prime number
    public int getPrime() {

        Random rand = new Random();
        int n = rand.nextInt(100) + 1;

        while (!checkPrime(n)) {
            n = rand.nextInt(100) + 1;
        }

        return n;

    }

}
