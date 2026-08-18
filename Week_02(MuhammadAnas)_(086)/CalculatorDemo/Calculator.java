public class Calculator{
    private double num1;
    private double num2;
    private static int objectCount = 0;
    private double result;
 

// NULL
    public Calculator() {
        this.num1=0;
        this.num2=0;
        objectCount++;
    }
    // PARAMETERIZED
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.result=0;
        objectCount++;
    }
    // COPY
    public  Calculator(Calculator obj) {
        this.num1=obj.num1;
        this.num2=obj.num2;
        this.result=0;
        objectCount++;
    }
// OBJ COUNT
      public static int ObjectCount() {
        return objectCount;
    }
// GETTERS AND SETTERS
     double getNum1(){
        return this.num1;
    }

    double getNum2(){
        return this.num2;
    }

    void setNum1Num2(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }

    public double add() {
        return this.result=num1 + num2;
    }
    public double subtract() {
        return this.result=num1 - num2;
    }
    public double multiply() {
        return this.result=num1 * num2;
    }
    public double divide() {
        if (num2 == 0) {
             System.out.println("Division by zero is not allowed.");
        } 
           
        return this.result=num1 / num2;
        
        
    }
    public double modulus() {
        if (num2 != 0) {
            return this.result=num1 % num2;
        } else {
            throw new ArithmeticException("Modulus by zero is not allowed");
           
        }
    }
    
    public double average() {
        return this.result=(num1 + num2) /2;
    }


     public String toString() {
        return ("Num 1:"+num1+"\nNum 2:"+num2+"\ncalculate :"+this.result+"\nobject count:"+Calculator.ObjectCount());
    }

    //show consructor
    void show() {
        System.out.println(this.toString());
        System.out.println("X-----------------------------------------------X");
        System.out.println();
    }


}
