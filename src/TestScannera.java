import java.util.Scanner;

public class TestScannera {
    public static void main(String[] args) {
    promptForData(2023);
    }

    public static void promptForData(int currentYear){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your birth year");

        boolean isValidAge = false;
        int age = 0;
        do{
            System.out.println("Input correct date of birth");
            try{
            String promptBirthYear = scanner.nextLine();
            age = checkAge(Integer.parseInt(promptBirthYear),currentYear);
            if(age != -1) isValidAge = true;
            }catch(NumberFormatException err) {
                System.out.println("Input valid data");
            }
        }while(!isValidAge);

        System.out.println("So you are " + age + " years old");
    }

    public static int checkAge(int birthYear,int currentYear) {
        int age = currentYear - birthYear;
        if(age > 125 || age < 0 ) return -1;
        return age;
    }
}
