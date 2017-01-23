import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        

        Collections.addAll(list1, 2, 3);

        Collections.addAll(list2, 5, 10, 4 , 3, 7);
        //combine = list1.addAll(list2);
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }
    public static void smartCombine(ArrayList<Integer>number1, ArrayList<Integer>number2){
         
         number2.removeAll(number1);
         number1.addAll(number2);
    }

}
