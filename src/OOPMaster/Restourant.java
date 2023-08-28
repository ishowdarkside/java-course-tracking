package OOPMaster;

public class Restourant {

    private Order order;

    public Restourant(){
        this.order = Restourant.orderMeal("coca-cola","small",2.99);


    }
    private static Order orderMeal(String drinkType,String drinkSize,double drinkPrice){
        return new Order(new Drink(drinkType,drinkSize  ,drinkPrice),new Burger(),new SideItem());
    }

    @Override
    public String toString() {
        return "Restourant{ " +
                "order:" + order +
                '}';
    }
}


class Order {
    private Drink drink;
    private Burger burger;
    private SideItem sideItem;

    public Order(Drink drink, Burger burger, SideItem sideItem){
        this.drink = drink;
        this.burger = burger;
        this.sideItem = sideItem;
    }

    @Override
    public String toString() {
        return "{" +
                "drink:" + drink +
                ", burger:" + burger +
                ", sideItem:" + sideItem +
                '}';
    }
}
