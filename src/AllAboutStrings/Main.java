package AllAboutStrings;

public class Main {
    public static void main(String[] args) {
       String helloWorld = "Hello World";
       System.out.printf("Index of l = %d %n",helloWorld.indexOf('l',3));


       String helloWorldLower = helloWorld.toLowerCase();
       if(helloWorld.equals(helloWorldLower)) System.out.println("They mmaatch exact");
       if(helloWorld.equalsIgnoreCase(helloWorldLower)) System.out.println("They match when ingored case");
       System.out.println("HelloWorld".startsWith("Hello"));
       System.out.println("HelloWorld".contains("World"));

       if(helloWorld.contentEquals("Hello World")) System.out.println("samee");
    }

    public static void printInformation (String string){
        int length = string.length();
        System.out.printf("Length = %d %n",length);

        if(string.isEmpty()) {
             System.out.println("String is empty");
            return;
        }

        if(string.isBlank()) {
            System.out.println("String is blank");
        }
        System.out.printf("First char = %c %n",string.charAt(0));
        System.out.printf("Last char = %c %n",string.charAt(length -1));
    }
}
