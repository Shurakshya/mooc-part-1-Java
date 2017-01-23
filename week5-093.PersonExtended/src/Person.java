import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name){
        int currentDay= Calendar.getInstance().get(Calendar.DATE);
        int currentMonth=Calendar.getInstance().get(Calendar.MONTH) + 1; 
        int currentYear= Calendar.getInstance().get(Calendar.YEAR);
        this.name = name;
        this.birthday = new MyDate(currentDay, currentMonth,currentYear);
    }
    
    
    public int age() {     
        int currentDay= Calendar.getInstance().get(Calendar.DATE);
        int currentMonth=Calendar.getInstance().get(Calendar.MONTH) + 1; 
        int currentYear= Calendar.getInstance().get(Calendar.YEAR);
        MyDate currentDate = new MyDate(currentDay, currentMonth,currentYear); 
        int age = birthday.differneceInYears(currentDate);
        return age;
    }
    
    public boolean olderThan(Person compared) {
        Person p = new Person(this.name, birthday.getDay(),birthday.getMonth(),birthday.getYear());
        MyDate pAge = p.birthday;
        MyDate comparedAge = compared.birthday;
        if(pAge.earlier(comparedAge)){
            return true;
        }else{
            return false;
        }   
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
