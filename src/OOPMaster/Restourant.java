package OOPMaster;

public class Restourant {

    private Order order;

    public Restourant(){
        this.order = Restourant.orderMeal("coca-cola","small","cheese burger",4.51);

    }
    private static Order orderMeal(String drinkType,String drinkSize,String burgerType,double burgerPrice){
        return new Order(new Drink(drinkType,drinkSize),new Burger(burgerType,burgerPrice),new SideItem());
    }

    @Override
    public String toString() {
        return "Restourant{ " +
                "order:" + order +
                '}';
    }

    public void getTotalPrice(){
        order.getTotalPrice();
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

    public void getTotalPrice(){
        System.out.println("TOTAL: " + (this.drink.getPrice() + this.sideItem.getPrice() + this.burger.getPrice()));
    }
}
