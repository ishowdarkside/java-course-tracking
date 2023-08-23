package InheritanceChallenge;

/*
public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name,String birthDate,String endDate){
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }
    private int getAge(){
        return 2023 - Integer.parseInt(this.birthDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    private void collectPay(){
        System.out.println("Pay collected!");

    }
}




*/

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;


    public Worker(){};

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int currentYear = 2023;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return currentYear - birthYear;
    }


    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}