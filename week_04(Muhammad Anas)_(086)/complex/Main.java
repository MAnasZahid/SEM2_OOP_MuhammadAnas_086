public class Main {
    public static void main(String[] args) {
        Complex zero = new Complex();
        Complex first = new Complex(3, 4);
        Complex second = new Complex(1, -2);
        Complex copyOfFirst = new Complex(first);

        System.out.println("Zero: " + zero);
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("Copy of first: " + copyOfFirst);

        System.out.println("First + Second = " + first.add(second));
        System.out.println("First - Second = " + first.subtract(second));
        System.out.println("First * Second = " + first.multiply(second));
        System.out.println("First / Second = " + first.divide(second));

        System.out.println("Magnitude of first: " + first.magnitude());
        System.out.println("Angle of first: " + first.angleDegrees() + " degrees");
        System.out.println("Conjugate of first: " + first.conjugate());

        System.out.println("First equals copy: " + first.equals(copyOfFirst));
        System.out.println("First equals second: " + first.equals(second));

        System.out.println("Total complex numbers created: " + Complex.totalCreated());

        try {
            Complex divisor = new Complex(0, 0);
            Complex result = first.divide(divisor);
        } catch (ArithmeticException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}
