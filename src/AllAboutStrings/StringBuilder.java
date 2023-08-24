package AllAboutStrings;

public class StringBuilder {
    public static void main(String[] args) {

        String helloWorld = "Hello " + "World";
        StringBuilder helloWorldBuilder = new StringBuilder();

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);
    }


    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder = " + builder);
        //System.out.println("length = " + builder.length());
    }
}
