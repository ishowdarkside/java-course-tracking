import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {

      int myAge = getInputFromScanner(2023);
      System.out.println("I am " + myAge + " years old");
    }


    public static int getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what is your name?");
        String name = scanner.nextLine();
        System.out.println("What is your birth year?");
        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + currentYear);
            try{
            age = checkData(currentYear,scanner.nextLine());
            validDOB = age < 0 ? false : true;
            }catch(NumberFormatException badUserData){
                System.out.println("Characters are not allowed. Try again!");
            }
        }while(!validDOB);
    return age;
        }


    public static int checkData(int currentYear,String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if(dob < minimumYear || dob > currentYear) return -1;

        return (currentYear - dob);
    }
}
