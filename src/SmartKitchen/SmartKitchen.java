package SmartKitchen;

public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator fridge;

    public SmartKitchen(){
        this.coffeeMaker = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.fridge = new Refrigerator();
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getFridge() {
        return fridge;
    }

    public void setKitchenState(boolean coffeeFlag,boolean fridgeFlag,boolean dishwasherFlag){
        coffeeMaker.setHasWorkToDo(coffeeFlag);
        fridge.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishwasherFlag);
    }

    public void doKitchenWork(){
        coffeeMaker.brewCoffee();
        fridge.orderFood();
        dishWasher.doDishes();
    }
}
