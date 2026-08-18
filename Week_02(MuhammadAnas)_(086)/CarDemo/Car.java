public class Car {
    private float speed;
    private String colour;
    private String brand;
    private boolean engineON;
    private float angle;
    private String direction;
    private int fuel;
    private boolean turboMode;
     private static int objectCount = 0;

    // NULL
    public Car() {
        this.speed=0;
        this.angle=180;
        this.colour="unknown";
        this.brand="unknown";
        this.turboMode=false;
        this.engineON=false;
        this.fuel= 100;
        this.direction = "forward";
        objectCount++;
    }
    // PARAMETERIZED 
     Car(float speed,float angle,boolean engineON,String colour,String brand){
        this.speed=speed;
        this.angle=angle;
        this.engineON=engineON;
        this.colour=colour;
        this.brand=brand;
        this.turboMode=false;
        this.fuel= 100;
        this.direction = "forward";
        objectCount++;
     }
    // COPY
      Car(Car obj){
        this.speed=obj.speed;
        this.angle=obj.angle;
        this.engineON=obj.engineON;    
        this.colour=obj.colour;
        this.brand=obj.brand;
        this.turboMode=obj.turboMode;
        this.fuel=obj.fuel;
        this.direction=obj.direction;
        objectCount++;
    }
    //GETTERS AND SETTERS
     public static int ObjectCount(){
        return objectCount;
    }
     float getSpeed(){
       return this.speed;
    }

    
    float getAngle(){
        return this.angle;
    }

    public void setSpeedAngle(float speed,float angle){
        this.speed=speed;
        this.angle=angle;
    }

    public void setdetails(String colour, String brand){
        this.colour=colour;
        this.brand=brand;
    }
    public void startengine(){
        this.engineON=true;
        System.out.println(this.brand + " engine started.");
    }
    public void stopengine(){
        this.speed=0;
        this.engineON=false;
        this.turboMode=false;
        System.out.println(this.brand + " engine stopped.");
    }
    public void fuel() {
        this.fuel = 100;
        
    }

    public void turbo() {
        this.turboMode = true;
        this.speed += 100;
    }
   

    public void acceleration(float acc){
        if(!this.engineON){
            System.out.println("Engine is off. Please start the engine first.");
            return;
        }
        else{
        this.speed+=acc;
        }
    }

    public void breakes(){
        this.speed=0;
        this.turboMode=false;
    }

    public void turnRight(){
        this.direction = "right";
        this.angle+=45;
    }

    public void turnLeft(){
        this.direction = "left";
        this.angle-=45;

    }

    public void driftmode(){
        this.angle+=45;
        if(this.speed>0){
            this.speed=this.speed/2;
        }
        System.out.println(this.brand + " is drifting at an angle of " + this.angle + " degrees."+"at speed of" + this.speed+"km/h");
        
    }


    public String toString(){
        return ("speed is:"+ this.speed+"Km/h" +",\nangle is:"+this.angle+" degrees"+",\nEngine state:"+this.engineON+" \nobject count:"+Car.ObjectCount());
    }
    
    public void displaystates(){
        System.out.println("Brand:"+this.brand);
        System.out.println("Colour:"+this.colour);
        System.out.println(this.toString());
        System.out.println("Fuel:"+this.fuel+"%");
        System.out.println("Direction:"+this.direction);
        System.out.println("turbo mode: "+(this.speed>100));
        System.out.println();
        System.out .println("X----------------------------------------X");
        System.out.println();
    }
}
