public class Customer  {

    private String name;
    private double creditLimit;
    private String email;

    //Constructors
    public Customer(String name,double creditLimit,String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(){
        this("ajdin@gmail.com","Ajdin");
    }

    public Customer(String email,String name){
        this(name,500,email);
    }

    public String getName(){
        return (this.name);
    }

    public double getCreditLimit(){
        return (this.creditLimit);
    }

    public String getEmail(){
        return (this.email);
    }
}
