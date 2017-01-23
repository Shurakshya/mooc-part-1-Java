
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Practice with the initial questions 
        LyyraCard myCard = new LyyraCard(6.00);
        
        System.out.println(myCard);
        
        myCard.payEconomical(2.50);
        System.out.println(myCard);
        
        myCard.payEconomical(2.50);
        myCard.payGourmet(4.00);
        System.out.println(myCard);
        
        myCard.loadMoney(50);
        System.out.println(myCard);
        myCard.loadMoney(-10);
        System.out.println(myCard); */
        
        
        LyyraCard pekka = new LyyraCard(20);
        
        LyyraCard brian = new LyyraCard(30);
        
        
        
        pekka.payGourmet();
        brian.payEconomical();
        
        System.out.println("Pekka: "+  pekka);
        System.out.println("Brian: " + brian);
        
        pekka.loadMoney(20.00);
        brian.payGourmet();
        
        System.out.println("Pekka: "+  pekka);
        System.out.println("Brian: " + brian);
        
        pekka.payEconomical();
        pekka.payEconomical();
        
        brian.loadMoney(50.00);
        System.out.println("Pekka: "+  pekka);
        System.out.println("Brian: " + brian);
        
        
    } 
}
