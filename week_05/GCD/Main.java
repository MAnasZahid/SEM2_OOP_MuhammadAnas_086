import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();

        // Object instantiation
        gcd calculator = new gcd(n1, n2);

        // Display results using object behaviors
        System.out.println("The GCD of " + calculator.getNum1() + " and " + calculator.getNum2() + " is: " + calculator.getGCD());

        scanner.close();
    }
}