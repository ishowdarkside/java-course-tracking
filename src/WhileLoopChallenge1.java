public class WhileLoopChallenge1 {
    public static void main(String[] args){

        int num = 4;
        int totalEvenNum = 0;
        int totalOddNum = 0;
        while (num <=20) {
            num++;
            if(totalEvenNum == 5) break;
            if(isEvenNumber(num)) totalEvenNum++;
            if(!isEvenNumber(num)) {
                totalOddNum++;
                continue;
            };
            System.out.println(num + " " + isEvenNumber(num));
        };

        System.out.println("Total even numbers: " + totalEvenNum + ". Total Odd numbers: " + totalOddNum);
    }

    public static boolean isEvenNumber(int num){
        if(num % 2 != 0) return false;
        return true;
    }
}
