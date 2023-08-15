public class Switch {
    public static void main(String[] args){
        int value = 4;
        switch (value) {
            case 1 -> System.out.println("its 1");
            case 2 -> System.out.println("its 2");
            case 3 -> System.out.println("its 3");
            case 4, 5, 6 -> {
                System.out.println("was a 4 or 5 or 6");
                System.out.println("It was actually " + value);
            }
            default -> System.out.println("was not 1, 2, 3, 4, or 5");
        }

        System.out.println(getQuarter("JANUARY"));
    }

    public static String getQuarter(String month){
        return switch (month){
            case "JANUARY", "FEBRUARY", "MARCH" ->"1st";
            case "APRIL", "MAY", "JUNE" ->   "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" ->  "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default ->{yield "None of the above";}
        };
    }
}
