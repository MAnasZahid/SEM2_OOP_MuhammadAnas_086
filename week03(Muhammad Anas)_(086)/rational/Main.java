public class Main {
    public static void main(String[] args) {
        Rational zero = new Rational();
        Rational half = new Rational(1, 2);
        Rational third = new Rational(1, 3);
        Rational copyOfHalf = new Rational(half);

        System.out.println("Zero: " + zero);
        System.out.println("Half: " + half);
        System.out.println("Third: " + third);
        System.out.println("Copy of half: " + copyOfHalf);

        System.out.println("Half + Third = " + half.add(third));
        System.out.println("Half - Third = " + half.subtract(third));
        System.out.println("Half * Third = " + half.multiply(third));
        System.out.println("Half / Third = " + half.divide(third));

        Rational unsimplified = new Rational(4, 8);
        System.out.println("4/8 simplified: " + unsimplified.simplify());

        System.out.println("Reciprocal of Half: " + half.reciprocal());
        System.out.println("Half as decimal: " + half.toDecimal());

        System.out.println("Half equals copy: " + half.equals(copyOfHalf));
        System.out.println("Half equals Third: " + half.equals(third));

        System.out.println("Total rationals created: " + Rational.totalCreated());

        try {
            Rational bad = new Rational(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}
