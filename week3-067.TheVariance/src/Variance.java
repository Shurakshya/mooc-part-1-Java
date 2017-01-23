import java.util.ArrayList;

public class Variance {

    public static int sum(ArrayList<Integer> list) {
        int i=0, sum =0;
        while (i < list.size()){
            int num = list.get(i);
            sum = num + sum;
            i++;
        }
        return sum;
    }

    
    public static double average(ArrayList<Integer> list) {
        double average =(double) sum(list)/ list.size();      
        return average;
    }
       
    

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double square = 0.00;
        double variance =0.00;
        double ave = average(list);
        
        for(int i=0;i< list.size();i++){    
            double num = Math.pow(list.get(i)- ave,2);
            square = num + square;       
        }
        
        
        variance = square/(list.size()-1);
        
        return  variance;
    }
        
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        
        System.out.println("The variance is: " + variance(list));
    }

}
