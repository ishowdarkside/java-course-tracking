import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNum = 0;
        int maxNum = 0;
        boolean hasEndedLoop = false;
        while(!hasEndedLoop){
            System.out.println("Enter a number or character to quit");
            try{
            int input  = Integer.parseInt(scanner.nextLine());
            if(minNum == 0 && maxNum == 0) minNum = maxNum = input;
            if(input > maxNum) maxNum = input;
            if(input < minNum) minNum = input;

            }catch(NumberFormatException err){
               hasEndedLoop = true;
            }



        }

        System.out.println("Your max number was " + maxNum + " and your min num was " + minNum);
    }
}
