package Encapsulation;

public class EnhancedPlayer  {

    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName, int healthPercentage, String weapon) {
        this.fullName = fullName;
        if(healthPercentage <= 0) healthPercentage = 1;
        if(healthPercentage > 100) healthPercentage = 100;
        this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }

    public EnhancedPlayer(String fullName){
        this(fullName,100,"Sword");
    }


    public void loseHealth(int damage){
        healthPercentage -= damage;
        if(healthPercentage <=0) System.out.println("Player knocked out of game");
    }

    public int healthRemaining(){
        return this.healthPercentage;
    }



    public void restoreHealth(int extraHealth) {
        if(healthPercentage == 100) return;
        healthPercentage += extraHealth;
    }
}
