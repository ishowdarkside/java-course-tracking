package SmartKitchen;

public class Main {
    public static void main(String[] args) {

    SmartKitchen  smartKitchen = new SmartKitchen();

    /*
    smartKitchen.getDishWasher().setHasWorkToDo(true);
    smartKitchen.getFridge().setHasWorkToDo(true);
    smartKitchen.getCoffeeMaker().setHasWorkToDo(true);

    smartKitchen.getFridge().orderFood();
    smartKitchen.getCoffeeMaker().brewCoffee();
    smartKitchen.getDishWasher().doDishes();*/

    smartKitchen.setKitchenState(true,false,true);
    smartKitchen.doKitchenWork();
    }
}
