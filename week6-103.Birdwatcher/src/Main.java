
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    
        Scanner reader = new Scanner(System.in);
        DatabaseObservation birdData = new DatabaseObservation();

        while(true){
            String userInput;
            System.out.println("?");
            userInput = reader.nextLine();

             if(userInput.equalsIgnoreCase("Quit")){
                break;  
            }
             else if(userInput.equalsIgnoreCase("Add")){
                addBird(reader,birdData );
            }
             else if(userInput.equalsIgnoreCase("Observation")){
                System.out.println("What was observed ?");
                String birdName = reader.nextLine();
                increaseCount(birdName, birdData);
            }
             else if(userInput.equalsIgnoreCase("Statistics")){
                birdData.statistics();     
            }
             else if(userInput.equalsIgnoreCase("show")){
                 System.out.println("Which bird ? ");
                 String birdName = reader.nextLine();
                 showBird(birdName, birdData);
            }
        }
    }

        public static void addBird(Scanner reader, DatabaseObservation birdData){
            System.out.println("Name: ");
            String inputName = reader.nextLine();
            System.out.println("Latin Name:");
            String inputLatinName = reader.nextLine();
            birdData.Add(inputName, inputLatinName);
        }

        public static void increaseCount(String b, DatabaseObservation birdData){
            for(Bird bird : birdData.getBirds()){
                if (bird.getName().equalsIgnoreCase(b) || bird.getLatinName().equalsIgnoreCase(b)) {
                    bird.increaseCount();
                    return;
                }
            }
            System.out.println("Is not a bird!");
        }

        private static void showBird(String birdName, DatabaseObservation birdData){
            for (Bird bird : birdData.getBirds()) {
                if (bird.getName().equalsIgnoreCase(birdName) || bird.getLatinName().equalsIgnoreCase(birdName)) {
                    System.out.println(bird);
                    return;
                }
            }
            System.out.println("Is not a bird!");
            
        }

}



