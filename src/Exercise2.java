import exceptions.numberLessThanOneException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Exercise2 {
    private static Logger logger = LoggerFactory.getLogger(Exercise1.class);

    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();
    }

    public Exercise2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcola l'efficienza della tua auto");
        System.out.println();
        try {
            System.out.println("Inserisci i chilometri percorsi");
            double km = Double.parseDouble(sc.nextLine());
            System.out.println("Inserisci il consumo di carburante (in litri)");

            double liters = Double.parseDouble(sc.nextLine());
            if (liters < 1) throw new numberLessThanOneException();
            double efficiency = km / liters;

            System.out.println("Il consumo medio è di " + efficiency + "km/l");
        } catch (numberLessThanOneException e) {
            logger.error(e.getMessage());
        } catch (Exception e) {
            System.err.println(e);
            logger.error("Something went wrong");
        }
    }
}
