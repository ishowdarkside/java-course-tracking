public class Switch {
    public static void main(String[] args){
        int value = 4;
        switch(value){
            case 1:
                System.out.println("its 1");
                break;
            case 2:
                System.out.println("its 2");
                break;
            case 3:
                System.out.println("its 3");
                break;
            case 4 : case 5 : case 6:
                System.out.println("was a 4 or 5 or 6");
                System.out.println("It was actually " + value);
                break;
            default:
                System.out.println("was not 1, 2, 3, 4, or 5");
        }

    }
}
