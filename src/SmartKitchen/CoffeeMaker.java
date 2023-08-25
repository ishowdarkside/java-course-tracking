package SmartKitchen;

public class CoffeeMaker {

    private boolean hasWorkToDo;


    public void brewCoffee(){
       if(this.hasWorkToDo) {
       System.out.println("Brewing coffeee");
       this.hasWorkToDo = false;
       }
    }

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo  = hasWorkToDo;
    }
}
