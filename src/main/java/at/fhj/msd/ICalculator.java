package at.fhj.msd;

public interface ICalculator {

  /** add 2 numbersnumbers
   * 
   * @param number1
   * @param number2
   * @return result of number1 + number2
   * @throws IllegalArgumentException if number1 or number2 is not a number
   * @throws ArithmeticException if number2 is 0
   * @throws NullPointerException if number1 or number2 is null
   */
  public abstract double add(double number1, double number2);
  /**
   * 
   * @param number1
   * @param number2
   * @return result  of number1 - number2
   * @throws IllegalArgumentException if number1 or number2 is not a number
   * @throws ArithmeticException if number2 is 0
   */
  public abstract double minus(double number1, double number2);
  /**
   * 
   * @param number1
   * @param number2
   * @return result of number1 / number2
   * @throws IllegalArgumentException if number1 or number2 is not a number
   * @throws ArithmeticException if number2 is 0
   */
  public abstract double divide(double number1, double number2);
  /**
   * 
   * @param number1
   * @param number2
   * @return result of number1 * number2
   * @throws IllegalArgumentException if number1 or number2 is not a number
   * @throws ArithmeticException if number2 is 0
   */
 
  public abstract double multiply(double number1, double number2);

  int factorial(int n);

}




