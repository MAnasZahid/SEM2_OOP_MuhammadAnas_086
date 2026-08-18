public class Complex {

    private double real;
    private double imaginary;
    private static int totalComplexNumbers = 0;

    public Complex() {
        this(0, 0);
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
        totalComplexNumbers++;
    }

    public Complex(Complex source) {
        this(source.real, source.imaginary);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        return new Complex(real + other.real, imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(real - other.real, imaginary - other.imaginary);
    }

    public Complex multiply(Complex other) {
        double newReal = real * other.real - imaginary * other.imaginary;
        double newImaginary = real * other.imaginary + imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    public Complex divide(Complex other) {
        double denominator = Math.pow(other.real, 2) + Math.pow(other.imaginary, 2);
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by a complex number with zero magnitude");
        }
        double newReal = (real * other.real + imaginary * other.imaginary) / denominator;
        double newImaginary = (imaginary * other.real - real * other.imaginary) / denominator;
        return new Complex(newReal, newImaginary);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double angleDegrees() {
        return Math.toDegrees(Math.atan2(imaginary, real));
    }

    public Complex conjugate() {
        return new Complex(real, -imaginary);
    }

    public boolean equals(Complex other) {
        return real == other.real && imaginary == other.imaginary;
    }

    public static int totalCreated() {
        return totalComplexNumbers;
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        }
        return real + " - " + Math.abs(imaginary) + "i";
    }
}
