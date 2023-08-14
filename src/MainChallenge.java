public class MainChallenge {
    public static void main(String[] args) {

        for(int i = 0;i < 10;i++) {
            System.out.println(i);
        }

    }

    public static String getDurationString(int seconds) {

        int minutes = seconds / 60;
        return getDurationString(minutes,seconds);
    };

    public static String getDurationString(int minutes, int seconds){


        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }



}
