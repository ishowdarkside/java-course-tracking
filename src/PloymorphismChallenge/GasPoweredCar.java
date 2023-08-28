package PloymorphismChallenge;

public class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description,double avgKmPerLitre,int cylinders){
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("Driving gas powered car specifially");

    }

    @Override
    public void startEngine(){
        super.startEngine();
        System.out.printf("POSTO JE OVO BENZINAC OTISLO TI JE SAD %f OGRIVA%n", this.avgKmPerLitre);

    }

    @Override
    protected void runEngine(){
        System.out.printf("Running engine! Rotating  %d cylinders",this.cylinders);
    }


}
