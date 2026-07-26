public class Main{
    public static void main(String[]args){
        Car bmw=new Car();
        Car ferarri=new Car();
        
        bmw.setdetails("Black","BMW");
        ferarri.setdetails("Red","Ferarri");

        bmw.startengine();
        bmw.displaystate();


        ferarri.startengine();
        ferarri.displaystate();
        
        bmw.acceleration(40);
        bmw.displaystate();

        ferarri.acceleration(90);
        ferarri.displaystate();

        bmw.turnRight();
        bmw.displaystate();

        ferarri.turnLeft();
        ferarri.displaystate();

        bmw.turbo();
        bmw.displaystate();

        ferarri.turbo();
        ferarri.displaystate();

        bmw.driftmode();
        bmw.displaystate();

        ferarri.driftmode();
        ferarri.displaystate();

        bmw.breakes();
        bmw.displaystate();

        ferarri.stopengine();
        ferarri.displaystate();

        


        
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