
public class Accounts {

    public static void main(String[] args) {
        Account A1 = new Account("A", 100.00);
        Account A2 = new Account("B", 0.00);
        Account A3 = new Account("C", 0.00);
        transfer(A1, A2, 50.00);
        transfer(A2, A3, 25.00);
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);
    }

    public static void transfer(Account from, Account to, double howMuch) {

        from.withdrawal(howMuch);
        to.deposit(howMuch);

    }

}
