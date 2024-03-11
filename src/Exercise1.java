import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    private static Logger logger = LoggerFactory.getLogger(Exercise1.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(1, 10);
        }
        logger.info(Arrays.toString(numbers));

        while (true) {
            try {
                System.out.println("Scegli la posizione (partendo da 0) per sostituire in numero random");
                int position = Integer.parseInt(sc.nextLine());
                numbers[position] = new Random().nextInt(1, 10);
                logger.info(Arrays.toString(numbers));
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                logger.error(e.getMessage());
            } catch (NumberFormatException e) {
                logger.error("The input is not a number");
            } catch (Exception e) {
                System.err.println(e);
                logger.error("Something went wrong");
            }
        }
        sc.close();
    }
}