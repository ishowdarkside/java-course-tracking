public class OOP1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setMake("PorScHE");
        myCar.setModel("Carrera");
        myCar.setDoors(2);
        myCar.setConvertible(true);
        myCar.setColor("Black");
        myCar.describeCar();


        Car carTarga = new Car();
        carTarga.setMake("Porsche");
        carTarga.setModel("Targa");
        carTarga.setColor("Red");
        carTarga.setDoors(2);
        carTarga.setConvertible(false);
        carTarga.describeCar();
    }
}
