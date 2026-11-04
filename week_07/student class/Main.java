public class Main {

    public static void main (String[] args) throws CloneNotSupportedException{

        Address home = new Address("Gulshan" , "sindh", "Karachi" , 75300);
        Date dob = new Date (07 , "october" , 2007);

        Student original = new Student("UA-456", "Umar Ahmed", home, dob);
        Student clone = (Student) original.clone();
        // before mutation
        System.out.println("Original :\n" +original);
        System.out.println("Clone :\n" +clone);
        

        home.setCity("Kashmir");
        dob.setDay(10);

        // after mutation
       System.out.println("Original :\n" +original);
        System.out.println("Clone :\n" +clone);
       
    }
    
}