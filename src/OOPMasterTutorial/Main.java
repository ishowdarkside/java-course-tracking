package OOPMasterTutorial;

public class Main {

    public static void main(String[] args) {

        /*
        Burger burger = new Burger("regular",4.00);
        burger.addTopings("bacon","cheese","Mayo");
        burger.printItem();*/


        /*
        MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerTopings("BACON","CHEESE","MAYO");
        regularMeal.printItemizedList();*/

        MealOrder secondMeal = new MealOrder("Turkey","7-up","chili");
        secondMeal.addBurgerTopings("LETTUCE","CHEESE","MAYO");
        secondMeal.setDrinkSize("SMALL");

        secondMeal.printItemizedList();
    }
}
