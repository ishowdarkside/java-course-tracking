public class WhileLoop {

    public static void main(String[] args){

/*
        int j = 1;
        boolean isReady = false;


        do{
            if(j > 5) break;
            j++;
            isReady = j >0;
            System.out.println(j);
        }while (isReady);
        */


        int number = 0;
        while(number < 50) {
            number += 5;
            if(number % 25 == 0 ) continue;
            System.out.print(number + "_");
        }
    }
}
