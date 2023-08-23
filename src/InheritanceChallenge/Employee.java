package InheritanceChallenge;

/*
public class Employee extends Worker{

    private String employeeId;
    private String hireDate;

    public Employee(String name,String birthDate, String endDate,String employeeId,String hireDate){
        super(name,birthDate,endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}


class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    SalariedEmployee(String name,String birthDate,String endDate,String employeeId,String hireDate, double annualSalary,boolean isRetired){
        super(name,birthDate,endDate,employeeId,hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    public void retire(){
        this.isRetired = true;
        System.out.println("Employee is retired");
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
*/

public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.hireDate = hireDate;
        this.employeeId = Employee.employeeNo++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}