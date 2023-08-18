import java.util.Scanner;

public class ReadUserInputChallenge {
    public static void main(String[] args) {
        //Create instance of scanner
      Scanner scanner = new Scanner(System.in);
    // varijable counter koja ce da se koristi za odredivanje upisanog broja i conditiona za while loop
      int counter = 1;
      //sum koji ce da bude suma svih vrijednosti
      double sum = 0;

      //dok je counter manji il ili jednak 5, promptuj usera za input, try parseovat input i increasuj counter zajedno sa sumo
      while(counter <= 5){
          System.out.println("Enter number #" + counter + ":");
          String nextNumber = scanner.nextLine();
          try{
              //int number = Integer.parseInt(nextNumber);
              double number = Double.parseDouble(nextNumber);
              counter++;
              sum += number;

          }catch(NumberFormatException err){
              System.out.println("Invalid number");
          }
      }
      System.out.println("Sum of the 5 numbers is " + sum);

    }

}
