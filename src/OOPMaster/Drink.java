package OOPMaster;

public class Drink {
    private String drinkType;
    private String drinkSize;
    private double drinkPrice;

    public Drink(String drinkType,String drinkSize){
        this.drinkType = drinkType;
        this.drinkSize = drinkSize;
        switch(drinkSize){
            case "small" -> this.drinkPrice = 2.99;
            case "medium" -> this.drinkPrice = 4.99;
            case "large" -> this.drinkPrice = 5.99;
            default -> System.out.println("Unknown drink size");
        }

    }

    @Override
    public String toString() {
        return "{" +
                "drinkType:'" + drinkType + '\'' +
                ", drinkSize:'" + drinkSize + '\'' +
                ", drinkPrice:" + drinkPrice +
                '}';
    }

    public double getPrice(){
        return this.drinkPrice;
    }
}
