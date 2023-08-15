public class SwitchChallenge2 {

    public static void main (String[] args) {
    printDayWeek(2);
    }

    public static void getWeekDay(int num){
        String dayOfWeek = switch(num){
            case 0 -> ("Sunday");
            case 1 -> ("Monday");
            case 2 -> ("Tuesday");
            case 3 -> ("Wednesday");
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Not part of the week";
        };
        System.out.println(dayOfWeek);
    }

    public static void printDayWeek(int day){
        String dayOfWeek = "Invalid Day";
        if(day == 0) dayOfWeek = "Sunday";
        if(day == 1) dayOfWeek = "Monday";
        if(day == 2) dayOfWeek = "Tuesday";
        if(day == 3) dayOfWeek = "Wednesday";
        if(day == 4) dayOfWeek = "Thursday";
        if(day== 5) dayOfWeek = "Friday";
        if(day == 6) dayOfWeek = "Saturday";

        System.out.println(day + " stands for " + dayOfWeek);
    }
}
