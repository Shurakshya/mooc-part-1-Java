import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String help = "";
        boolean result = false;
        int length = text.length();
        while (length != 0){
            char character = text.charAt(length-1);
            length--;
            help = help + character; 
        
       } 
        if(help.equalsIgnoreCase(text)){
            result=true;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
