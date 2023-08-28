package OOPMaster;

public class Drink {
    private String drinkType;
    private String drinkSize;
    private double drinkPrice;

    public Drink(String drinkType,String drinkSize,double drinkPrice){
        this.drinkType = drinkType;
        this.drinkSize = drinkSize;
        this.drinkPrice = drinkPrice;

    }

    @Override
    public String toString() {
        return "{" +
                "drinkType:'" + drinkType + '\'' +
                ", drinkSize:'" + drinkSize + '\'' +
                ", drinkPrice:" + drinkPrice +
                '}';
    }
}
