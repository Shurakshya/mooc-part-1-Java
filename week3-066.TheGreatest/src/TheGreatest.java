
import java.util.ArrayList;
import java.util.Collections;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> lista) {
        // write code here
        ArrayList<Integer> greatestList = new ArrayList<Integer>();
        
            int greatest = Collections.max(lista);             
              return greatest;
        }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(5);
        
 
        System.out.println("The greatest number is: " + greatest(lista));
    }
}