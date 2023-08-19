public class MainOOP {

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setEmail("ajdin.omerovicc.ets@gmail.com");
        acc.setPhoneNum(061055341);
        acc.setAccNum(15151);
        acc.setCustomerName("Ajdin");

        acc.deposit(50);
        acc.withdraw(15155);
        acc.getAccBalance();
        acc.getCustomerName();
    }
}
