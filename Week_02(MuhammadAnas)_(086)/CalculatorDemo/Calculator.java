public class Calculator{
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double add() {
        return num1 + num2;
    }
    public double subtract() {
        return num1 - num2;
    }
    public double multiply() {
        return num1 * num2;
    }
    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed");
            
            
        }
    }
    public double modulus() {
        if (num2 != 0) {
            return num1 % num2;
        } else {
            throw new ArithmeticException("Modulus by zero is not allowed");
           
        }
    }
    
    public double average() {
        return (num1 + num2) /2;
    }
    

        public void showInfo() {
            System.out.println("Number 1: " + num1);
            System.out.println("Number 2: " + num2);  
            System.out.println("X-----------------------------------------------X");
            System.out.println();  
    }


    public void showadd() {
            System.out.println("Addition: " + add());
            System.out.println("X-----------------------------------------------X");
            System.out.println();
    }

     public void showsub() {
            System.out.println("Subtraction: " + subtract());
            System.out.println("X-----------------------------------------------X");
            System.out.println();
    }

     public void showmulti() {
            System.out.println("Multiplication: " + multiply());
            System.out.println("X-----------------------------------------------X");
            System.out.println();
    }

     public void showdiv() {
        try {
            System.out.println("Division: " + divide());
            System.out.println("X-----------------------------------------------X");
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

     public void showmod() {
        try {
            System.out.println("Modulus: " + modulus());
            System.out.println("X-----------------------------------------------X");
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

     public void showavg() {
            System.out.println("Average: " + average());
            System.out.println("X-----------------------------------------------X");
            System.out.println();
    }

}