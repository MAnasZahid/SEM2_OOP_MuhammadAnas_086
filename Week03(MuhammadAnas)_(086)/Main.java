public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Point Demo ----------");

        Point origin = new Point();
        Point a = new Point(2, 3);
        Point b = new Point(5, 7);
        Point c = new Point(a);

        System.out.println("Origin: " + origin);
        System.out.println("Point A: " + a);
        System.out.println("Point B: " + b);
        System.out.println("Point C (copy of A): " + c);
        System.out.println("A equals C: " + a.equals(c));

        Point sum = a.plus(b);
        Point diff = b.minus(a);

        System.out.println("A + B = " + sum);
        System.out.println("B - A = " + diff);
        System.out.println("Distance A to B: " + a.distanceTo(b));

        System.out.println("Total points created so far: " + Point.totalCreated());
    }
}