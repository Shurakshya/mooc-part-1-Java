
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

   
    public int differneceInYears(MyDate comparedDate) {
        int daysDiff, yearDiff, monthDiff = 0;
        int totalDays = 0;
        MyDate date = new MyDate(this.day,this.month,this.year);
            if(date.earlier(comparedDate)){
                yearDiff = comparedDate.year - date.year;
                monthDiff = comparedDate.month - date.month;
                daysDiff = comparedDate.day - date.day;
                
                totalDays = daysDiff + (monthDiff)*30 + (yearDiff)*365;
            }else{
                yearDiff = date.year-comparedDate.year;
                monthDiff= date.month - comparedDate.month;
                daysDiff = date.day - comparedDate.day;
                
                totalDays= daysDiff + (monthDiff)*30 + (yearDiff)*365;
 
            }
                
        return Math.abs(totalDays)/365;
    }
    
    public int getDay() {
        return this.day;
        
    }
    
    public int getMonth() {
        return this.month;
        
    }
    public int getYear() {
        return this.year;
        
    }
    

  
}