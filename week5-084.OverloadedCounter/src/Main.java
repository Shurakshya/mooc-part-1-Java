public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter A = new Counter(10, false);
        Counter B = new Counter(25);
        Counter C = new Counter(false);
        Counter D = new Counter();
        //Counter c = new Counter(900, false);
        
        Counter c = new Counter(2, true);
        c.decrease(4);
        System.out.println(c);
        
        A.decrease(2);
        
        B.decrease();
        
        
        c.decrease();
        System.out.println(c);
       
        System.out.println(A);
        System.out.println(B);
    }
}
