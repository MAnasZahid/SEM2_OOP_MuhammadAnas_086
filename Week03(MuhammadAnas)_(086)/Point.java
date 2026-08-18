public class Point {

    private double xCoord;
    private double yCoord;
    private static int totalPoints = 0;

    public Point() {
        this(0, 0);
    }

    public Point(double xCoord, double yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        totalPoints++;
    }

    public Point(Point source) {
        this(source.xCoord, source.yCoord);
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public void setX(double xCoord) {
        this.xCoord = xCoord;
    }

    public void setY(double yCoord) {
        this.yCoord = yCoord;
    }

    public void setCoordinates(double xCoord, double yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public Point plus(Point other) {
        return new Point(this.xCoord + other.xCoord, this.yCoord + other.yCoord);
    }

    public Point minus(Point other) {
        return new Point(this.xCoord - other.xCoord, this.yCoord - other.yCoord);
    }

    public double distanceTo(Point other) {
        double dx = this.xCoord - other.xCoord;
        double dy = this.yCoord - other.yCoord;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public boolean equals(Point other) {
        return this.xCoord == other.xCoord && this.yCoord == other.yCoord;
    }

    public static int totalCreated() {
        return totalPoints;
    }

    @Override
    public String toString() {
        return "(" + xCoord + ", " + yCoord + ")";
    }
}
