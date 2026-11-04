public class Date {
    private int day;
    private String month;
    private int year;

    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }

    public String getMonth(){
        return month;
    }
    public void setMonth(String month){
        this.month=month;

    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;

    }


    public Date(){
        this.day = 0;
        this.month = "N/A";
        this.year = 0;
    }

    public Date(int d , String m , int y){
        this.day = d;
        this.month =m;
        this.year = y;

    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }


    
}