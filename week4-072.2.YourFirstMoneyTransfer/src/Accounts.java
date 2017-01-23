
public class Accounts {

    public static void main(String[] args) {
        Account A2 = new Account("Matt's account", 1000.00);
        Account A3 = new Account("My account", 0.00);
        
        A2.withdrawal(100.00);
        A3.deposit(100.00);
        
        System.out.println(A2);
        System.out.println(A3);
        
    }

}
