public class Rational {

    private int numerator;
    private int denominator;
    private static int totalRationals = 0;

    public Rational() {
        this(0, 1);
    }

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        totalRationals++;
    }

    public Rational(Rational source) {
        this(source.numerator, source.denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        this.denominator = denominator;
    }

    private static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a == 0 ? 1 : a;
    }

    public Rational simplify() {
        int divisor = gcd(numerator, denominator);
        int newNum = numerator / divisor;
        int newDen = denominator / divisor;
        if (newDen < 0) {
            newNum = -newNum;
            newDen = -newDen;
        }
        return new Rational(newNum, newDen);
    }

    public Rational add(Rational other) {
        int newNum = numerator * other.denominator + other.numerator * denominator;
        int newDen = denominator * other.denominator;
        return new Rational(newNum, newDen).simplify();
    }

    public Rational subtract(Rational other) {
        int newNum = numerator * other.denominator - other.numerator * denominator;
        int newDen = denominator * other.denominator;
        return new Rational(newNum, newDen).simplify();
    }

    public Rational multiply(Rational other) {
        int newNum = numerator * other.numerator;
        int newDen = denominator * other.denominator;
        return new Rational(newNum, newDen).simplify();
    }

    public Rational divide(Rational other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Cannot divide by a rational equal to zero");
        }
        int newNum = numerator * other.denominator;
        int newDen = denominator * other.numerator;
        return new Rational(newNum, newDen).simplify();
    }

    public Rational reciprocal() {
        return new Rational(denominator, numerator);
    }

    public double toDecimal() {
        return (double) numerator / denominator;
    }

    public boolean equals(Rational other) {
        return numerator * other.denominator == denominator * other.numerator;
    }

    public static int totalCreated() {
        return totalRationals;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
