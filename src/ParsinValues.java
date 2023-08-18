public class ParsinValues {
    public static void main (String[] args){
        int currentYear = 2023;
        try{
        int myAge = calcMyAge(currentYear);
        System.out.println("So you are " + myAge + " years old?");

        }catch(Exception e){
            System.out.println("DOSLO JE DO ERRORA");
        };
    }

    public static int calcMyAge(int currYear){
        int birthYear = Integer.parseInt(System.console().readLine("What is your birth year "));
        return currYear - birthYear;
    }
}