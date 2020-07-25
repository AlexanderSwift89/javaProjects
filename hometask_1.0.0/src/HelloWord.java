import java.util.Random;

/**
 * Java. My first program.
 *
 * @author Aleksandr Liapunov
 * @version 1.00 date April 19, 2020
 */

public class HelloWord {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Word " + i + ", random number " + random.nextInt(1000));//output
        }
    }
}
