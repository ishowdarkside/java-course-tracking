package SmartKitchen;

public class Refrigerator {

    private boolean hasWorkToDo;


    public void orderFood(){
        if(hasWorkToDo){
        System.out.println("Ordering Food...");
        this.hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
}
