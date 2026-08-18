public class Main{
    public static void main(String[]args){
        Calculator casio = new Calculator();
        casio.show();
        Calculator claz = new Calculator(10, 5);
        claz.show();
        Calculator citizen = new Calculator(casio);
        citizen.show();
        

        System.out.println("Case 1:");
        casio.show();
       
        System.out.println("Case 2:");
        claz.show();
        
        System.out.println("Case 3:");
        citizen.show();

        casio.setNum1Num2(20, 10);
        casio.show();

        casio.getNum2();
        casio.show();
        
        claz.getNum1();
        claz.show();

        casio.add();
        casio.show();

        // Subtraction
        citizen.subtract();
        citizen.show();

        // Multiplication
        claz.multiply();
        claz.show();

        
        // Division
        claz.divide();
        claz.show();

        // Division by Zero (Edge Case)
        casio.setNum1Num2(20, 0);
        casio.divide();
        casio.show();

        // Modulus
        citizen.modulus();
        citizen.show();

       

    }
}


// Memory Diagram:

// STACK MEMORY                               HEAP MEMORY
                

// +----------------------------+             +----------------------------------+
// |  main() Frame              |             | String[] Object (args)           |
// |                            |             |                                  |
// |  args ----------+----------+------------>| [ ]                              |
// |                            |             +----------------------------------+
// |                            |
// |  Calculator1  --+----------+------------>+----------------------------------+
// |                            |             | Calculator Object #1             |
// |                            |             |  num1: 10.0                      |                                
// |                            |             |  num2: 5.0                       |
// |                            |             +----------------------------------+
// |                            |
// | Calculator2    ------------+------------>+----------------------------------+
// |                            |             | Calculator Object #2             |
// |                            |             |  num1: 20.0                      |
// +----------------------------+             |  num2: 0.0                       |
//                                            +----------------------------------+
//              
//           
