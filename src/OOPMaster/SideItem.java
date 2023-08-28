package OOPMaster;

public class SideItem {

    private String item;
    private String size;

    private double price;

    public SideItem(String item,String size){
        this.item = item;
        this.size = size;
        switch(item){
            case "onion rings" -> this.price = 2.99;
            case "fries" -> this.price = 1.55;
        }
    }

    public SideItem(){
        this.item = "Fries";
        this.size = "small";
        this.price = 2.99;
    }

    @Override
    public String toString() {
        return "{" +
                "item:'" + item + '\'' +
                ", size:'" + size + '\'' +
                '}';
    }

    public double getPrice(){
        return this.price;
    }
}
