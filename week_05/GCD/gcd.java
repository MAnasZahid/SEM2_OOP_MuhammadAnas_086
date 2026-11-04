public class gcd {
    
    private int num1;
    private int num2;

    
    public gcd(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getter methods
    public int getNum1() { return num1; }
    public int getNum2() { return num2; }


public void setNum1(int num1) { this.num1 = num1; }
    public void setNum2(int num2) { this.num2 = num2; }

    
    private int computeEuclideanGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return computeEuclideanGCD(b, a % b);
    }

    public int getGCD() {
        
        int a = Math.abs(this.num1);
        int b = Math.abs(this.num2);
        return computeEuclideanGCD(a, b);
    }


}