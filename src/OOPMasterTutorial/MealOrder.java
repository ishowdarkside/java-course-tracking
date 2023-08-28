package OOPMasterTutorial;

public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;


    public MealOrder(){
        this("regular","coke","fries");
    }
    public MealOrder(String burgerType,String drinkType,String sideType){
        this.burger = new Burger(burgerType,4.0);
        this.drink = new Item("drink",drinkType,1.00);
        this.side = new Item("side",sideType,1.50);
    };

    public double getTotalPrice(){
        return this.side.getAdjustedPrice() + this.drink.getAdjustedPrice() + this.burger.getAdjustedPrice();

    }

    public void printItemizedList(){
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE",this.getTotalPrice());
    }

    public void addBurgerTopings(String extra1, String extra2, String extra3){
        burger.addTopings(extra1,extra2,extra3);
    }

    public void setDrinkSize(String size){

    }
}
