package StringFormating;

public class Main {
    public static void main(String[] args) {
         String bulletIt = "Print a bulleted List:\n" + "\u2022 First Point\n" + "\u2022 Sub point \n";
         System.out.println(bulletIt);

         String text = """
                 Print a bullet List
                 \u2022 First point
                 \u2022 Second point
                 """;
         System.out.println(text);

         int age = 35;
         System.out.printf("You age is %d%n",age);
         int yearOfBirth = 2023 - age;
         System.out.printf("Age = %d, Birth year = %d%n",age,yearOfBirth);

         for (int i = 1;i <= 1000; i *=10){
             System.out.printf("Printing %d %n",i);
         }
         String formattedString = String.format("Your age is %d %s",age,"CIGANE");
         System.out.println(formattedString);
    }
}
