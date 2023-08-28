package PloymorphismChallenge;

public class ElectricCar extends Car {

    private double avgKmPerCharge = 4.5;
    private int batterySize = 10;


    public ElectricCar(String description,double avgKmPerCharge,int batterySize){
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void drive(){
        super.drive();
        if(this.isStarted) System.out.printf("Driving electric car with battery size %d%n",this.batterySize);
    };

    @Override
    public void startEngine(){
        super.startEngine();
        System.out.printf("Starting engine and taking out %f kw of batter%n",this.avgKmPerCharge);


    };

    @Override
    protected void runEngine(){
        System.out.println("Running electric vehicle");
    }


}
