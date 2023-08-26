package Printer;

public class Printer {

    private static int totalPagesPrinted;
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(){
        this.tonerLevel = 100;
        this.pagesPrinted = 0;
        this.duplex = false;

    }


    public int addToner(int tonerAmount){
        if(tonerAmount <= 0) return -1;
        if((tonerAmount + this.tonerLevel) > 100) return -1;
        this.tonerLevel += tonerAmount;

        return this.tonerLevel;
    };

    public String printPages(int pageNum){
        if(this.tonerLevel <=0) return ("NO TONER IN PRINTER!");


        if(duplex){
            this.tonerLevel -= 1;
            System.out.println("Its duplex printer");
            pagesPrinted += (pageNum / 2) + (pageNum % 2) ;
            return pageNum  + " pages printed on " + pageNum / 2 + " papers";
        }
        else{
            this.tonerLevel -= 1;
            pagesPrinted += pageNum;
            totalPagesPrinted +=pageNum;
            System.out.printf("Printed in total %d %n",this.pagesPrinted);
            return pageNum + " pages printed on " + pageNum + " papers";
        }



    }

    public void setDuplex(boolean val ){
        this.duplex = val;
    }

    public void getTotal(){
        System.out.println(totalPagesPrinted);
    }
    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevel=" + tonerLevel +
                ", pagesPrinted=" + pagesPrinted +
                ", duplex=" + duplex +
                '}';
    }
}
