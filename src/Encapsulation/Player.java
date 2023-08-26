package Encapsulation;

public class Player {

    public String fullName;
    public int health;
    public String weapon;


    public void loseHealth(int damage){
         health -= damage;
         if(health <=0) System.out.println("Player knocked out of game");
    }

    public int healthRemaining(){
        return this.health;
    }



    public void restoreHealth(int extraHealth) {
        if(health == 100) return;
        health += extraHealth;
    }



}
