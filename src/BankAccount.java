public class BankAccount {

    private int accNum;
    private double accBalance;
    private String customerName;
    private String email;
    private int phoneNum;

    public void getAccNum(){
        System.out.println(this.accNum);
    }
    public void getAccBalance(){
        System.out.println(this.accBalance);
    }
    public void getCustomerName(){
        System.out.println(customerName);
    }
    public void getEmail(){
        System.out.println(this.email);
    }
    public void getPhoneNum(){
        System.out.println(this.phoneNum);
    }

    public void setAccNum(int accNum){
        this.accNum = accNum;
    }
    public void setAccBalance(int accBalance){
        this.accBalance = accBalance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
    this.email = email;

    }
    public void setPhoneNum(int phoneNum){
        this.phoneNum = phoneNum;
    }

    public void withdraw(int amount){
        if(this.accBalance - amount < 0) return;
        System.out.println("Withdrew  " + amount);
        this.accBalance -= amount;
    }
    public void deposit(int amount){
        System.out.println("Deposited " + amount);
        this.accBalance += amount;
    }
}
