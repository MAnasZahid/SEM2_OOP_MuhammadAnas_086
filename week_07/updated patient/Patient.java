import java.util.Objects;
public class Patient {

private String firstName; 
private String lastName; 
private int healthCardNumber;
public Patient() { 
    this("unknown", "unknown", -1);  
}


public Patient(String firstName, String lastName, int healthCardNumber) {

  this.firstName =firstName;
  this.lastName=lastName;
  this.healthCardNumber=healthCardNumber;
}

//this shouldve been in the code to make it function without silent break
@Override
public boolean equals(Object obj){
    if(this==obj){
        return true;
    }
    if(obj==null){
        return true;
    }
    if(!(obj instanceof Patient)){
        return false;
    }
    Patient that = (Patient) obj;
    return(this.firstName==that.firstName && this.lastName.equals(that.lastName) && this.healthCardNumber==that.healthCardNumber);
}

@Override
public int hashCode() {
return Objects.hash(this.firstName,this.lastName,this.healthCardNumber);
}
}