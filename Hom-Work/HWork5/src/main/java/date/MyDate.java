package date;

/**
 *
 * @author msi3
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
    }
    
    

    public MyDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day <= 31 && day > 0){
            this.day = day;

        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month <= 12 && month > 0){
            this.month = month;
        }
        
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year <= 2023 && year > 0){
            this.year = year;
        }
        
    }

    @Override
    public String toString() {
        return " MyDate{ " + day + " \\ " + month + " \\ " + year + " }";
    }
    
    
    
}
