public class Student implements Cloneable {
    private String studentID;
    private String name;
    private Address homeinfo;
    private Date dob; // date of birth
   

    public Student(){
        this.studentID = "UNKNOWN";
        this.name = "UNKNOWN";
        this.homeinfo = new Address("N/A" , "N/A" ,"N/A" , 000000);
        this.dob = new Date(00 , "Unknown" , 0000);
        
    }

    

    public Student(String id , String name , Address homeinfo , Date dob){
        this.studentID = id;
        this.name = name;
        this.homeinfo = homeinfo;
        this.dob = dob;
    }

    //deep copy
    public Student (Student obj){
    this.studentID= obj.studentID;
    this.name=obj.name;
    this.homeinfo = new Address(obj.homeinfo.gethomeaddress(), obj.homeinfo.getCity(),obj.homeinfo.getState(),obj.homeinfo.getZipcode());
    this.dob = new Date(obj.dob.getDay(),obj.dob.getMonth(),obj.dob.getYear());


}
@Override
public Object clone() throws CloneNotSupportedException{

    Student copy = (Student) super.clone();
    copy.homeinfo = new Address(copy.homeinfo.gethomeaddress(), copy.homeinfo.getCity(),copy.homeinfo.getState(),copy.homeinfo.getZipcode());
    copy.dob = new Date(copy.dob.getDay(),copy.dob.getMonth(),copy.dob.getYear());

    return copy;


}
    @Override
    public String toString(){
        return "ID: " + ( studentID != null ? studentID : "Not assigned") + "\n" +
               "Name: " + (name != null ? name : "Not assigned") + "\n" +
               "Address: " + (homeinfo != null ? homeinfo : "Not assigned") + "\n" +
               "DOB: " + (dob != null ? dob : "Not assigned");
    }
    
}