
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {

        /*Scanner reader = new Scanner(System.in);
        System.out.println("give the account owner name: ");
        String name = reader.nextLine(); */

        Account A1 = new Account("hari", 100.00);

        A1.deposit(20.00);

        System.out.println(A1);

    }

}
