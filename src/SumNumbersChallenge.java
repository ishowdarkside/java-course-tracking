public class SumNumbersChallenge {
    public static void main(String[] args){
    int initiator = 0;
    int counter = 0;
        for(int i = 1; i <= 1000; i++) {

            if(counter == 5) break;

            if(i % 3 == 0 && i % 5 == 0) {
                counter++;
                System.out.println(i);
                initiator += i;
            }

        }

        System.out.println(initiator);

    }
}
