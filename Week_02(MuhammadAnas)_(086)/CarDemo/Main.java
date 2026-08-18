public class Main{
    public static void main(String[]args){
        Car bmw=new Car();
        bmw.displaystates();

        Car ferarri=new Car();
        ferarri.displaystates();
        
        bmw.setdetails("Black","BMW");
        ferarri.setdetails("Red","Ferarri");

        bmw.startengine();
        bmw.displaystates();

        ferarri.startengine();
        ferarri.displaystates();
        
        bmw.acceleration(40);
        bmw.displaystates();

        ferarri.acceleration(90);
        ferarri.displaystates();

        bmw.turnRight();
        bmw.displaystates();

        ferarri.turnLeft();
        ferarri.displaystates();

        bmw.turbo();
        bmw.displaystates();

        ferarri.turbo();
        ferarri.displaystates();

        bmw.driftmode();
        bmw.displaystates();

        ferarri.driftmode();
        ferarri.displaystates();

        bmw.breakes();
        bmw.displaystates();

        ferarri.stopengine();
        ferarri.displaystates();
        
    }
}

// Memory Diagram:

// STACK MEMORY                                     HEAP MEMORY

// +----------------------------+                   +----------------------------------+
// |  main() Frame              |                   | String[] Object (args)           |
// |                            |                   |                                  |
// |  args ----------+----------+------------------>| [ ]                              |
// |                 |          |                   +----------------------------------+
// |                 |          |
// |  bmw -----------+----------+------------------>+----------------------------------+
// |                 |          |                   | Car Object #1 (bmw)              |
// |                 |          |                   |                                  |
// |  ferarri -------+--+       |                   |  speed: 0.0                      |
// |                 |  |       |                   |  angle: 180.0                    |
// +-----------------+--|-------+                   |  colour:("Black")                |
//                      |                           |  brand:("BMW")                   |
//                      |                           |  turboMode: false                |  
//                      |                           |  engineON:  false                |  
//                      |                           |  fuel: 100                       |  
//                      |                           |  direction:("forward")           |
//                      |                           +----------------------------------+  
//                      |                                                                 
//                      +--------------------------->+----------------------------------+ 
//                                                  | Car Object #2 (ferarri)          | 
//                                                  | Address: 0x300                   | 
//                                                  |  speed: 0.0                      | 
//                                                  |  angle: 180.0                    | 
//                                                  |  colour:("Red")                  |
//                                                  |  brand:("Ferarri")               | 
//                                                  |  turboMode: false                | 
//                                                  |  engineON:  false                |  
//                                                  |  fuel: 100                       | 
//                                                  |  direction:("forward")           |
//                                                  +----------------------------------+  
//                                                                                          
//                                                 
