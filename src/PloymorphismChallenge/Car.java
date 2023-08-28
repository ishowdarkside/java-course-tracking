package PloymorphismChallenge;

public class Car {

    private String description;
    protected boolean isStarted;
    public Car(String description){
        this.isStarted = false;
        this.description = description;
    }

    public void startEngine(){
        if(this.isStarted)  this.isStarted = false;
        else if(!this.isStarted){
            this.isStarted = true;
            System.out.println("Starting engine");
        }
    }

    public void drive(){
        System.out.println(this.getClass().getSimpleName());
        if(!this.isStarted) System.out.println("Engine is not started");
        else if(this.isStarted){
            this.runEngine();
        }
    }

    protected void runEngine(){
        System.out.println("Running engine");
    }


}
