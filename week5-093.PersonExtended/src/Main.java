public class Main {
  public static void main(String[] args) {
        Person pekka = new Person("Pekka", 15, 2, 1983);
        Person steve = new Person("steve", 1, 3, 1955);
        Person martin = new Person("Martin", 1, 3, 1983);
        
        Person peter = new Person("Peter", new MyDate(15, 2, 1983));
        Person steved = new Person("Steved");

        System.out.println( steve.getName() + " age " + steve.age() + " years");
        System.out.println( pekka.getName() + " age " + pekka.age() + " years");
        System.out.println( martin.getName() + " age " + martin.age() + " years");
        
        System.out.println( martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka) );
        System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) );
        
        System.out.println( peter );
        System.out.println( steved );
    
      
      
    
  }
}