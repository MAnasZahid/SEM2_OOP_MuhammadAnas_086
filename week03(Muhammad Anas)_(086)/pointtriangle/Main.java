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

        System.out.println("\n---------- Triangle Demo ----------");

        Point vertexA = new Point(0, 0);
        Point vertexB = new Point(4, 0);
        Point vertexC = new Point(0, 3);

        Triangle triangle = new Triangle(vertexA, vertexB, vertexC);

        System.out.println("Vertex A: " + triangle.getVertexA());
        System.out.println("Vertex B: " + triangle.getVertexB());
        System.out.println("Vertex C: " + triangle.getVertexC());

        System.out.println("Side AB: " + triangle.lengthAB());
        System.out.println("Side BC: " + triangle.lengthBC());
        System.out.println("Side CA: " + triangle.lengthCA());

        System.out.println("Angle at A: " + triangle.angleAtA());
        System.out.println("Angle at B: " + triangle.angleAtB());
        System.out.println("Angle at C: " + triangle.angleAtC());

        System.out.println("Slope AB: " + triangle.slopeAB());
        System.out.println("Slope BC: " + triangle.slopeBC());
        System.out.println("Slope CA: " + triangle.slopeCA());

        System.out.println("Classification by sides: " + triangle.classifyBySides());
        System.out.println("Classification by angles: " + triangle.classifyByAngles());

        System.out.println("Perimeter: " + triangle.perimeter());
        System.out.println("Area: " + triangle.area());

        System.out.println(triangle);

        Triangle copy = new Triangle(triangle);
        System.out.println("Copied triangle: " + copy);

        System.out.println("Total triangles created: " + Triangle.totalCreated());
        System.out.println("Total points created overall: " + Point.totalCreated());

        try {
            Point x = new Point(1, 1);
            Point y = new Point(2, 2);
            Point z = new Point(3, 3);
            Triangle invalid = new Triangle(x, y, z);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}
