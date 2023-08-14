public class Main {
    public static void main(String[] args){
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("your score is less than 5000 and greater than 1000");
        }
        else if(score < 1000) {
            System.out.println("Your score was less then 1000");
        }
        else{
            System.out.println("Its not less than 5000");
        }

    }
}
