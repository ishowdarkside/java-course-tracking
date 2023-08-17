public class digitSumChallenge  {

    public static void main(String[] args){

        int num = sumDigits(55);
        System.out.println(num);

    }

    public static int sumDigits(int number){
        if(number < 0) return -1;
        String numString = String.valueOf(number);
        if(numString.length() == 1) return number;
        int sum = 0;
        while(number > 9){
            sum += number % 10;
            number = number / 10;
        }
        sum += number;
        return sum;
    };
}
