package at.fhj.msd;

public class main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraktion: " + calc.minus(10, 5));
        System.out.println("Multiplikation: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
        System.out.println("Mario Shenouda");
    }
}
