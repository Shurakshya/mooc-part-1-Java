
import java.util.ArrayList;
import java.util.Collections;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal) {

        if (!(meals.contains(meal))) {
            Collections.addAll(meals, meal);

        }
    }

    public void printMeals() {
        for (String nameOfMeals : meals) {
            System.out.println(nameOfMeals);
        }
    }

    public void clearMenu() {
     meals.clear();
     }
}
