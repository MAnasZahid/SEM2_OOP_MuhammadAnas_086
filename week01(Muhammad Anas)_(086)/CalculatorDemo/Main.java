public class Main{
    public static void main(String[]args){
        Calculator Calculator1 = new Calculator(10, 5);
        Calculator Calculator2 = new Calculator(20, 0);
        

        System.out.println("Case 1:");
        Calculator1.showInfo();
        Calculator1.showadd();
        Calculator1.showsub();
        Calculator1.showmulti();
        Calculator1.showdiv();
        Calculator1.showmod();
        Calculator1.showavg();
       

        System.out.println("Case 2:");
        Calculator2.showInfo();
        Calculator2.showadd();
        Calculator2.showsub();
        Calculator2.showmulti();
        Calculator2.showdiv();
        Calculator2.showmod();
        Calculator2.showavg();
        
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