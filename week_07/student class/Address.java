public class Address{
    private String homeaddress;
    private String state;
    private String city;
    private int zipcode;
    public String gethomeaddress(){
        return homeaddress;
    }
    public void sethomeaddress(String homeaddress){
        this.homeaddress = homeaddress;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public int getZipcode(){
        return zipcode;
    }
    public void  setZipcode(int zipcode){
        this.zipcode = zipcode;
    }


    public Address(){
        this.homeaddress = "N/A";
        this.state = "N/A";
        this.city = "N/A";
        this.zipcode = 00000;
    }
    public Address(String home , String state , String city , int zip){
        this.homeaddress = home;
        this.state = state;
        this.city = city;
        this.zipcode = zip;
    }
@Override
    public String toString(){
        return homeaddress + "," + state + "," + city + "," + zipcode;
    }


}