public class ForLoop {
    public static void main(String[] args) {

        for(double rate = 7.5;rate <=10; rate += 0.25){
            if(rate > 8.5) break;
        double interesetAmount =  calculateInterest(100, rate);
        System.out.println("$100 at " + rate  + "% intereset = $" + interesetAmount);

        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
