package AllAboutStrings;

public class StringMethods {

    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("starting index = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));
        System.out.println(birthDate.substring(3,5));

        String newDate = String.join("/","25","11","1982");
        System.out.println(newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1928");
        System.out.println(newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println(newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replace("2","two"));
        System.out.println(newDate.replaceFirst("2","two"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-4));
        System.out.println("-".repeat(20));
    }
}
