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

    public void setY(double  yCoord) {
        this.yCoord = yCoord;
    }

    public void setCoordinates(double xCoord, double yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public Point plus(Point obj) {
        return new Point(this.xCoord + obj.xCoord, this.yCoord + obj.yCoord);
    }

    public Point minus(Point obj) {
        return new Point(this.xCoord - obj.xCoord, this.yCoord - obj.yCoord);
    }

    double distanceTo(Point obj) {
        return Math.sqrt(Math.pow(this.xCoord-obj.xCoord,2) + Math.pow(this.yCoord-obj.yCoord,2));
    }

    public boolean equals(Point obj) {
        return this.xCoord == obj.xCoord && this.yCoord == obj.yCoord;
    
    }
     Point midPoint(Point obj){
        return new Point((this.xCoord+obj.xCoord)/2 ,(this.yCoord+obj.yCoord)/2);
     }

    public static int totalCreated() {
        return totalPoints;
    }

     double slope(Point obj){
        if(this.xCoord!=obj.xCoord)
            return (this.xCoord-obj.xCoord)/(this.yCoord-obj.yCoord);
        else 
            return Double.POSITIVE_INFINITY;
    }


    public String toString() {
        return String.format("x is: "+this.xCoord+" y is: "+this.yCoord+ "  object count is: "+Point.totalCreated());
    }


    public void show(){
        System.out.println(toString());
        System.out.println("-------");
}
}
