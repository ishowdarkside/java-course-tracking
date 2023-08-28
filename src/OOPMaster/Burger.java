package OOPMaster;

public class Burger {

    private String type;
    private double price = 3.99;
    private String topping1;
    private String topping2;
    private String topping3;

    public Burger(String type,double price){

        this.type = type;
        this.price = price;
        switch(type){
            case "cheese burger" -> {
                this.topping1 = "salad";
                this.topping2 = "ketchup";
                this.topping3 = "mustard";
                this.price += 1;
            }
        }
    }

    public Burger(){
        this.type = "smash burger";
        this.topping1 = "ketchup";
        this.topping2 = "onion";
        this.topping3 = "mustard";
    }

    static DeluxeBurger deluxe(String type,String toppping4,String topping5){
        return new DeluxeBurger(type,toppping4,topping5);
    }

    @Override
    public String toString() {
        return "{" +
                "type:" + type + '\'' +
                ", price:" + price +
                ", topping1:" + topping1 + '\'' +
                ", topping2:" + topping2 + '\'' +
                ", topping3:" + topping3 + '\'' +
                '}';
    }

    public double getPrice(){
        return this.price;
    }
}



class DeluxeBurger extends Burger{
    private String topping4;
    private String topping5;
    public DeluxeBurger(String type,String topping4, String topping5) {
        super(type,6.99);
        this.topping4 = topping4;
        this.topping5 = topping5;

    }



}