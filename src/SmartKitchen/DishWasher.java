package SmartKitchen;

public class DishWasher {

    private boolean hasWorkToDo;

    public void doDishes(){

        if(this.hasWorkToDo){
        System.out.println("Doing dishes...");
        this.hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
}
