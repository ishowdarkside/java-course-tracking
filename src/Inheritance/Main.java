package Inheritance;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Generic animal","Huge", 400);
        doAnimalStuff(animal,"Slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");
    }

    public static void doAnimalStuff(Animal animal,String speed){
       animal.move(speed);
       animal.makeNoise();
       System.out.println(animal);
       System.out.println("_ _ _ _");
    }
}
