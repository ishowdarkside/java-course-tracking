public class primeNumberChallenge {
    public static void main(String[] args) {
        countPrime();
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) return wholeNumber == 2;
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) return false;
        }
        return true;

    }

    public static void countPrime() {
        int counter = 0;
        for (int i = 0; i <= 1000; i++) {
            if (counter == 3) break;
            if (isPrime(i)) counter++;
        }
    }

}
