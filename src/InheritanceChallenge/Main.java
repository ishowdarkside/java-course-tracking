package InheritanceChallenge;

public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim","11/11/1985","01//01/2020");
        System.out.println(tim);
        System.out.println(tim.getAge());


        SalariedEmployee joe = new SalariedEmployee("Joe","11/11/1990",
                "03/03/2020",35000);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's pensino check = $" + joe.collectPay());
    }
}
