package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * CalculatorImpl.java
 * 
 * @author Mario Shenouda
 * @version 1.0
 * @since 2023-10-01
 */
public class CalculatorImpl implements ICalculator {

    private static final Logger logger = LogManager.getLogger(CalculatorImpl.class);

    /**
     * Easy Calculator for first steps in test automation for Educational Usage
     */
    /**
     * Default constructor
     */
    public CalculatorImpl() {

    }

    /*
     * (non-Javadoc)
     * 
     * @see at.fhj.itm.demo.Calculator#add(java.lang.double, java.lang.double)
     */
    /**
     * Adds two numbers together.
     * 
     * @param number1 the first number
     * @param number2 the second number
     * @return the sum of the two numbers
     * @throws IllegalArgumentException if either number is not a valid number
     * @throws ArithmeticException if the result is not a valid number
     */
    @Override
    public double add(double number1, double number2) {
        logger.debug("Aufruf von add() mit Parametern: number1 = " + number1 + ", number2 = " + number2);
        return number1 + number2;
    }

    /*
     * (non-Javadoc)
     * 
     * @see at.fhj.itm.demo.Calculator#minus(java.lang.double, java.lang.double)
     */
    /**
     * Subtracts the second number from the first number.
     * 
     * @param number1 the first number
     * @param number2 the second number
     * @return the difference of the two numbers
     * @throws IllegalArgumentException if either number is not a valid number
     * @throws ArithmeticException if the result is not a valid number
     */

    @Override
    public double minus(double number1, double number2) {
        logger.debug("Aufruf von subtract() mit Parametern: number1 = " + number1 + ", number2 = " + number2);

        return number1 - number2;
    }

    /*
     * (non-Javadoc)
     * 
     * @see at.fhj.itm.demo.Calculator#divide(java.lang.double, java.lang.double)
     */
    /** 
   * Divides the first number by the second number.
   *@param number1
   * @param number2
   * @return result of number1 / number2
   * @throws IllegalArgumentException if number1 or number2 is not a number
   * @throws ArithmeticException if number2 is 0
    */
    @Override
    public double divide(double number1, double number2) {
        logger.debug("Aufruf von divide() mit parametern: number1=" + number1+", number2= "+number2);
        if(number2 == 0 || Double.isNaN(number1 / number2) || Double.isInfinite(number1 / number2)) {
            logger.error("Fehler: Division durch Null oder ungültige Division! number1 = " + number1 + ", number2 = " + number2);
            throw new ArithmeticException("Division durch Null ist nicht erlaubt");
        }
        double result = number1 / number2;
        logger.debug("Ergebnis der Division: " + result);

        return result;
    }
    
    

    /*
     * (non-Javadoc)
     * 
     * @see at.fhj.itm.demo.Calculator#multiply(java.lang.double, java.lang.double)
     */
    /** 
     * Multiplies two numbers together.
   * @param number1
   * @param number2
   * @return result of number1 * number2
   * @throws IllegalArgumentException if number1 or number2 is not a number
   * @throws ArithmeticException if number2 is 0
    */
    @Override
    public double multiply(double number1, double number2) {
        logger.debug("Aufruf von multiply() mit Parametern: number1 = " + number1 + ", number2 = " + number2);

        return number1 * number2;
    }

    @Override
    /**
     * Calculates the factorial of a number.
     * 
     * @param n the number to calculate the factorial of
     * @return the factorial of the number
     * @throws IllegalArgumentException if n is negative
     */
public int factorial(int n) {
   if (n<0)
   return 0;
   
   if  (n<=1)   
   return 1;
   else
   return n * factorial(n-1);
   
    
}

}
