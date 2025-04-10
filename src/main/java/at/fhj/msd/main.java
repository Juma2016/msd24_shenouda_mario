package at.fhj.msd;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class main {
    private static final Logger logger = LogManager.getLogger(main.class);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ICalculator calculator = new CalculatorImpl(); // Verwendet deine Implementierung


        logger.info("Die Addition wurde erfolgreich ausgeführt.");
        logger.error("Fehler: Versuch, 10 durch 0 zu teilen – Vorgang nicht erlaubt!");

        System.out.println("📢 Willkommen beim Taschenrechner!");

        while (true) {
            System.out.print("\nGib die erste Zahl ein: ");
            double num1 = scanner.nextDouble();

            System.out.print("Gib die zweite Zahl ein: ");
            double num2 = scanner.nextDouble();

            System.out.print("Wähle eine Operation (+, -, *, /) oder 'q' zum Beenden: ");
            char operation = scanner.next().charAt(0);

            if (operation == 'q') {
                System.out.println("🔚 Rechner wird beendet.");
                break;
            }

            double result = 0;
            boolean validOperation = true;

            switch (operation) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.minus(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    try {
                        result = calculator.divide(num1, num2);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Ungültige Operation! Bitte versuche es erneut.");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("✅ Ergebnis: " + result);
            }
        }

        scanner.close();
    }
}
