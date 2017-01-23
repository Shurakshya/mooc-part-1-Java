
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("name: ");
            String username = reader.nextLine();

            if (username.length() == 0) {
                break;
            }
            System.out.println("studentNumber: ");
            String studentId = reader.nextLine();

            list.add(new Student(username, studentId));
        }

        for (Student std : list) {
            System.out.println(std);
            System.out.println();

        }
        for (Student std : list) {
            System.out.println("Give search term: ");
            String input = reader.nextLine();
            if (std.getName().contains(input)) {
                System.out.println(std);

            }

        }
    }
}
