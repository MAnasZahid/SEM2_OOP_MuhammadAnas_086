public class Triangle {

    private Point vertexA;
    private Point vertexB;
    private Point vertexC;
    private static int totalTriangles = 0;

    public Triangle(Point vertexA, Point vertexB, Point vertexC) {
        if (!formsTriangle(vertexA, vertexB, vertexC)) {
            throw new IllegalArgumentException("Given points cannot form a triangle");
        }
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        this.vertexC = vertexC;
        totalTriangles++;
    }

    public Triangle(Triangle source) {
        this(new Point(source.vertexA), new Point(source.vertexB), new Point(source.vertexC));
    }

    private static boolean formsTriangle(Point p1, Point p2, Point p3) {
        double ab = p1.distanceTo(p2);
        double bc = p2.distanceTo(p3);
        double ca = p3.distanceTo(p1);
        return ab + bc > ca && bc + ca > ab && ca + ab > bc;
    }

    public Point getVertexA() {
        return vertexA;
    }

    public Point getVertexB() {
        return vertexB;
    }

    public Point getVertexC() {
        return vertexC;
    }

    public double lengthAB() {
        return vertexA.distanceTo(vertexB);
    }

    public double lengthBC() {
        return vertexB.distanceTo(vertexC);
    }

    public double lengthCA() {
        return vertexC.distanceTo(vertexA);
    }

    public double angleAtA() {
        return angleBetween(lengthAB(), lengthCA(), lengthBC());
    }

    public double angleAtB() {
        return angleBetween(lengthAB(), lengthBC(), lengthCA());
    }

    public double angleAtC() {
        return angleBetween(lengthBC(), lengthCA(), lengthAB());
    }

    private double angleBetween(double sideOne, double sideTwo, double oppositeSide) {
        double cosineValue = (Math.pow(sideOne, 2) + Math.pow(sideTwo, 2) - Math.pow(oppositeSide, 2))
                / (2 * sideOne * sideTwo);
        return Math.round(Math.toDegrees(Math.acos(cosineValue)) * 100.0) / 100.0;
    }

    public double slopeAB() {
        return (vertexB.getY() - vertexA.getY()) / (vertexB.getX() - vertexA.getX());
    }

    public double slopeBC() {
        return (vertexC.getY() - vertexB.getY()) / (vertexC.getX() - vertexB.getX());
    }

    public double slopeCA() {
        return (vertexA.getY() - vertexC.getY()) / (vertexA.getX() - vertexC.getX());
    }

    public boolean isEquilateral() {
        return lengthAB() == lengthBC() && lengthBC() == lengthCA();
    }

    public boolean isIsosceles() {
        return lengthAB() == lengthBC() || lengthBC() == lengthCA() || lengthCA() == lengthAB();
    }

    public String classifyBySides() {
        if (isEquilateral()) {
            return "Equilateral";
        } else if (isIsosceles()) {
            return "Isosceles";
        }
        return "Scalene";
    }

    public String classifyByAngles() {
        double largest = Math.max(angleAtA(), Math.max(angleAtB(), angleAtC()));
        double epsilon = 0.01;
        if (Math.abs(largest - 90) < epsilon) {
            return "Right";
        } else if (largest > 90) {
            return "Obtuse";
        }
        return "Acute";
    }

    public double perimeter() {
        double total = lengthAB() + lengthBC() + lengthCA();
        return Math.round(total * 100.0) / 100.0;
    }

    public double area() {
        double a = lengthAB();
        double b = lengthBC();
        double c = lengthCA();
        double s = (a + b + c) / 2.0;
        double raw = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return Math.round(raw * 100.0) / 100.0;
    }

    public static int totalCreated() {
        return totalTriangles;
    }

    @Override
    public String toString() {
        return "Triangle[A=" + vertexA + ", B=" + vertexB + ", C=" + vertexC + "]";
    }
}
