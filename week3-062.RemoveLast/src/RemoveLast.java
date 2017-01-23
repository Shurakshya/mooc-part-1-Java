import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {
    //private static ArrayList<String> persons;
    public static void removeLast(ArrayList<String> list) {
        int i = list.size();
        list.remove(i-1);
        
    }
    public static void main(String[] args) {
        // Here an example what you can do with the method 
        ArrayList<String> list = new ArrayList<String>();
        list.add("Pekka");
        list.add("James");
        list.add("Liz");
        list.add("Brian");

        System.out.println("Persons:");
        System.out.println(list);

        // sort the persons
        Collections.sort(list);

        /*int i = list.size();
        list.remove(i-1);*/
        
    

        // and remove the last
        removeLast(list);
        System.out.println(list);
    }
        
    }


