package Printer;

public class Main {
    public static void main(String[] args) {

        Printer myPrinter = new Printer();
        System.out.println(myPrinter);

        System.out.println(myPrinter.printPages(10));
        System.out.println(myPrinter.printPages(20));
        System.out.println(myPrinter.printPages(40));
        myPrinter.getTotal();

    }
}
